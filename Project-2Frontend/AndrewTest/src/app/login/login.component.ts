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
