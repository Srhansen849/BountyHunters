import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Host } from 'src/app/objects/host-object';




@Injectable({
    providedIn: 'root'
})

export class HostService{

    private urlBase = "http://localhost:9065/host"
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

    public getProfileInfo(host:string): Observable<Host>{
        return this.http.get<Host>(this.urlBase+"/profileinfo"+host, this.httpHead)
    }

    public createNewHost(host:string): Observable<Host>{
        return this.http.post<Host>(this.urlBase+"/new", host, this.httpHead)
    }


}
