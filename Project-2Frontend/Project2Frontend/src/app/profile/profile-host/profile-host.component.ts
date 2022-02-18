import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ProfileService } from '../profile.service';

@Component({
  selector: 'app-profile-host',
  templateUrl: './profile-host.component.html',
  styleUrls: ['../profile.component.css']
})
export class ProfileHostComponent implements OnInit {

  isVisable = false;

  constructor(private pServ:ProfileService, private router:Router, private actRoute:ActivatedRoute) { }

  ngOnInit(): void {
  }

}
