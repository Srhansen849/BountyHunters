import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Bounty } from '../objects/bounty-object';
import { BountyService } from '../bounty.service';

@Component({
  selector: 'app-confirmed-bounties',
  templateUrl: './confirm-bounty.component.html',
  styleUrls: ['../bounty.component.css']
})
export class ComfirmBountyComponent implements OnInit {

  bounty:Bounty;

  constructor(private bServ:BountyService, private router:Router, private actRoute:ActivatedRoute) { }

  ngOnInit(): void {
  }

}
