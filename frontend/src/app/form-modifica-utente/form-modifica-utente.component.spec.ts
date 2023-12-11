import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormModificaUtenteComponent } from './form-modifica-utente.component';

describe('FormModificaUtenteComponent', () => {
  let component: FormModificaUtenteComponent;
  let fixture: ComponentFixture<FormModificaUtenteComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FormModificaUtenteComponent]
    });
    fixture = TestBed.createComponent(FormModificaUtenteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
