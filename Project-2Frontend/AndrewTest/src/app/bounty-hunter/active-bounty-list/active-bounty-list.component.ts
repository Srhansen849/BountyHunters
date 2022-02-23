import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Bounty } from 'src/app/objects/bounty-object';
import { BountyService } from 'src/app/services/bounty.service';
import { BountyHunterComponent } from '../bounty-hunter.component';


@Component({
  selector: 'app-active-bounty-list',
  templateUrl: './active-bounty-list.component.html',
  styleUrls: ['./active-bounty-list.component.css']
})
export class ActiveBountyListComponent implements OnInit {

  bountyList: Bounty[] = [];

  isVisable = true;

  toggleTable() {
    console.log("button click");
    this.isVisable = !this.isVisable;
  }

  
  constructor(private bServ: BountyService, private actroute: ActivatedRoute, private route: Router, private bhcomp: BountyHunterComponent) { }

  ngOnInit(): void {
    this.bServ.getAllActiveBounty().subscribe(
      response => {
        console.log(response);
        this.bountyList = response;
      }
    );
  }

  // hideTable() {
  //   this.bhcomp.actbountlist = false;
  // }
}
