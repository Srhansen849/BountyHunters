import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { HomepageService } from '../homepage.service';

@Component({
  selector: 'app-homepage-host',
  templateUrl: './homepage-host.component.html',
  styleUrls: ['../homepage.component.css']
})
export class HomepageHostComponent implements OnInit {

  constructor(private hServ:HomepageService, private router:Router, private actRoute:ActivatedRoute) { }

  ngOnInit(): void {
    let user = JSON.parse(localStorage.getItem("loggedUser"));
    console.log(user);
    if(!user){
      this.router.navigate(["/login"]);
    }
  }

}
