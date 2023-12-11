import { Component , OnInit} from '@angular/core';
import { TicketserviceService } from '../ticketservice.service';

@Component({
  selector: 'app-tabella-ticket',
  templateUrl: './tabella-ticket.component.html',
  styleUrls: ['./tabella-ticket.component.css']
})
export class TabellaTicketComponent {

tickets: any;

constructor(private ticketservice: TicketserviceService){

}

ngOnInit() {
  console.log(this.tickets.descrizione)
this.ticketservice.getAllTicket().subscribe(data=> {
  this.tickets = data;
})




}
modificaTicket()
{

}

eliminaTicket() {

}


}
