import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
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


  host = new Host();

  constructor(private router: Router, private hServ: HostService, private actRoute: ActivatedRoute) { }

  ngOnInit(): void {
    let hostlog = JSON.parse(localStorage.getItem("loggedHost") || '{}')
    console.log(hostlog);
    this.host = hostlog;
    // localStorage.setItem("loggedHost", JSON.stringify(this.getHost(hostlog)));
    if (!hostlog) {
      this.router.navigate(["/login"]);
    }
  }

  public getHost(hostlog: Host) {
    let stringhost = JSON.stringify(hostlog)
    this.hServ.getProfileInfo(stringhost);
  }

  editProfile(){
    this.hostprofedit = true;
    this.finishbounty = false;
    this.newbounty = false;
  }

  finishBounty(){
    this.hostprofedit = false;
    this.finishbounty = true;
    this.newbounty = false;
  }

  newBounty(){
    this.hostprofedit = false;
    this.finishbounty = false;
    this.newbounty = true;
  }

  logout(){
    localStorage.removeItem("loggedHost")
    this.router.navigate(['./login'])
  }

}
