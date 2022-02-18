import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { BountyService } from '../bounty.service';

@Component({
  selector: 'app-register-bounty',
  templateUrl: './register-bounty.component.html',
  styleUrls: ['../bounty.component.css']
})
export class RegisterBountyComponent implements OnInit {

  bountyForm = new FormGroup({
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
 //   this.bountyServ.createNewBounty(stringbounty);
    
  }


  constructor(private bServ:BountyService, private router:Router, private actRoute:ActivatedRoute) { }

  ngOnInit(): void {
  }

}
