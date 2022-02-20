import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewBountyHunterComponent } from './new-bounty-hunter.component';

describe('NewBountyHunterComponent', () => {
  let component: NewBountyHunterComponent;
  let fixture: ComponentFixture<NewBountyHunterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NewBountyHunterComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NewBountyHunterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
