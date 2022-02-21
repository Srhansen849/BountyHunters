import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Bounty } from 'src/app/objects/bounty-object';
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



  profileForm = new FormGroup({
    huntername: new FormControl(''),
    uemail: new FormControl(''),
    password: new FormControl('')
  })



  constructor(private uServ: UserService, private router: Router, private actRoute: ActivatedRoute, public bhcomp: BountyHunterComponent) { }




  public editProfile() {
    this.bhcomp.bhprofile = false;
  }

  ngOnInit(): void {
    // let user = JSON.parse(localStorage.getItem("loggedUser")||'{}')
    // console.log(user);
    // if (!user) {
    //   this.router.navigate(["/login"]);
    // }
  }


  toggleEdit() {
    console.log("button click");
    this.isEditable = !this.isEditable;
    this.isTitle = !this.isTitle;
  }

  public submitProfile(profile: FormGroup) {
    let stringprofile = JSON.stringify(profile.value);
    console.log(profile.value);
    this.uServ.updateProfile(stringprofile).subscribe(

    )
  }

}

