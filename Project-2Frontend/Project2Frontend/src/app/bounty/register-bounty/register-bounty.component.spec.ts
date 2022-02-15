import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegisterBountyComponent } from './register-bounty.component';

describe('RegisterBountyComponent', () => {
  let component: RegisterBountyComponent;
  let fixture: ComponentFixture<RegisterBountyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegisterBountyComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RegisterBountyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
