import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Bounty } from 'src/app/objects/bounty-object';
import { Criminal } from 'src/app/objects/criminal-object';
import { User } from 'src/app/objects/user-object';
import { BountyService } from 'src/app/services/bounty.service';
import { HostComponent } from '../host.component';

@Component({
  selector: 'app-finish-bounty',
  templateUrl: './finish-bounty.component.html',
  styleUrls: ['./finish-bounty.component.css']
})
export class FinishBountyComponent implements OnInit {

  bountyForm = new FormGroup({
    amount: new FormControl('', Validators.required)
  });

  criminaldata = new Criminal();
  bountydata = new Bounty();
  hunterdata = new User();


  constructor(private bServ: BountyService, private router: Router, private actRoute: ActivatedRoute, private hcomp: HostComponent) { }

  ngOnInit(): void {
  }

  public confirmBounty(fbounty: FormGroup) {
    let bounty = new Bounty(fbounty.value);
    bounty.activeid = "Completed";
    this.bServ.FinishBounty(JSON.stringify(bounty), fbounty.get("amount")?.value).subscribe(
      response => {

      }
    )
    this.hcomp.finishbounty = false;
  }


  // bounty.setValue({criminalfk: criminal.crimname})
  // let stringbounty = JSON.stringify(bounty);
  // let conbounty = new Bounty(stringbounty);
  // this.bServ.FinishBounty(conbounty).subscribe();


  CancelConfirm(){
    this.hcomp.finishbounty = false;
  }

}






