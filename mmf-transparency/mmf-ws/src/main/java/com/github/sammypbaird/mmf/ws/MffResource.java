package com.github.sammypbaird.mmf.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/test")
public class MffResource
{
	@GET
	public Response test()
	{
		return Response.ok("Test").build();
	}
}
