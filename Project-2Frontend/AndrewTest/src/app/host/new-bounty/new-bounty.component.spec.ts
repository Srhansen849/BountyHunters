import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewBountyComponent } from './new-bounty.component';

describe('NewBountyComponent', () => {
  let component: NewBountyComponent;
  let fixture: ComponentFixture<NewBountyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NewBountyComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NewBountyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
