import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, FormGroupDirective } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Bounty } from 'src/app/objects/bounty-object';
import { Criminal } from 'src/app/objects/criminal-object';
import { Host } from 'src/app/objects/host-object';
import { BountyService } from 'src/app/services/bounty.service';
import { HostComponent } from '../host.component';

@Component({
  selector: 'app-new-bounty',
  templateUrl: './new-bounty.component.html',
  styleUrls: ['./new-bounty.component.css']
})
export class NewBountyComponent implements OnInit {

  bountyForm = new FormGroup({
    statusid: new FormControl(''),
    amount: new FormControl(''),
    currency: new FormControl(''),
    time: new FormControl(''),
    preferid: new FormControl(''),

    criminalfk: new FormGroup({
      crimname: new FormControl(''),
      species: new FormControl(''),
      height: new FormControl(''),
      weight: new FormControl('')
    })
  })

  constructor(private bServ: BountyService, private router: Router, private actRoute: ActivatedRoute, private hcomp: HostComponent) { }

  submitBounty(fbounty: FormGroup) {
    let bounty = new Bounty(fbounty.value)
    let loggedHost = new Host(JSON.parse("loggedHost"))
    bounty.hostfk = loggedHost;
    let criminal = new Criminal();
    criminal.crimname = this.bountyForm.get("criminalfk")?.get("crimname")?.value
    criminal.height = this.bountyForm.get("criminalfk")?.get("height")?.value
    criminal.weight = this.bountyForm.get("criminalfk")?.get("weight")?.value
    criminal.species = this.bountyForm.get("criminalfk")?.get("species")?.value
    bounty.activeid = "Active"

    console.log(bounty);
    this.bServ.createNewBounty(JSON.stringify(bounty));


  }
  

  cancelBounty(){
    this.hcomp.newbounty = false;
  }


  ngOnInit(): void {
  }

}
