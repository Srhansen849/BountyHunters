import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { NewUser } from './new-account';

@Injectable({
  providedIn: 'root'
})
export class NewaccountService {

  httpHead = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': '*'
    })
  };

  constructor(public http: HttpClient) { }

  public AddUser(user: any[]): Observable<NewUser> {
    return this.http.post<NewUser>('http://localhost:9015/bhunter/new', user, this.httpHead);
  }

  public AddHost(user: any[]): Observable<NewUser> {
    return this.http.post<NewUser>('http://localhost:9015/host/new', user, this.httpHead);
  }

}
