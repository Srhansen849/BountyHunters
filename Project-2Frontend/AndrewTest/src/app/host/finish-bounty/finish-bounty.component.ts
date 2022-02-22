import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
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

  constructor(private bServ: BountyService, private router: Router, private actRoute: ActivatedRoute) { }

  ngOnInit(): void {
  }

  public confirmBounty(bounty: FormGroup){
    let stringbounty = JSON.stringify(bounty);
    this.bServ.FinishBounty(stringbounty).subscribe();
  }

}
