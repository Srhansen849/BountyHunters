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

  

  constructor(public router: Router, public uServ: UserService, private actRoute:ActivatedRoute) { }

  ngOnInit(): void {
    // localStorage.removeItem("loggedUser");
  }




  // public userlogin(userForm: FormGroup) {
  //   let user = new User(userForm.get("uusername").value, userForm.get("upassword").value);
  //   localStorage.setItem("loggedUser", JSON.stringify(user));
  //   console.log(user);

  //   this.uServ.bountyHunterLogin(user).subscribe(
  //     response => {
  //       console.log(response);
  //       this.wronglogin = false;
  //       this.router.navigate(['./bounty-hunter']);

  //     },
  //     error => {
  //       console.warn("wrong credentials");
  //       this.wronglogin = true;
  //     }
  //   )


  // }

  
}

