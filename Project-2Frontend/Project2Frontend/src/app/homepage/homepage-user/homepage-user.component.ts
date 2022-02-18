import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { HomepageService } from '../homepage.service';

@Component({
  selector: 'app-homepage-user',
  templateUrl: './homepage-user.component.html',
  styleUrls: ['../homepage.component.css']
})
export class HomepageUserComponent implements OnInit {

  constructor(private hServ:HomepageService, private router:Router, private actRoute:ActivatedRoute) { }

  ngOnInit(): void {
  }

}
