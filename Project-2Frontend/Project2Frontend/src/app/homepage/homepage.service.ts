import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Bounty } from '../bounty/objects/bounty-object';
import { Criminal } from '../bounty/objects/criminal-object';
import { User } from '../bounty/objects/user-object';

@Injectable({
  providedIn: 'root'
})
export class HomepageService {


  private urlBase = "http://localhost:9015/bounty"
  httpHead = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': '*'
    })
  };
  constructor(private http: HttpClient) { }

  public getAllRankedBH(): Observable<User[]> {
    return this.http.get<User[]>("http://localhost:9015/bhunter/rank", this.httpHead);
  }

  public getAllBounty(): Observable<Bounty[]> {
    return this.http.get<Bounty[]>(this.urlBase + "/all", this.httpHead);
  }

  public getAllCriminal(): Observable<Criminal[]> {
    return this.http.get<Criminal[]>(this.urlBase + "/criminal", this.httpHead);
  }

}
