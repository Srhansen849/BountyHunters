import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Bounty } from 'src/app/objects/bounty-object';
import { Criminal } from 'src/app/objects/criminal-object';
import { Host } from 'src/app/objects/host-object';
import { User } from 'src/app/objects/user-object';
import { BountyService } from 'src/app/services/bounty.service';
import { BountyHunterComponent } from '../bounty-hunter.component';

@Component({
  selector: 'app-turnin-bounty',
  templateUrl: './turnin-bounty.component.html',
  styleUrls: ['./turnin-bounty.component.css']
})
export class TurninBountyComponent implements OnInit {


bountyForm = new FormGroup({
    turninid: new FormControl(''),
    criminalfk: new FormGroup({
      crimname: new FormControl('')
    })
})
ngOnInit(): void {

  }

  constructor(private router: Router, private bServ: BountyService, private bhcomp: BountyHunterComponent, private bount: Bounty) { }


  public turninBounty(bountyf: FormGroup){
    let userlog = JSON.parse(localStorage.getItem("loggedUser")||'{}')
    let bountystring = JSON.stringify(bountyf);
    let crim = new Criminal(this.bountyForm.get("criminalfk")?.get("crimname")?.value);
    this.bount.criminalfk = crim;
    this.bount.turninid = this.bountyForm.get("turninid")?.value
    let user = new User(this.bhcomp.getUser)


    let bounty = new Bounty(bountystring, crim);
    bounty.userfk = userlog;
    
    
    console.log(bounty);

    this.bServ.SubmitBounty(bounty).subscribe(
      error => {
        console.warn("bad turnin")
      }
    )

  }

}
