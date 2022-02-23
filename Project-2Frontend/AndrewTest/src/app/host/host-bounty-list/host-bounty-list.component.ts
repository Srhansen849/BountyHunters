import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { HostLoginComponent } from 'src/app/login/host-login/host-login.component';
import { Bounty } from 'src/app/objects/bounty-object';
import { Host } from 'src/app/objects/host-object';
import { BountyService } from 'src/app/services/bounty.service';
import { HostComponent } from '../host.component';

@Component({
  selector: 'app-host-bounty-list',
  templateUrl: './host-bounty-list.component.html',
  styleUrls: ['./host-bounty-list.component.css']
})
export class HostBountyListComponent implements OnInit {

  bountyList: Bounty[] = [];
  
  constructor(private bServ: BountyService, private actroute: ActivatedRoute, private route: Router, private hcomp: HostComponent) { }

  ngOnInit(): void {
    let hostlog = new Host(JSON.parse(localStorage.getItem("loggedHost")||'{}'))
    this.bServ.getAllCompleteBounty().subscribe(
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
  // this.pServ.getAllPastBounty().subscribe(
  //   response => {
  //     console.log(response);
  //     let tempHostList = this.bountyList.filter(
  //       (bounty: Bounty) => {
  //         return bounty.uusername == userlog.uusername;
  //       }
  //     );
  //     tempHostList = response;
  //   }
  // );

  hideTable() {
    this.hcomp.pendblist = false;
  }
}
