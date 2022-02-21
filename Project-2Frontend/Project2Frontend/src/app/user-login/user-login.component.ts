
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { User } from './user';
import { Router } from '@angular/router';
import { UserLoginService } from './user-login.service';


@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent implements OnInit {

  userForm = new FormGroup({
    username: new FormControl(``),
    password: new FormControl(``),
  });

    isHunter = false;
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

  constructor(public router: Router, public uServ: UserLoginService) { }

  ngOnInit(): void {
    localStorage.removeItem("loggedUser");
  }

  public login(userForm: FormGroup) {
    let user = new User(userForm.get("username").value, userForm.get("password").value);
    localStorage.setItem("loggedUser", JSON.stringify(user));
    console.log(user);

    // if a user is returned navigate to the next component you want, otherwise notify the user
    if (this.isHunter) {
      this.router.navigate(['./profile-host']);
      //this.uServ.bHunterLogin(JSON.stringify(user)).subscribe(
      // response => {
      //   console.log(response);
      //   this.router.navigate(['profile-host']);
      // },
      // error => {
      //   console.log("login failed");
      // }
      //);
    } else if (this.isHost) {
      this.router.navigate(['/profile/profile-host']);
    }
  }
}



