import { Bounty } from './../bounty/bounty';
import { Observable } from 'rxjs';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HomepageServiceService {

  private uslBase = "http://localhost:9015/homepage"
  httpHead = {
    headrs: new HttpHeaders({
      'content-Type': 'application/json',
      'Access-control-Allow-Origin': '*'
    })
  };

  constructor(private http: HttpClient) { }
}
