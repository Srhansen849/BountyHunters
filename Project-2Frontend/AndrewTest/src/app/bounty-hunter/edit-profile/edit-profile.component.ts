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

  profileForm = new FormGroup({
    huntername: new FormControl(''),
    uemail: new FormControl(''),
    password: new FormControl('')
  })

  constructor(private uServ: UserService, private router: Router, private actRoute: ActivatedRoute, public bhcomp: BountyHunterComponent) { }

  public cancelProfile() {
    this.bhcomp.bhprofile = false;
    this.bhcomp.actbountlist = true;
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
    let user = JSON.parse(localStorage.getItem("loggedUser")||'{}')
    let stringprofile = JSON.stringify(profile.value);
    console.log(profile.value);
    let bhunter = new User(stringprofile);
    this.uServ.updateProfile(stringprofile).subscribe(

    )
  }

  // public submitFood(food: FormGroup){
  //   let stringFood = JSON.stringify(food.value);
  //   this.foodServ.insertFood(stringFood).subscribe(
  //     response => {
  //       this.foodExists=false;
  //       console.log(response);
  //       this.foodList.push(response);
  //     },
  //     error => {
  //       console.warn("that food already exists");
  //       this.foodExists=true;
  //     }
  //   );
  // }


}

