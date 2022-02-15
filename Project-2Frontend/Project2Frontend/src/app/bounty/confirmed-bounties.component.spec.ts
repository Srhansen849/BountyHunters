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
