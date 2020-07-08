package org.sai.java.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")

public class CommentResource {

	
	@GET
	public String test()
	{
		return "new sub resource";
	}
	
	@GET
	@Path("/{commentId}")
	public String test2(@PathParam("commentId") long commentID , @PathParam("messageId") long messageId)
	{
		return "comment ID method "+commentID + " Message is "+messageId;
	}
	
	
	
	
}
