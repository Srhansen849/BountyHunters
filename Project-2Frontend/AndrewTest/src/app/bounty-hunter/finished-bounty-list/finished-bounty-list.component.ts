import { Component, OnInit } from '@angular/core';
import { Bounty } from 'src/app/objects/bounty-object';

@Component({
  selector: 'app-finished-bounty-list',
  templateUrl: './finished-bounty-list.component.html',
  styleUrls: ['./finished-bounty-list.component.css']
})
export class FinishedBountyListComponent implements OnInit {

  bountyList: Bounty[] = [];

  constructor() { }

  ngOnInit(): void {
  }

}
