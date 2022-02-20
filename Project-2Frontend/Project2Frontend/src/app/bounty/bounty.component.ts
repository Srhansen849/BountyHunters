import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Bounty } from './objects/bounty-object';
import { BountyService } from './bounty.service';
import { NgStyle } from '@angular/common';

import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-confirmed-bounties',
  templateUrl: './bounty.component.html',
  styleUrls: ['./bounty.component.css']
})
export class BountyComponent implements OnInit {

  bounty: Bounty;

  constructor(private bServ: BountyService, private router: Router, private actRoute: ActivatedRoute) { }

  ngOnInit(): void {
  }

}
