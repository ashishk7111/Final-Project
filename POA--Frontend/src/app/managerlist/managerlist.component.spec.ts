import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ManagerlistComponent } from './managerlist.component';

describe('ManagerlistComponent', () => {
  let component: ManagerlistComponent;
  let fixture: ComponentFixture<ManagerlistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ManagerlistComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ManagerlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
