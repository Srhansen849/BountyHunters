import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { Bounty } from '../bounty-object';
import { BountyService } from '../bounty.service';
import { Criminal } from '../criminal-object';

@Component({
  selector: 'app-register-bounty',
  templateUrl: './register-bounty.component.html',
  styleUrls: ['./register-bounty.component.css']
})
export class RegisterBountyComponent implements OnInit {


  bounty = new FormGroup({
    statusid: new FormControl(''),
    capture: new FormControl(''),
    amount: new FormControl(''),
    currency: new FormControl(''),
    time: new FormControl(''),
    preferid: new FormControl(''),
      criminal: new FormGroup({
        firstname: new FormControl(''),
        lastname: new FormControl(''),
        codename: new FormControl('')
    })

  })

  submitBounty(bounty:FormGroup){
    let stringbounty = JSON.stringify(bounty.value)
    console.log(bounty.value)
    this.bountyServ.createNewBounty(stringbounty);
    
  }

 

  constructor(private bountyServ:BountyService, private router: Router) { }




  ngOnInit(): void {
  }

}
