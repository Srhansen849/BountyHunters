import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FinishBountyComponent } from './finish-bounty.component';

describe('FinishBountyComponent', () => {
  let component: FinishBountyComponent;
  let fixture: ComponentFixture<FinishBountyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FinishBountyComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FinishBountyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
