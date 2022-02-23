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

<<<<<<< HEAD
=======


  // bountyForm = new FormGroup({
  //   statusid: new FormControl(''),
  //   capture: new FormControl(''),
  //   amount: new FormControl(''),
  //   currency: new FormControl(''),
  //   time: new FormControl(''),
  //   preferid: new FormControl(''),
  //     criminal: new FormGroup({
  //       firstname: new FormControl(''),
  //       lastname: new FormControl(''),
  //       codename: new FormControl('')
  //   })

  // })

>>>>>>> stuff
  constructor(private bServ: BountyService, private router: Router, private actRoute: ActivatedRoute) { }

  ngOnInit(): void {
  }

}
