import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HostBountyListComponent } from './host-bounty-list.component';

describe('HostBountyListComponent', () => {
  let component: HostBountyListComponent;
  let fixture: ComponentFixture<HostBountyListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HostBountyListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HostBountyListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
