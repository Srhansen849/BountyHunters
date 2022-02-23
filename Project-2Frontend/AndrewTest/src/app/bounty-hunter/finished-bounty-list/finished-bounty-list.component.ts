import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Bounty } from 'src/app/objects/bounty-object';
import { User } from 'src/app/objects/user-object';
import { BountyService } from 'src/app/services/bounty.service';
import { UserService } from 'src/app/services/user.service';
import { BountyHunterComponent } from '../bounty-hunter.component';

@Component({
  selector: 'app-finished-bounty-list',
  templateUrl: './finished-bounty-list.component.html',
  styleUrls: ['./finished-bounty-list.component.css']
})
export class FinishedBountyListComponent implements OnInit {

  bountyList: Bounty[] = [];

  isVisable = true;

  toggleTable() {
    console.log("button click");
    this.isVisable = !this.isVisable;
  }
  
  constructor(private bServ: BountyService, private uServ: UserService, private actroute: ActivatedRoute, private route: Router, private bhcomp: BountyHunterComponent) { }

  ngOnInit(): void {//NEEDS TESTING 
    
    let userlog = JSON.parse(localStorage.getItem("loggedUser")||'{}')
    this.bServ.getAllCompleteBounty().subscribe(
      response => {
        console.log(response);

        this.bountyList = response;
        let tempList = this.bountyList.filter(
          (bounty:Bounty) =>{
            return bounty.userfk == userlog.huntername;
          }
        )
        tempList = response;
      }
    );
  }
}
