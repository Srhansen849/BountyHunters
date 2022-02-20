import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TurninBountyComponent } from './turnin-bounty.component';

describe('TurninBountyComponent', () => {
  let component: TurninBountyComponent;
  let fixture: ComponentFixture<TurninBountyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TurninBountyComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TurninBountyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
