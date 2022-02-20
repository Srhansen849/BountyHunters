import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Bounty } from 'src/app/objects/bounty-object';
import { BountyService } from 'src/app/services/bounty.service';


@Component({
  selector: 'app-active-bounty-list',
  templateUrl: './active-bounty-list.component.html',
  styleUrls: ['./active-bounty-list.component.css']
})
export class ActiveBountyListComponent implements OnInit {

  bountyList: Bounty[] = [];
  
  constructor(private bServ: BountyService, private actroute: ActivatedRoute, private route: Router) { }

  ngOnInit(): void {
    this.bServ.getAllActiveBounty().subscribe(
      response => {
        console.log(response);
        this.bountyList = response;
      }
    );
  }








}
