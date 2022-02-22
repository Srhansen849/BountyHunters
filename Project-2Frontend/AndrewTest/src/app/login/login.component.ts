import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  wronglogin = false;

  isHunter = false;
  isHost = false;

  public hunterButton() {
    this.isHunter = true;
    this.isHost = false;
    console.log("Hunter Button");
  }

  public hostButton() {
    this.isHost = true;
    this.isHunter = false;
    console.log("Host Button");
  }


  constructor() { }

 


  ngOnInit(): void {
    localStorage.removeItem("loggedUser");
    localStorage.removeItem("loggedHost");
  }

}
