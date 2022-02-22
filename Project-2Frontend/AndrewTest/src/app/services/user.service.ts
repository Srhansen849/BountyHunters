import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { User } from "../objects/user-object";



@Injectable({
    providedIn: 'root'
})

export class UserService{

    private urlBase = "http://localhost:9015/bhunter"
    httpHead = {
        headers: new HttpHeaders({
            'Content-Type':'application/json',
            'Access-Control-Allow-Origin':'*'
        })
    };

    constructor(private http: HttpClient){}

    public findAllBountyHunters(): Observable<User[]>{
        return this.http.get<User[]>(this.urlBase+"/all",this.httpHead)
    }

    public findTopTen(): Observable<User[]>{
        return this.http.get<User[]>(this.urlBase+"/rank",this.httpHead)
    }

    public bountyHunterLogin(user:string): Observable<User>{
        return this.http.post<User>(this.urlBase+"/login", user, this.httpHead)
    }

    public updateProfile(user:string): Observable<User>{
        return this.http.post<User>(this.urlBase+"/profile", user, this.httpHead)
    }

    public getProfileInfo(user:string): Observable<User>{
        return this.http.get<User>(this.urlBase+"/profileinfo", this.httpHead)
    }

    public createNewUser(user:string): Observable<User>{
        return this.http.post<User>(this.urlBase+"/new", user, this.httpHead)
    }

    
    
    
    
    


}
