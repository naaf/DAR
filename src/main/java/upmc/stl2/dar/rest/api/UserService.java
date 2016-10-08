package upmc.stl2.dar.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
@Produces(MediaType.TEXT_PLAIN)
public class UserService {

	@GET
	public String getUser() {
		return "testRest getUset";
	}

}
