
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { User } from "../bounty/objects/user-object";
import { Host } from "../bounty/objects/host-object";
import { ActivatedRoute, Router } from '@angular/router';
import { UserLoginService } from './user-login.service';


@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent implements OnInit {

  wronglogin = false;

  userForm = new FormGroup({
    username: new FormControl(``),
    password: new FormControl(``),
  });

  hostForm = new FormGroup({
    username: new FormControl(``),
    password: new FormControl(``),
  });

  isHunter = true;
  isHost = false;

  public hunterButton() {
    this.isHunter = true;
    this.isHost = false;
    console.log("Hunter Button");
  }

  public hostButton() {
    this.isHost = true;
    this.isHunter = false;
    console.log("Host Button");
  }

  constructor(public router: Router, public uServ: UserLoginService, private actRoute:ActivatedRoute) { }

  ngOnInit(): void {
    localStorage.removeItem("loggedUser");
    document.getElementById("user_login");
  }

  public userlogin(userForm: FormGroup) {
    let user = new User(userForm.get("username").value, userForm.get("password").value);
    localStorage.setItem("loggedUser", JSON.stringify(user));
    console.log(user);
    

    this.uServ.bHunterLogin(user).subscribe(
      response => {
        console.log(response);
        this.wronglogin = false;
        this.router.navigate(['./homepage-user']);

      },
      error => {
        console.warn("the wrong credentials");
        this.wronglogin = true;
      }
    )


  }

  public hostlogin(hostForm: FormGroup) {
    let host = new Host(hostForm.get("username").value, hostForm.get("password").value);
    localStorage.setItem("loggedUser", JSON.stringify(host));
    console.log(host);

    this.uServ.bOwnerLogin(host).subscribe(
      response => {
        console.log(response);
        this.router.navigate(['./homepage-host']);
        this.wronglogin = false;
      },
      error => {
        console.warn("the wrong credentials");
        this.wronglogin = true;
      }
    )
  }
}


