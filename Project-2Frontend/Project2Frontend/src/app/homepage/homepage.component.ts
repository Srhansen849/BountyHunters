import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Bounty } from '../bounty/objects/bounty-object';
import { Criminal } from '../bounty/objects/criminal-object';
import { User } from '../bounty/objects/user-object';
import { HomepageService } from './homepage.service';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {

  hunterList: User[] = [];
  bountyList: Bounty[] = [];
  criminalList: Criminal[] = [];

  constructor(private hServ: HomepageService, private router: Router, private actRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.hServ.getAllRankedBH().subscribe(
      response => {
        console.log(response);
        this.hunterList = response;
      }
    );
    this.hServ.getAllBounty().subscribe(
      response => {
        console.log(response);
        this.bountyList = response;
      }
    );
    this.hServ.getAllCriminal().subscribe(
      response => {
        console.log(response);
        let tempCrimList = this.criminalList.filter(
          (criminal: Criminal) => {
            (bounty: Bounty) =>{
              return criminal.criminalid == bounty.criminalid;
            }
          }
        );
        tempCrimList = response;
      }
    );

  }

}
