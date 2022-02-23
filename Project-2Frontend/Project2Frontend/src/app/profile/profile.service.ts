import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Bounty } from '../bounty/objects/bounty-object';
import { Host } from '../bounty/objects/host-object';
import { User } from '../bounty/objects/user-object';

export class ProfileService {


  private urlBase = "http://localhost:9015/";
  httpHead = {
    headers: new HttpHeaders({
      'content-Type':'application/json',
      'Access-Control-Allow-Origin':'*'
    })
  };

  constructor(private http: HttpClient) { }

  public getAllPastBounty(): Observable<Bounty[]>{
    return this.http.get<Bounty[]>(this.urlBase + "bounty/complete", this.httpHead);
  }

  public getAllPrivateBounty(): Observable<Bounty[]>{
    return this.http.get<Bounty[]>(this.urlBase + "bounty/private", this.httpHead);
  }

  public getAllBounty(): Observable<Bounty[]> {
    return this.http.get<Bounty[]>(this.urlBase + "bounty/all", this.httpHead);
  }

  public getUserProfileInfo(): Observable<User>{
    return this.http.get<User>(this.urlBase + "user/profileinfo", this.httpHead);
  }

  public getHostProfileInfo(): Observable<Host>{
    return this.http.get<Host>(this.urlBase + "host/profileinfo", this.httpHead);
  }

  public editUserProfile(user: string): Observable<User>{
    return this.http.post<User>(this.urlBase + "user/profile", user, this.httpHead);
  }

  public editHostProfile(host: string): Observable<Host>{
    return this.http.post<Host>(this.urlBase + "host/profile", host, this.httpHead);
  }

}
