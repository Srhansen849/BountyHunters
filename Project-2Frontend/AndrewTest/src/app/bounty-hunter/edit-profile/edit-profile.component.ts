import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Bounty } from 'src/app/objects/bounty-object';
import { User } from 'src/app/objects/user-object';
import { UserService } from 'src/app/services/user.service';
import { BountyHunterComponent } from '../bounty-hunter.component';

@Component({
  selector: 'app-edit-profile',
  templateUrl: './edit-profile.component.html',
  styleUrls: ['./edit-profile.component.css']
})
export class EditProfileComponent implements OnInit {

  isTitle = true;
  isEditable = false;

  profuser = new User();

  profileForm = new FormGroup({
    huntername: new FormControl(this.profuser.huntername),
    uemail: new FormControl(this.profuser.uemail),
    upassword: new FormControl(this.profuser.upassword)
  })

  constructor(private uServ: UserService, private router: Router, private actRoute: ActivatedRoute, public bhcomp: BountyHunterComponent) { }

  public cancelProfile() {
    this.bhcomp.bhprofile = false;
    this.bhcomp.actbountlist = true;
  }


  ngOnInit(): void {

    let user = JSON.parse(localStorage.getItem("loggedUser") || '{}')
    this.profuser = user;
    // this.uServ.getProfileInfo(this.profuser)
  }


  toggleEdit() {
    console.log("button click");
    this.isEditable = !this.isEditable;
    this.isTitle = !this.isTitle;
  }

  public submitProfile(proform: FormGroup) {

    let user = JSON.parse(localStorage.getItem("loggedUser") || '{}')
    let stringprof = JSON.stringify(proform.value)
    // let bhunter = new User(stringprof);
    // bhunter.uusername = user.uusername;

    let puser = new User();
    puser.huntername = proform.get("huntername")?.value;
    puser.uemail = proform.get("uemail")?.value;
    puser.upassword = proform.get("upassword")?.value;
    puser.uusername = user.uusername;

    this.uServ.updateProfile(JSON.stringify(puser)).subscribe(
      response =>
        console.log(response)
    )

    // this.uServ.updateProfile(bhunter).subscribe(
    //     response =>
    //     console.log(response)
    // )

    this.bhcomp.bhprofile = false;

  }

}

