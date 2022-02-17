import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UploadBountyComponent } from './upload-bounty.component'

describe('UploadBountyComponent', () => {
  let component: UploadBountyComponent;
  let fixture: ComponentFixture<UploadBountyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UploadBountyComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UploadBountyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});