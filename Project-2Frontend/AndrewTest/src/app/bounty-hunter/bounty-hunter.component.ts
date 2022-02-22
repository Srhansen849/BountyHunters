import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../objects/user-object';
import { UserService } from '../services/user.service';


@Component({
  selector: 'app-bounty-hunter',
  templateUrl: './bounty-hunter.component.html',
  styleUrls: ['./bounty-hunter.component.css']
})
export class BountyHunterComponent implements OnInit {

  public bhprofile = false;

  public bountyturnin = false;

  public actbountlist = true;

  public turnin = false;
  public finbountlist = false;

  public editBHProfile() {

    // this.eBHProfile.bhprofile = true;
  }
  
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
  constructor(private router: Router, private uServ: UserService) { }
  // public eBHProfile: EditProfileComponent


  ngOnInit(): void {
    let userlog = JSON.parse(localStorage.getItem("loggedUser") || '{}')
    localStorage.setItem("loggedUser", JSON.stringify(this.getUser(userlog)));
    if (!userlog) {
      this.router.navigate(["/login"]);
    }
  }

  public getUser(user: User) {
    let stringuser = JSON.stringify(user);
    return this.uServ.getProfileInfo(stringuser)
  }

  logout(){
    localStorage.removeItem("loggedUser")
    this.router.navigate(['./login'])
  }

  



}
