import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
public class Ticket {
    private String ticketID;
    private String ticketStatus;
    private String ticketPrice;
    private String passengerName;
    private String from;
    private String to;
    private String trainNumber;
}
