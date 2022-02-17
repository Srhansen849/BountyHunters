import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
<<<<<<< HEAD
import { Bounty } from "./bounty-object";
import { Criminal } from "./criminal-object";
=======
import { Bounty } from "./objects/bounty-object";
>>>>>>> bf2b1de3ff002c16576b4267f24a1c5544ea4594


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

    public RegisterBounty(bounty:string, criminal:string): Observable<Bounty>{
        return this.http.post<Bounty>(this.urlBase+"/register", bounty, this.httpHead)
    }

    public SubmitBounty(bounty:string): Observable<Bounty>{
        return this.http.post<Bounty>(this.urlBase+"/submitbounty", bounty, this.httpHead)
    }

    public createNewBounty(bounty:string): Observable<Bounty>{
        return this.http.post<Bounty>(this.urlBase+"/new", bounty, this.httpHead)
    }

    public FinishBounty(bounty:string): Observable<Bounty>{
        return this.http.post<Bounty>(this.urlBase+"/finishbounty", bounty, this.httpHead)
    }


}
