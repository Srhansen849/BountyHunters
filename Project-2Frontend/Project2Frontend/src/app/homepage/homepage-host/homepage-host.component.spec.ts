import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HomepageHostComponent } from './homepage-host.component';

describe('HomepageHostComponent', () => {
  let component: HomepageHostComponent;
  let fixture: ComponentFixture<HomepageHostComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HomepageHostComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HomepageHostComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
