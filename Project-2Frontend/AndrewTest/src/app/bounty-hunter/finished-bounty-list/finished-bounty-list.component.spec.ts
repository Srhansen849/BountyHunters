import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FinishedBountyListComponent } from './finished-bounty-list.component';

describe('FinishedBountyListComponent', () => {
  let component: FinishedBountyListComponent;
  let fixture: ComponentFixture<FinishedBountyListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FinishedBountyListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FinishedBountyListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
