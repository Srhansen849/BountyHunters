import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EditProfileComponent } from './edit-profile/edit-profile.component';

@Component({
  selector: 'app-bounty-hunter',
  templateUrl: './bounty-hunter.component.html', 
  styleUrls: ['./bounty-hunter.component.css']
})
export class BountyHunterComponent implements OnInit {

  public bhprofile = false;

  public actbountlist = true;

  public turnin = false;

  public profile(){
    this.bhprofile = true;
    this.actbountlist = false;
    this.turnin = false;
  }

  public submitBounty(){
    this.bhprofile = false;
    this.actbountlist = false;
    this.turnin = true;
  }

  public home(){
    this.bhprofile = false;
    this.actbountlist = true;
    this.turnin = false;
  }

  public logout(){
    localStorage.removeItem("loggedUser");
    this.route.navigate(['./login'])
  }

  constructor(public route: Router) { }
  // public eBHProfile: EditProfileComponent

  ngOnInit(): void {
  }

}
