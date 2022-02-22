import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ActiveBountyListComponent } from './active-bounty-list.component';

describe('ActiveBountyListComponent', () => {
  let component: ActiveBountyListComponent;
  let fixture: ComponentFixture<ActiveBountyListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ActiveBountyListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ActiveBountyListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
