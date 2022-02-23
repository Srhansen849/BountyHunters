import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Bounty } from 'src/app/objects/bounty-object';
import { Host } from 'src/app/objects/host-object';
import { BountyService } from 'src/app/services/bounty.service';

@Component({
  selector: 'app-pending-bounty-list',
  templateUrl: './pending-bounty-list.component.html',
  styleUrls: ['./pending-bounty-list.component.css']
})
export class PendingBountyListComponent implements OnInit {

  bountyList: Bounty[] = [];
  
  constructor(private bServ: BountyService, private actroute: ActivatedRoute, private route: Router) { }

  ngOnInit(): void {
  let hostlog = new Host(JSON.parse(localStorage.getItem("loggedHost")||'{}'))
    this.bServ.getAllCaughtBounty().subscribe(
      response => {
        console.log(response);
        this.bountyList = response;
           let tempHostList = this.bountyList.filter(
        (bounty: Bounty) => {
          return bounty.hostfk?.hostname == hostlog.hostname;
        }
      );
      tempHostList = response;
    }
    );
  }

  hide = true;
  hideTable(){
    this.hide = false;
  }


}
