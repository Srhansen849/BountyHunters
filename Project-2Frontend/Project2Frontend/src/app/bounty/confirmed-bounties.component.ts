import { HomepageComponent } from './../homepage/homepage.component';
import { Bounty } from './bounty';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-confirmed-bounties',
  templateUrl: './confirmed-bounties.component.html',
  styleUrls: ['./confirmed-bounties.component.css']
})
export class ConfirmedBountiesComponent implements OnInit {

  constructor() { }


  ngOnInit(): void {
  }

  // selected_bh: string = '';
  // bounty: any = [
  //   'A',
  //   'B',
  //   'C',
  //   'D',
  //   'E'
  // ];
  // radioChangeHandler(event: any) {
  //   this.selected_bh = event.target.value;
  // }






}

