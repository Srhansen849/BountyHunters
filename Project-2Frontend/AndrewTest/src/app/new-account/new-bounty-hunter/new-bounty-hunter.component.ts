import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from 'src/app/objects/user-object';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-new-bounty-hunter',
  templateUrl: './new-bounty-hunter.component.html',
  styleUrls: ['./new-bounty-hunter.component.css']
})
export class NewBountyHunterComponent implements OnInit {

  userForm = new FormGroup({
    uusername: new FormControl('', Validators.required),
    upassword: new FormControl('', Validators.required),
    huntername: new FormControl('', Validators.required),
    uemail: new FormControl('', Validators.required)
  });

  ngOnInit(): void {
  }

  constructor(private router:Router, private uServ: UserService) { }

  public newUser(newuser: FormGroup) {


    let user = new User();
    user.uusername = newuser.get("uusername")?.value;
    user.upassword = newuser.get("upassword")?.value;
    user.huntername = newuser.get("huntername")?.value;
    user.uemail = newuser.get("uemail")?.value;
    

    
    console.log(user);
    
    this.uServ.createNewUser(JSON.stringify(user)).subscribe(
      response => {
        console.log(response);
        this.router.navigate(['./login']);

      },
      error => {
        console.warn("wrong credentials");
      }
    )

  }
}