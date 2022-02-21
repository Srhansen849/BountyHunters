import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Bounty } from "../objects/bounty-object";
import { Criminal } from "../objects/criminal-object";
import { User } from "../objects/user-object";




@Injectable({
    providedIn: 'root'
})

export class BountyService{

    private urlBase = "http://localhost:9015/bounty"
    httpHead = {
        headers: new HttpHeaders({
            'Content-Type':'application/json',
            'Access-Control-Allow-Origin':'*'
        })
    };

    constructor(private http: HttpClient){}

    public RegisterBounty(bounty:string): Observable<Bounty>{
        return this.http.post<Bounty>(this.urlBase+"/register", bounty, this.httpHead)
    }

    public SubmitBounty(bounty:Bounty): Observable<Bounty>{
        return this.http.post<Bounty>(this.urlBase+"/submitbounty", bounty, this.httpHead)
    }

    public createNewBounty(bounty:string): Observable<Bounty>{
        return this.http.post<Bounty>(this.urlBase+"/new", bounty, this.httpHead)
    }

    public FinishBounty(bounty:string): Observable<Bounty>{
        return this.http.post<Bounty>(this.urlBase+"/finishbounty", bounty, this.httpHead)
    }

    public getAllBountyHunters(): Observable<Bounty> {
      return this.http.get<Bounty>(this.urlBase + "/bounty/submit", this.httpHead);
  }

  // get the complete bounty
  public getAllCompleteBounty(): Observable<Bounty[]> {
      return this.http.get<Bounty[]>(this.urlBase + "/bounty/finish", this.httpHead);
  }

  // get all the active bounty
  public getAllActiveBounty(): Observable<Bounty[]> {
      return this.http.get<Bounty[]>(this.urlBase + "/bounty/register", this.httpHead);
  }
  // completed bounties by logged in Hunter
  public getAllPastBounty(uusername: string): Observable<Bounty[]>{
    return this.http.get<Bounty[]>(this.urlBase + "bounty/complete", this.httpHead);
  }

  public getAllPrivateBounty(): Observable<Bounty[]>{
    return this.http.get<Bounty[]>(this.urlBase + "bounty/private", this.httpHead);
  }

  public getAllBounty(): Observable<Bounty[]> {
    return this.http.get<Bounty[]>(this.urlBase + "bounty/all", this.httpHead);
  }

  public getAllRankedBH(): Observable<User[]> {
    return this.http.get<User[]>("http://localhost:9015/bhunter/rank", this.httpHead);
  }

  public getAllCriminal(): Observable<Criminal[]> {
    return this.http.get<Criminal[]>(this.urlBase + "/criminal", this.httpHead);
  }


}
