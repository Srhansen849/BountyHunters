import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { HostService } from 'src/app/services/host.service';

@Component({
  selector: 'app-pending-bounty-list',
  templateUrl: './pending-bounty-list.component.html',
  styleUrls: ['./pending-bounty-list.component.css']
})
export class PendingBountyListComponent implements OnInit {

  constructor(private hServ: HostService, private router: Router, private actRoute: ActivatedRoute) { }

  ngOnInit(): void {
  }

}
