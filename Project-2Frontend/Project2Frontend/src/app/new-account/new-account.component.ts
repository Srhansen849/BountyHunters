import { Component, Host, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { User } from '../bounty/objects/user-object';
import { NewAccountService } from './new-account.service';

@Component({
  selector: 'app-new-account',
  templateUrl: './new-account.component.html',
  styleUrls: ['./new-account.component.css']
})
export class NewAccountComponent implements OnInit {

  userForm = new FormGroup({
    firstname: new FormControl(''),
    lastname: new FormControl(''),
    codename: new FormControl(''),
    username: new FormControl(''),
    password: new FormControl(''),
    preferid: new FormControl('')
  })

  host: Host;

  constructor(private nServ:NewAccountService, private router:Router, private actRoute:ActivatedRoute) { }

  ngOnInit(): void {

  }


  

}


