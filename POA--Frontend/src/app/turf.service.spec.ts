import { TestBed } from '@angular/core/testing';

import { TurfService } from './turf.service';

describe('TurfService', () => {
  let service: TurfService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TurfService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
