import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TopBHListComponent } from './top-bh-list.component';

describe('TopBHListComponent', () => {
  let component: TopBHListComponent;
  let fixture: ComponentFixture<TopBHListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TopBHListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TopBHListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
