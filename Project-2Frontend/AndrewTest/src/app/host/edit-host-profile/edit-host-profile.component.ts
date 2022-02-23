import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { Host } from 'src/app/objects/host-object';
import { HostService } from 'src/app/services/host.service';
import { HostComponent } from '../host.component';

@Component({
  selector: 'app-edit-host-profile',
  templateUrl: './edit-host-profile.component.html',
  styleUrls: ['./edit-host-profile.component.css']
})
export class EditHostProfileComponent implements OnInit {



  loggedhost = new Host()
  ngOnInit(): void {
    this.loggedhost = JSON.parse(localStorage.getItem("loggedHost") || '{}')
  }
  hostForm = new FormGroup({
    husername: new FormControl(this.loggedhost.husername),
    hpassword: new FormControl(this.loggedhost.hpassword),
    hemail: new FormControl(this.loggedhost.hemail),
    representative: new FormControl(this.loggedhost.representative),
    hassociation: new FormControl(this.loggedhost.hassociation)
  });
  constructor(private router: Router, private hServ: HostService, private hcomp: HostComponent) { }

  public updateHost(uphost: FormGroup) {
    let hostlog = JSON.parse(localStorage.getItem("loggedHost") || '{}')
    let host = new Host(uphost.value)
    host.hostname = hostlog.hostname;

    console.log(host);

    this.hServ.updateProfile(JSON.stringify(host)).subscribe(
      error => {
        console.warn("wrong credentials");
      }
    )
    this.hcomp.hostprofedit = false;

  }

  cancelProfile() {
    this.hcomp.hostprofedit = false;
  }
}