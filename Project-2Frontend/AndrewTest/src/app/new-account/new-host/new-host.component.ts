import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Host } from 'src/app/objects/host-object';
import { HostService } from 'src/app/services/host.service';

@Component({
  selector: 'app-new-host',
  templateUrl: './new-host.component.html',
  styleUrls: ['./new-host.component.css']
})
export class NewHostComponent implements OnInit {

  hostForm = new FormGroup({
    husername: new FormControl('', Validators.required),
    hpassword: new FormControl('', Validators.required),
    hostname: new FormControl('', Validators.required),
    hemail: new FormControl('', Validators.required),
    representative: new FormControl(''),
    hassociation: new FormControl('')
  });

  ngOnInit(): void {
  }

  constructor(private router:Router, private hServ: HostService) { }

  public newHost(newhost: FormGroup) {
    let host = new Host();
    host.husername = newhost.get("husername")?.value;
    host.hpassword = newhost.get("hpassword")?.value;
    host.hostname = newhost.get("hostname")?.value;
    host.hemail = newhost.get("hemail")?.value;
    host.representative = newhost.get("representative")?.value;
    host.hassociation = newhost.get("hassociation")?.value;
    console.log(host);
    
    this.hServ.createNewHost(JSON.stringify(host)).subscribe(
      response => {
        console.log(response);
        this.router.navigate(['./login']);

      },
      error => {
        console.warn("wrong credentials");
      }
    )

  }
}