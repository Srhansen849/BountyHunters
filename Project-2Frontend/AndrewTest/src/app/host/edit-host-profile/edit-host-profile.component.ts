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

  hostForm = new FormGroup({
    husername: new FormControl(''),
    hpassword: new FormControl(''),
    hemail: new FormControl(''),
    representative: new FormControl(''),
    association: new FormControl('')
  });

  loggedhost = new Host()
  ngOnInit(): void {
    this.loggedhost = JSON.parse(localStorage.getItem("loggedHost")||'{}')
  }

  constructor(private router:Router, private hServ: HostService, private hcomp: HostComponent) { }

  public updateHost(uphost: FormGroup) {
    let hostlog = new Host(JSON.parse(localStorage.getItem("loggedHost")||'{}'))
    let host = new Host(uphost.value)
    host.husername = hostlog.husername;

    console.log(host);
    
    this.hServ.updateProfile(JSON.stringify(host)).subscribe(
       error => {
        console.warn("wrong credentials");
      }
    )

  }

  cancelProfile(){
    this.hcomp.hostprofedit = false;
  }
}