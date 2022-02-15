import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ActiveBountiesComponent } from './active-bounties.component';

describe('ActiveBountiesComponent', () => {
  let component: ActiveBountiesComponent;
  let fixture: ComponentFixture<ActiveBountiesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ActiveBountiesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ActiveBountiesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
