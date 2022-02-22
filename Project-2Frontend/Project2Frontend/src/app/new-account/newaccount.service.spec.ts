import { TestBed } from '@angular/core/testing';

import { NewaccountService } from './newaccount.service';

describe('NewaccountService', () => {
  let service: NewaccountService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NewaccountService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
