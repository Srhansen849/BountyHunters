import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Host } from '../objects/host-object';
import { HostService } from '../services/host.service';

@Component({
  selector: 'app-host',
  templateUrl: './host.component.html',
  styleUrls: ['./host.component.css']
})
export class HostComponent implements OnInit {



  public newbounty = false;

  public hostprofedit = false;

  public finishbounty = false;

  public hostblist = false;

  public pendblist = false;


  constructor(private router: Router, private hServ: HostService) { }

  ngOnInit(): void {
    let hostlog = JSON.parse(localStorage.getItem("loggedHost") || '{}')
    console.log(hostlog);
    localStorage.setItem("loggedHost", JSON.stringify(this.getHost(hostlog)));
    if (!hostlog) {
      this.router.navigate(["/login"]);
    }
  }

  public getHost(hostlog: Host) {
    this.hServ.getProfileInfo(hostlog);
  }

  editProfile(){
    this.hostprofedit = true;
  }

  PastBounties(){
    this.hostblist = true;
  }

  FinishBounty(){
    this.finishbounty = true;
  }

  logout(){
    localStorage.removeItem("loggedHost")
    this.router.navigate(['./login'])
  }

}
