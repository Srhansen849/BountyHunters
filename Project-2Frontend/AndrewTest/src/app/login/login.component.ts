import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  wronglogin = false;

  fmpForm = new FormGroup({
    uemail: new FormControl('')
  })

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
