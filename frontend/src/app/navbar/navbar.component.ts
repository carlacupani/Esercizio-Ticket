import { Component } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent {
  varnav = 1;
  cambiatabella(index:any){
    this.varnav = index;
    
  }
}
