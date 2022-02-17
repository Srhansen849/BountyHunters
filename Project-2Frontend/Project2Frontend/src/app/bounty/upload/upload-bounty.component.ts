import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BountyService } from '../bounty.service';

@Component({
  selector: 'app-upload-bounty',
  templateUrl: './upload-bounty.component.html',
  styleUrls: ['./bounty.component.css']
})
export class UploadBountyComponent implements OnInit {

  constructor(private bServ:BountyService, private router:Router, private actRoute:ActivatedRoute) { }

  ngOnInit(): void {
  }

}
