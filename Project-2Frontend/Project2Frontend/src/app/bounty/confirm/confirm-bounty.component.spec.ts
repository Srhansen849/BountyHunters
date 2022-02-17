import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ComfirmBountyComponent } from './confirm-bounty.component'

describe('ComfirmBountyComponent', () => {
  let component: ComfirmBountyComponent;
  let fixture: ComponentFixture<ComfirmBountyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ComfirmBountyComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ComfirmBountyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});