import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-new-account',
  templateUrl: './new-account.component.html',
  styleUrls: ['./new-account.component.css']
})
export class NewAccountComponent implements OnInit {


  isHunter = false;
  isHost = false;

  public newHunter() {
    this.isHunter = true;
    this.isHost = false;
    console.log("Hunter Button");
  }

  public newHost() {
    this.isHost = true;
    this.isHunter = false;
    console.log("Host Button");
  }

  constructor() { }

  ngOnInit(): void {
  }

}
