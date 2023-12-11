import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HomeAdminComponent } from './home-admin/home-admin.component';
import { HomeUtenteComponent } from './home-utente/home-utente.component';
import { TabellaUtentiComponent } from './tabella-utenti/tabella-utenti.component';
import { TabellaTicketComponent } from './tabella-ticket/tabella-ticket.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeAdminComponent,
    HomeUtenteComponent,
    TabellaUtentiComponent,
    TabellaTicketComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
