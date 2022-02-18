import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BountyService } from '../bounty.service';

@Component({
  selector: 'app-register-bounty',
  templateUrl: './register-bounty.component.html',
  styleUrls: ['../bounty.component.css']
})
export class RegisterBountyComponent implements OnInit {

  constructor(private bServ: BountyService, private router: Router, private actRoute: ActivatedRoute) { }

  ngOnInit(): void {
  }

}
