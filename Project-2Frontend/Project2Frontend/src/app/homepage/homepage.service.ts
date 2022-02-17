import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Bounty } from '../bounty/objects/bounty-object';

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

  public getAllRankedBH(): Observable<Bounty[]> {
    return this.http.get<Bounty[]>(this.urlBase, this.httpHead);
  }

}
