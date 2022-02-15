import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProfileBusiComponent } from './profile-busi.component';

describe('ProfileBusiComponent', () => {
  let component: ProfileBusiComponent;
  let fixture: ComponentFixture<ProfileBusiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProfileBusiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProfileBusiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
