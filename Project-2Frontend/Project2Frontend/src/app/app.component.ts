import { UserLoginComponent } from './user-login/user-login.component';
import { HttpClient, HttpEventType } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Project2Frontend';

  constructor(private http: HttpClient) {

  }

  ngOnInit() {

  }

}
