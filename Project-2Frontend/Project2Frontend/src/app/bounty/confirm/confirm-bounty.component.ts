import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Bounty } from '../objects/bounty-object';
import { BountyService } from '../bounty.service';
import { FormControl, FormGroup } from '@angular/forms';
import { NgStyle } from '@angular/common';

@Component({
  selector: 'app-confirm-bounty',
  templateUrl: './confirm-bounty.component.html',
  styleUrls: ['../bounty.component.css']
})
export class ComfirmBountyComponent implements OnInit {

  confirmBountyForm = new FormGroup({
    caputre: new FormControl(''),
    preferid: new FormControl(''),
    turninid: new FormControl(''),
    amount: new FormControl('')
  })
  userForm = new FormGroup({
    firstname: new FormControl(''),
    codename: new FormControl(''),
    lastname: new FormControl(''),
    amount: new FormControl('')
    })
  router: any;




  confirmBounty(confirm: FormGroup){

  }
  ngOnInit(): void {
    let user = JSON.parse(localStorage.getItem("loggedUser"));
    console.log(user);
    if(!user){
      this.router.navigate(["/login"]);
    }
  }

}
