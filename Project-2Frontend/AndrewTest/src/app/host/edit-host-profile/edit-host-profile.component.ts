import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { HostService } from 'src/app/services/host.service';

@Component({
  selector: 'app-edit-host-profile',
  templateUrl: './edit-host-profile.component.html',
  styleUrls: ['./edit-host-profile.component.css']
})
export class EditHostProfileComponent implements OnInit {

  hostForm = new FormGroup({
    husername: new FormControl(''),
    hpassword: new FormControl(''),
    hemail: new FormControl(''),
    representative: new FormControl(''),
    association: new FormControl('')
  });

  ngOnInit(): void {
  }

  constructor(private router:Router, private hServ: HostService, private actRoute: ActivatedRoute) { }

  public updateHost(uphost: FormGroup) {
    let hostlog = JSON.parse(localStorage.getItem("loggedHost")||'{}')
    let host = JSON.stringify(uphost);

    console.log(host);
    
    this.hServ.updateProfile(host).subscribe(
       error => {
        console.warn("wrong credentials");
      }
    )

  }
}