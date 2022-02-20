import { HttpClient, HttpClientModule, HttpHeaders } from '@angular/common/http';
import { Host, Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from "../bounty/objects/user-object";

@Injectable({
  providedIn: 'root'
})
export class UserLoginService {

  httpHead = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': '*'
    })
  };

  constructor(public http: HttpClient) { }

  public bHunterLogin(user: User): Observable<User> {
    return this.http.post<User>("http://localhost:9015/bhunter/login", user, this.httpHead);
  }

  public HostLogin(host: Host): Observable<Host> {
    return this.http.post<Host>("http://localhost:9015/host/login", host, this.httpHead);
  }

}


