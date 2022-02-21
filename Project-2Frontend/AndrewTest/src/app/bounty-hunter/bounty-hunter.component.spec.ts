import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BountyHunterComponent } from './bounty-hunter.component';

describe('BountyHunterComponent', () => {
  let component: BountyHunterComponent;
  let fixture: ComponentFixture<BountyHunterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BountyHunterComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BountyHunterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
