import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Erailresourse {
    @PostMapping(value="/bookTicket",produces =
            {
                    "application/json","application/xml"
            },
            consumes = {"application/json","application/xml"})
    public Ticket bookticket(PassengerInfo pinfo){
        Ticket t=new Ticket();
        t.setTicketID("D104");
        t.setPassengerName("Kavya");
        t.setFrom("HYD");
        t.setTo("VIZ");
        t.setTicketStatus("CONFIRMED");
        t.setTrainNumber("E123456");
        t.setTicketPrice("2000");
        return t;
    }
}
