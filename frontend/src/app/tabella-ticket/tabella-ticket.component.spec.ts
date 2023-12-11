import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TabellaTicketComponent } from './tabella-ticket.component';

describe('TabellaTicketComponent', () => {
  let component: TabellaTicketComponent;
  let fixture: ComponentFixture<TabellaTicketComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TabellaTicketComponent]
    });
    fixture = TestBed.createComponent(TabellaTicketComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
