import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Bounty } from 'src/app/objects/bounty-object';
import { BountyService } from 'src/app/services/bounty.service';

@Component({
  selector: 'app-pending-bounty-list',
  templateUrl: './pending-bounty-list.component.html',
  styleUrls: ['./pending-bounty-list.component.css']
})
export class PendingBountyListComponent implements OnInit {

  bountyList: Bounty[] = [];

  isVisable = true;

  toggleTable() {
    console.log("button click");
    this.isVisable = !this.isVisable;
  }

  constructor(private bServ: BountyService, private actroute: ActivatedRoute, private route: Router) { }

  ngOnInit(): void {
    let hostlog = JSON.parse(localStorage.getItem("loggedHost") || '{}')
    this.bServ.getAllActiveBounty().subscribe(
      response => {
        console.log(response);
        this.bountyList = response;
        let tempHostList = this.bountyList.filter(
          (bounty: Bounty) => {
            return bounty.hostfk == hostlog.hostname;
          }
        );
        tempHostList = response;
      }
    );
  }


}
