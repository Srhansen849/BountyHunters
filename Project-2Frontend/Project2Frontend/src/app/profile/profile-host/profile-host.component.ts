import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Bounty } from 'src/app/bounty/objects/bounty-object';
import { Criminal } from 'src/app/bounty/objects/criminal-object';
import { ProfileService } from '../profile.service';

@Component({
  selector: 'app-profile-host',
  templateUrl: './profile-host.component.html',
  styleUrls: ['../profile.component.css']
})
export class ProfileHostComponent implements OnInit {

  isTitle = true;
  isEditable = false;

  bountyList: Bounty[] = [];
  criminalList: Criminal[] = [];


  constructor(private pServ: ProfileService, private router: Router, private actRoute: ActivatedRoute) { }

  ngOnInit(): void {
    let host = JSON.parse(localStorage.getItem("loggedUser"));
    console.log(host);
    if (!host) {
      this.router.navigate(["/login"]);
    }

    this.pServ.getAllPastBounty().subscribe(
      response => {
        console.log(response);
        let tempHostList = this.bountyList.filter(
          (bounty: Bounty) => {
            return bounty.hostid == host.hostid;
          }
        );
        tempHostList = response;
      }
    );

    this.pServ.getAllBounty().subscribe(
      response => {
        console.log(response);
        let tempHostList = this.bountyList.filter(
          (bounty: Bounty) => {
            return bounty.hostid == host.hostid;
          }
        );
        tempHostList = response;
      }
    );

  }

}
