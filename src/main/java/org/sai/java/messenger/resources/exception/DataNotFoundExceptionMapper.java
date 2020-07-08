package org.sai.java.messenger.resources.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.sai.java.messenger.resources.model.ErrorMessage;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException>{

	@Override
	public Response toResponse(DataNotFoundException exception) {
		// TODO Auto-generated method stub
		
		ErrorMessage errorMessage =new ErrorMessage(exception.getMessage(),404,"http://www.google.com");
		return Response.status(Status.NOT_FOUND)
				.entity(errorMessage)
				.build();
	}
	
	
	

}
