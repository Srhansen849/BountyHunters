import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Bounty } from 'src/app/objects/bounty-object';
import { Criminal } from 'src/app/objects/criminal-object';
import { BountyService } from 'src/app/services/bounty.service';

@Component({
  selector: 'app-finish-bounty',
  templateUrl: './finish-bounty.component.html',
  styleUrls: ['./finish-bounty.component.css']
})
export class FinishBountyComponent implements OnInit {

  bountyForm = new FormGroup({
      amount: new FormControl(''),
    criminalfk: new FormGroup({
      crimname: new FormControl('')
    })
  });

  constructor(private bServ: BountyService, private router: Router, private actRoute: ActivatedRoute) { }

  ngOnInit(): void {
  }

  public confirmBounty(bounty: FormGroup){


    let bount = new Bounty(bounty.value)
    let criminal = new Criminal();
    criminal.crimname = this.bountyForm.get("criminalfk")?.get("crimname")?.value
    bount.criminalfk = criminal;
    bount.activeid = "Completed"
    this.bServ.FinishBounty(JSON.stringify(bount)).subscribe();
  }

}

