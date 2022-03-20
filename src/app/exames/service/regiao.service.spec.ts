import { TestBed } from '@angular/core/testing';

import { RegiaoService } from './regiao.service';

describe('RegiaoService', () => {
  let service: RegiaoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RegiaoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
