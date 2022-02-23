import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Bounty } from 'src/app/objects/bounty-object';
import { Criminal } from 'src/app/objects/criminal-object';
import { BountyService } from 'src/app/services/bounty.service';
import { HostComponent } from '../host.component';

@Component({
  selector: 'app-finish-bounty',
  templateUrl: './finish-bounty.component.html',
  styleUrls: ['./finish-bounty.component.css']
})
export class FinishBountyComponent implements OnInit {

  bountyForm = new FormGroup({
      amount: new FormControl('', Validators.required),
    criminalfk: new FormGroup({
      crimname: new FormControl('', Validators.required)
    })
  });

  constructor(private bServ: BountyService, private router: Router, private actRoute: ActivatedRoute, private hcomp: HostComponent) { }

  ngOnInit(): void {
  }

  public confirmBounty(bounty: FormGroup){
    let bount = new Bounty()
    let criminal = new Criminal();
    criminal.crimname = bounty.get("criminalfk")?.get("crimname")?.value
    bount.criminalfk = criminal;
    bount.activeid = "Completed"
    bount.amount = bounty.get("amount")?.value
    this.bServ.FinishBounty(JSON.stringify(bount)).subscribe();
    this.hcomp.finishbounty = false;
  }


  CancelConfirm(){
    this.hcomp.finishbounty = false;
  }


}

