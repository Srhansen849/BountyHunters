import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { User } from 'src/app/objects/user-object';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent implements OnInit {

  wronglogin = false;

  userForm = new FormGroup({
    uusername: new FormControl(''),
    upassword: new FormControl('')
  });

  constructor(public router: Router, public uServ: UserService, private actRoute: ActivatedRoute) { }

  ngOnInit(): void {
    localStorage.removeItem("loggedUser");
    localStorage.removeItem("loggedHost");
  }

  public userlogin(userf: FormGroup) {
    //let userstring = JSON.stringify(userForm.value);
    let user = new User(userf.get("uusername")?.value, userf.get("upassword")?.value);
    this.uServ.bountyHunterLogin(JSON.stringify(user)).subscribe(
      response => {
        console.log("response: ")
        console.log(response);
        this.wronglogin = false;
        localStorage.setItem("loggedUser", JSON.stringify(response));
        this.router.navigate(['./bountyhunter']);
      },
      error => {
        console.warn("wrong credentials");
        this.wronglogin = true;
      }
    )
  }

}