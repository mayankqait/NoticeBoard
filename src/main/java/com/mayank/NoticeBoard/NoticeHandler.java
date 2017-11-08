package com.mayank.NoticeBoard;

import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

/*import org.json.JSONArray;
import org.json.JSONObject;

import javax.json.*;*/



/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/myresource")
public class NoticeHandler {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	
	@Path("/readUI")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response checkpoint(){                              //To read notice on UI
		Notice obj=null;
		try{  
			
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/noticedb","root","root");  
			PreparedStatement ps=con.prepareStatement("select id,notice from notice order by id desc ");
			ResultSet rs=ps.executeQuery();
			 obj=new Notice();
			ArrayList<String> list =null;
		    list=new ArrayList<String>();
		    
			 while(rs.next()){
			      list.add(rs.getString(2));
			 }
			 
             obj.setNotice(list);
			System.out.println(obj.toString());
	  }catch(Exception e){
		  System.out.println(e);
		  System.out.println("Error in notice handler");
	  }
		URI uri = UriBuilder.fromPath("http://localhost:8086/NoticeBoard/readPage.jsp")
	            .queryParam("notice", obj)
	            .build();
		return Response.seeOther(uri).build();	
		
	}
	
	
	@Path("/readJson")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public  Notice readNotice(){                           //To read notice as json object
		Notice obj=null;
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/noticedb","root","root");  
			PreparedStatement ps=con.prepareStatement("select id,notice from notice order by id desc ");
			ResultSet rs=ps.executeQuery();
			 obj=new Notice();
			ArrayList<String> list =null;
		    list=new ArrayList<String>();
			 while(rs.next()){
			      list.add(rs.getString(2));
			 }
             obj.setNotice(list);
			
	  }catch(Exception e){
		  System.out.println(e);
		  System.out.println("Error in notice handler");
	  }
		
		return obj;
	}
	
	
	
	@Path("/write")
    @POST 
    public Response saveNoticeDB(@FormParam("notice") String notice) {
		
	  try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/noticedb","root","root");  
			PreparedStatement ps=con.prepareStatement("select max(id) from notice as max");
			ResultSet rs=ps.executeQuery();
			int id=0;
			
			rs.next();
			id=rs.getInt(1);
			System.out.println(rs.getInt(1));
			id++;
			
			PreparedStatement ps1=con.prepareStatement(  
					"insert into notice values(?,?)");
			ps1.setInt(1,id);
			ps1.setString(2,notice);
			int i=ps1.executeUpdate();  
			if(i>0)  
			{
				System.out.print("Your notice is successfully submitted...");
			
			}

			
	  }catch(Exception e){
		  System.out.println(e);
		  System.out.println("Error in notice handler");
	  }
	  
	  /*return Response.status(200)
				.entity("Notice successfully stored in database")
				.build();*/
	  URI uri = UriBuilder.fromPath("http://localhost:8086/NoticeBoard/index.jsp")
	            .build();
		return Response.seeOther(uri).build();	
    }
	
	
}