export class Bounty{
    constructor (public bountyid:number, public capture:string,
                public amount:number, public currency:string,
                public time:string) {}
}

export class Criminal{
    constructor (public criminalid: number, public firstname:string,
                public lastname:string, public codename:string,
                public description:string, public organization:string,
                public height:number, public weight:number,
                public species:string, public associates:string) {}
}

export class Asset{
    constructor (public assetid:number, public currency:string,
                public balance:number) {}
}

export class Status{
    constructor (public statusid:number, public status:string) {}
}

export class Criminallist {
    constructor (public criminallist: string[]) {}
}



import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConfirmedBountiesComponent } from './bounty.component';

describe('ConfirmedBountiesComponent', () => {
  let component: ConfirmedBountiesComponent;
  let fixture: ComponentFixture<ConfirmedBountiesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConfirmedBountiesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConfirmedBountiesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
