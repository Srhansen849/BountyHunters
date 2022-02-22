import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Host } from "../objects/host-object";



@Injectable({
    providedIn: 'root'
})

export class HostService{

    private urlBase = "http://localhost:9015/host"
    httpHead = {
        headers: new HttpHeaders({
            'Content-Type':'application/json',
            'Access-Control-Allow-Origin':'*'
        })
    };

    constructor(private http: HttpClient){}

    public HostLogin(host:string): Observable<Host>{
        return this.http.post<Host>(this.urlBase+"/login", host, this.httpHead)
    }

    public updateProfile(host:string): Observable<Host>{
        return this.http.post<Host>(this.urlBase+"/profile", host, this.httpHead)
    }

    public getProfileInfo(): Observable<Host>{
        return this.http.get<Host>(this.urlBase+"/profileinfo", this.httpHead)
    }

    public createNewHost(host:string): Observable<Host>{
        return this.http.post<Host>(this.urlBase+"/new", host, this.httpHead)
    }


}
