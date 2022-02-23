import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Bounty } from "../objects/bounty-object";
import { Criminal } from "../objects/criminal-object";
import { User } from "../objects/user-object";




@Injectable({
  providedIn: 'root'
})

export class BountyService {

  private urlBase = "http://localhost:9015/bounty"
  httpHead = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': '*'
    })
  };

  constructor(private http: HttpClient) { }

  //user turns in a bounty
  public SubmitBounty(bounty: string): Observable<Bounty> {
    return this.http.post<Bounty>(this.urlBase + "/submit", bounty, this.httpHead)
  }
  //host creates a new bounty
  public createNewBounty(bounty: string): Observable<Bounty> {
    return this.http.post<Bounty>(this.urlBase + "/new", bounty, this.httpHead)
  }
  //host finishes a bounty
  public FinishBounty(bounty: string): Observable<Bounty> {
    return this.http.post<Bounty>(this.urlBase + "/finish", bounty, this.httpHead)
  }

  // get the complete bounty
  public getAllCompleteBounty(): Observable<Bounty[]> {
    return this.http.get<Bounty[]>(this.urlBase + "/complete", this.httpHead);
  }

  // get the caught bounty
  public getAllCaughtBounty(): Observable<Bounty[]> {
    return this.http.get<Bounty[]>(this.urlBase + "/caught", this.httpHead);
  }

  // get all the active bounty
  public getAllActiveBounty(): Observable<Bounty[]> {
    return this.http.get<Bounty[]>(this.urlBase + "/active", this.httpHead);
  }

  public getAllCriminal(): Observable<Criminal[]> {
    return this.http.get<Criminal[]>(this.urlBase + "/criminal", this.httpHead);
  }


}
