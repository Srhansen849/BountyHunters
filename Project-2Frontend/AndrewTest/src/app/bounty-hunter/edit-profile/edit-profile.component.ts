import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
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
    upassword: new FormControl('')
  })


  

  constructor(private uServ: UserService, private router: Router, private actRoute: ActivatedRoute, public bhcomp: BountyHunterComponent) { }

  





    
  public editProfile(){
    this.bhcomp.bhprofile = false;
}

profuser = new User();


ngOnInit(): void {
  
  let user = JSON.parse(localStorage.getItem("loggedUser")||'{}')
  this.profuser = user;
  this.uServ.getProfileInfo(this.profuser)
}


toggleEdit() {
  console.log("button click");
  this.isEditable = !this.isEditable;
  this.isTitle = !this.isTitle;
}

  public submitProfile(profile: FormGroup) {

    let user = JSON.parse(localStorage.getItem("loggedUser")||'{}')
    let stringprof = JSON.stringify(profile.value)
    let bhunter = new User(stringprof);
    bhunter.uusername = user.uusername;



  this.uServ.updateProfile(bhunter).subscribe(
      response =>
      console.log(response)
  )

  this.bhcomp.bhprofile = false;

}

}

