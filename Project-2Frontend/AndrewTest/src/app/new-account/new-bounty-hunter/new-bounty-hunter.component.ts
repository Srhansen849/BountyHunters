import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-new-bounty-hunter',
  templateUrl: './new-bounty-hunter.component.html',
  styleUrls: ['./new-bounty-hunter.component.css']
})
export class NewBountyHunterComponent implements OnInit {

  userForm = new FormGroup({
    uusername: new FormControl(''),
    password: new FormControl(''),
    huntername: new FormControl(''),
    uemail: new FormControl('')
  });

  ngOnInit(): void {
  }

  constructor(private router:Router, private uServ: UserService) { }

  public newUser(newuser: FormGroup) {
    let user = JSON.stringify(newuser);
    console.log(user);
    
    this.uServ.createNewUser(user).subscribe(
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