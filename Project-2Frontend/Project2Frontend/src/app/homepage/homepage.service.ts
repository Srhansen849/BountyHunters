import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HomepageService {

  constructor() { }

  public getAllRankedBH(): Observable<Bounty[]> {
    return this.http.get<Bounty[]>(this.urlBase, this.httpHead);
  }
}
