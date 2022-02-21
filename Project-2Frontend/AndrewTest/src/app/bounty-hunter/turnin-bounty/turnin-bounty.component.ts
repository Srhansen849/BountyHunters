import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { BountyService } from 'src/app/services/bounty.service';

@Component({
  selector: 'app-turnin-bounty',
  templateUrl: './turnin-bounty.component.html',
  styleUrls: ['./turnin-bounty.component.css']
})
export class TurninBountyComponent implements OnInit {

  bountyForm = new FormGroup({
    turninid: new FormControl(''),
    criminalfk: new FormControl('')
  });

  constructor(private bServ: BountyService, private router: Router, private actRoute: ActivatedRoute) { }

  ngOnInit(): void {
  }

}
