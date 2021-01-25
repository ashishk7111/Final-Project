import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddturfComponent } from './addturf.component';

describe('AddturfComponent', () => {
  let component: AddturfComponent;
  let fixture: ComponentFixture<AddturfComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddturfComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddturfComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
