import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { HostService } from 'src/app/services/host.service';

@Component({
  selector: 'app-host-bounty-list',
  templateUrl: './host-bounty-list.component.html',
  styleUrls: ['./host-bounty-list.component.css']
})
export class HostBountyListComponent implements OnInit {

  constructor(private hServ: HostService, private router: Router, private actRoute: ActivatedRoute) { }

  ngOnInit(): void {
  }

}
