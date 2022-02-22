import { Observable } from 'rxjs';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { NewHost, NewUser } from './new-account';

@Injectable({
  providedIn: 'root'
})
export class NewAccountService {

  httpHead = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': '*'
    })
  };

  constructor(public http: HttpClient) { }

  public addUser(user: any[]): Observable<NewUser> {
    return this.http.post<NewUser>('http://localhost:9015/bhunter/new', user, this.httpHead);
  }

  public addHost(host: any[]): Observable<NewHost> {
    return this.http.post<NewHost>('http://localhost:9015/host/new', host, this.httpHead);
  }
}
