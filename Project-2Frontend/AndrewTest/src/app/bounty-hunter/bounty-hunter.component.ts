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

  public actbountlist = true;

  public submit = false;

  public finbountlist = false;
  
  public profile(){
    this.bhprofile = true;
    this.actbountlist = false;
    this.submit = false;
  }

  public submitBounty(){
    this.submit = true;
    this.bhprofile = false;
    this.actbountlist = false;
  }

  public home(){
    this.bhprofile = false;
    this.actbountlist = true;
    this.submit = false;
  }

  user = new User();

  constructor(private router: Router, private uServ: UserService) { }
  // public eBHProfile: EditProfileComponent


  ngOnInit(): void {
    let userlog = JSON.parse(localStorage.getItem("loggedUser") || '{}');
    this.user = userlog;
    // localStorage.setItem("loggedUser", JSON.stringify(this.getUser(userlog)));
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
