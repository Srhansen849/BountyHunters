import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HomepageBountyComponent } from './homepage-bounty.component';

describe('HomepageBountyComponent', () => {
  let component: HomepageBountyComponent;
  let fixture: ComponentFixture<HomepageBountyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HomepageBountyComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HomepageBountyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
