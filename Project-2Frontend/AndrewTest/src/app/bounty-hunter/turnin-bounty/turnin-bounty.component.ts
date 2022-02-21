import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Bounty } from 'src/app/objects/bounty-object';
import { BountyService } from 'src/app/services/bounty.service';
import { BountyHunterComponent } from '../bounty-hunter.component';

@Component({
  selector: 'app-turnin-bounty',
  templateUrl: './turnin-bounty.component.html',
  styleUrls: ['./turnin-bounty.component.css']
})
export class TurninBountyComponent implements OnInit {


bountyForm = new FormGroup({
    criminalfk: new FormControl(''),
    turninid: new FormControl('')
  })
ngOnInit(): void {

  }

  constructor(private router: Router, private bServ: BountyService, private bhcomp: BountyHunterComponent) { }


  public turninBounty(bountyf: FormGroup){
    let userlog = JSON.parse(localStorage.getItem("loggedUser")||'{}')
    let bountystring = JSON.stringify(bountyf);
    let bounty = new Bounty(bountystring);
    bounty.userfk = userlog.huntername;
    
    
    console.log(bounty);

    this.bServ.SubmitBounty(bounty).subscribe(
      error => {
        console.warn("bad turnin")
      }
    )

  }

}
