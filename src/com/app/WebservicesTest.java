package com.app;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/home")
public class WebservicesTest {
	
	@POST
	@Path("/home")	
	public String showmsg(
			@QueryParam("sid")int id,
			@QueryParam("sname")String sn){
		return "Hello"+id+","+sn;
	}
	@GET
	@Path("/msg")
	public String msg(){
		return "hi";
	}

}
