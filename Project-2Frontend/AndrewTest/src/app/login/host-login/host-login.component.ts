import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Host } from 'src/app/objects/host-object';
import { HostService } from 'src/app/services/host.service';

@Component({
  selector: 'app-host-login',
  templateUrl: './host-login.component.html',
  styleUrls: ['./host-login.component.css']
})
export class HostLoginComponent implements OnInit {

  wronglogin = false;

  hostForm = new FormGroup({
    husername: new FormControl(''),
    hpassword: new FormControl('')
  });



  constructor(public router: Router, public hServ: HostService, private actRoute: ActivatedRoute) { }

  ngOnInit(): void {
    localStorage.removeItem("loggedHost");
    localStorage.removeItem("loggedUser");
  }

  public hostlogin(hostF: FormGroup) {
    // let host = new Host(hostF.get("husername")?.value, hostF.get("hpassword")?.value);
    this.hServ.HostLogin(JSON.stringify(hostF.value)).subscribe(
      response => {
        this.wronglogin = false;
        localStorage.setItem("loggedHost", JSON.stringify(response));
        this.router.navigate(['./host']);

      },
      error => {
        console.warn("wrong credentials");
        this.wronglogin = true;
      }
    )

  }

}
