import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PendingBountyListComponent } from './pending-bounty-list.component';

describe('PendingBountyListComponent', () => {
  let component: PendingBountyListComponent;
  let fixture: ComponentFixture<PendingBountyListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PendingBountyListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PendingBountyListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
