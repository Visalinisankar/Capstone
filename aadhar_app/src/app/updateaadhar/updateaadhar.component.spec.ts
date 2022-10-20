import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateaadharComponent } from './updateaadhar.component';

describe('UpdateaadharComponent', () => {
  let component: UpdateaadharComponent;
  let fixture: ComponentFixture<UpdateaadharComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateaadharComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UpdateaadharComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
