import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Bounty } from 'src/app/objects/bounty-object';
import { HostService } from 'src/app/services/host.service';

@Component({
  selector: 'app-pending-bounty-list',
  templateUrl: './pending-bounty-list.component.html',
  styleUrls: ['./pending-bounty-list.component.css']
})
export class PendingBountyListComponent implements OnInit {

  bountyList: Bounty[] = [];

  constructor(private hServ: HostService, private router: Router, private actRoute: ActivatedRoute) { }

  ngOnInit(): void {
  }

}
