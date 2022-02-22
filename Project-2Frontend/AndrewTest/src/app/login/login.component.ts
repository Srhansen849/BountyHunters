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
  }

  public hostButton() {
    this.isHost = true;
    this.isHunter = false;
  }


  constructor() { }

 


  ngOnInit(): void {
    localStorage.removeItem("loggedHost");
    localStorage.removeItem("loggedUser");
  }

}
