import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ActiveHuntersComponent } from './active-hunters.component';

describe('ActiveHuntersComponent', () => {
  let component: ActiveHuntersComponent;
  let fixture: ComponentFixture<ActiveHuntersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ActiveHuntersComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ActiveHuntersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
