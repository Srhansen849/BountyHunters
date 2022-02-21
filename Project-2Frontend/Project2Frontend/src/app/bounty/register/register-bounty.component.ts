import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { BountyService } from '../bounty.service';
import { Bounty } from '../objects/bounty-object';
import { Criminal } from '../objects/criminal-object';


@Component({
  selector: 'app-register-bounty',
  templateUrl: './register-bounty.component.html'
})
export class RegisterBountyComponent implements OnInit {

  

  bountyForm = new FormGroup({
    statusid: new FormControl(''),
    capture: new FormControl(''),
    amount: new FormControl(''),
    currency: new FormControl(''),
    time: new FormControl(''),
    preferid: new FormControl('')
  })

  criminalForm = new FormGroup({
    firstname: new FormControl(''),
    lastname: new FormControl(''),
    codename: new FormControl('')
  })

  submitBounty(bounty:FormGroup, cimainal:FormGroup){
    //let stringbounty = JSON.stringify(bounty.value)
    // criminal = new Criminal();
    // bounty = new Bounty(bounty.get("capture").value, );

    // console.log(bounty.value);
    // this.bountyServ.createNewBounty(stringbounty);
    
  }

 

  constructor(private bountyServ:BountyService, private router: Router, private actRoute:ActivatedRoute) { }




  ngOnInit(): void {
    let user = JSON.parse(localStorage.getItem("loggedUser"));
    console.log(user);
    if(!user){
      this.router.navigate(["/login"]);
    }
  }

}

