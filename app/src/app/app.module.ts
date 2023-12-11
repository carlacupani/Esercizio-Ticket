import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeAdminComponent } from './home-admin/home-admin.component';
import { HomeUtenteComponent } from './home-utente/home-utente.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeAdminComponent,
    HomeUtenteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
