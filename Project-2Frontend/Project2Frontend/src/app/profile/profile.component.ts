import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Bounty } from '../bounty/objects/bounty-object';
import { Criminal } from '../bounty/objects/criminal-object';
import { ProfileService } from './profile.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  isTitle = true;
  isEditable = false;

  bountyList: Bounty[] = [];
  criminalList: Criminal[] = [];

  profileForm = new FormGroup({
    firstname: new FormControl(''),
    lastname: new FormControl(''),
    codename: new FormControl(''),
    email: new FormControl(''),
    password: new FormControl(''),
    cpassword: new FormControl('')
  })

  constructor(private pServ: ProfileService, private router: Router, private actRoute: ActivatedRoute) { }

  ngOnInit(): void {
    let user = JSON.parse(localStorage.getItem("loggedUser"));
    console.log(user);
    // if (!user) {
    //   this.router.navigate(["/login"]);
    // }

    this.pServ.getAllPastBounty().subscribe(
      response => {
        console.log(response);
        let tempHostList = this.bountyList.filter(
          (bounty: Bounty) => {
            return bounty.userid == user.userid;
          }
        );
        tempHostList = response;
      }
    );

    this.pServ.getAllPrivateBounty().subscribe(
      response => {
        console.log(response);
        let tempHostList = this.bountyList.filter(
          (bounty: Bounty) => {
            return bounty.userid == user.userid;
          }
        );
        tempHostList = response;
      }
    );
  }

  toggleEdit(){
    console.log("button click");
    this.isEditable=!this.isEditable;
    this.isTitle=!this.isTitle;
  }

  public submitProfile(profile: FormGroup) {
    let stringprofile = JSON.stringify(profile.value);
    console.log(profile.value);
    this.pServ.editUserProfile(stringprofile).subscribe(

    )
  }

}