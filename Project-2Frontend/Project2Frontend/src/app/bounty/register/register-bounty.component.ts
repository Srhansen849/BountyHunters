import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BountyService } from '../bounty.service';

@Component({
  selector: 'app-register-bounty',
<<<<<<< HEAD
  templateUrl: './register-bounty.component.html'
=======
  templateUrl: './register-bounty.component.html',
  styleUrls: ['../bounty.component.css']
>>>>>>> 60860570f79a12886f6eb5665b96484737f59972
})
export class RegisterBountyComponent implements OnInit {

  constructor(private bServ:BountyService, private router:Router, private actRoute:ActivatedRoute) { }

  ngOnInit(): void {
  }

}
