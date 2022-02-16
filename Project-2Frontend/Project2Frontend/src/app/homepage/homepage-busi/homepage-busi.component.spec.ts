import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HomepageBusiComponent } from './homepage-busi.component';

describe('HomepageBusiComponent', () => {
  let component: HomepageBusiComponent;
  let fixture: ComponentFixture<HomepageBusiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HomepageBusiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HomepageBusiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
