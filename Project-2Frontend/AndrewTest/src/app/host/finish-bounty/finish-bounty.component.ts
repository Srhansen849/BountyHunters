import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Bounty } from 'src/app/objects/bounty-object';
import { Criminal } from 'src/app/objects/criminal-object';
import { User } from 'src/app/objects/user-object';
import { BountyService } from 'src/app/services/bounty.service';

@Component({
  selector: 'app-finish-bounty',
  templateUrl: './finish-bounty.component.html',
  styleUrls: ['./finish-bounty.component.css']
})
export class FinishBountyComponent implements OnInit {

  bountyForm = new FormGroup({
      amount: new FormControl('')
  });

  criminaldata = new Criminal();
  bountydata = new Bounty();
  hunterdata = new User();

  constructor(private bServ: BountyService, private router: Router, private actRoute: ActivatedRoute) { }

  ngOnInit(): void {
  }

  public confirmBounty(fbounty: FormGroup){
    let bounty = new Bounty(fbounty.value);
    this.bServ.FinishBounty(JSON.stringify(bounty), fbounty.get("amount")?.value)
  }

  

}

