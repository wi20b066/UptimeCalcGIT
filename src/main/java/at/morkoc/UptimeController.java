package at.morkoc; //groupId von pom.xml

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;

@Path("/api/uptime")
public class UptimeController {

    @GET
    @Path("/{uptime}")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateUptime(@PathParam("uptime") double uptime) {
        double minutesOfMonth = 60*24*30;
        double defineUptimeInPercent = uptime / 100;
        return String.format("%.2f", minutesOfMonth * defineUptimeInPercent);
    }

}
