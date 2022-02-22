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

  

  constructor(public router: Router, public hServ: HostService, private actRoute:ActivatedRoute) { }

  ngOnInit(): void {
    localStorage.removeItem("loggedHost");
    localStorage.removeItem("loggedUser");
  }




  public hostlogin(hostForm: FormGroup) {

    let hoststring = JSON.stringify(hostForm);



    


    this.hServ.HostLogin(hoststring).subscribe(
      response => {
        console.log(response);
        localStorage.setItem("loggedHost", JSON.stringify(response))
        this.wronglogin = false;
        this.router.navigate(['./host']);
      },
      error => {
        console.warn("wrong credentials");
        this.wronglogin = true;
      }
    )


  }

  
}
