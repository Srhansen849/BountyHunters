
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { User } from './user';
import { Router } from '@angular/router';


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

  constructor(public router: Router) { }

  ngOnInit(): void {
    localStorage.removeItem("loggedUser");
  }

  public login(userForm:FormGroup){
    let user = new User(userForm.get("username").value, userForm.get("password").value);
    localStorage.setItem("loggedUser", JSON.stringify(user));
    console.log(user);

    

    // if a user is returned navigate to the next component you want, otherwise notify the user
    // if (user.id='hunterlogin') {
    //   this.router.navigate(['/profile']);
    // } 
    // else if (user.id='hostlogin') {
    //   this.router.navigate(['/businessprofile']);
    // }
    // else {

    }
}


