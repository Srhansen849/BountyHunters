import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { NewAccountService } from './new-account.service';

@Component({
  selector: 'app-new-account',
  templateUrl: './new-account.component.html',
  styleUrls: ['./new-account.component.css']
})
export class NewAccountComponent implements OnInit {

  constructor(private nServ:NewAccountService, private router:Router, private actRoute:ActivatedRoute) { }

  ngOnInit(): void {
  }

  

}
