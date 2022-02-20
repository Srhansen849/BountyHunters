import { Component, OnInit } from '@angular/core';
import { EditProfileComponent } from './edit-profile/edit-profile.component';

@Component({
  selector: 'app-bounty-hunter',
  templateUrl: './bounty-hunter.component.html', 
  styleUrls: ['./bounty-hunter.component.css']
})
export class BountyHunterComponent implements OnInit {

  public bhprofile = false;

  public actbountlist = true;

  public editBHProfile(){

    // this.eBHProfile.bhprofile = true;

    this.bhprofile = true;
    this.actbountlist = false;
  }

  constructor() { }
  // public eBHProfile: EditProfileComponent

  ngOnInit(): void {
  }

}
