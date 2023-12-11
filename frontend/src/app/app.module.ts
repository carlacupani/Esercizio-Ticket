import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HomeAdminComponent } from './home-admin/home-admin.component';
import { HomeUtenteComponent } from './home-utente/home-utente.component';
import { TabellaUtentiComponent } from './tabella-utenti/tabella-utenti.component';
import { TabellaTicketComponent } from './tabella-ticket/tabella-ticket.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FormModificaUtenteComponent } from './form-modifica-utente/form-modifica-utente.component';
import { Navbar2Component } from './navbar2/navbar2.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeAdminComponent,
    HomeUtenteComponent,
    TabellaUtentiComponent,
    TabellaTicketComponent,
    NavbarComponent,
    FormModificaUtenteComponent,
    Navbar2Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
