package mmu.elfasij.restful.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
//import javax.ws.rs.core.UriInfo;

import mmu.elfasij.restful.model.Course;
import mmu.elfasij.restful.model.CourseDAO;

@Path("/courses")
public class CoursesResource {

	@Context
	Request request;

	// get all courses
	@GET
	@Produces(MediaType.TEXT_XML)
	public List<Course> getAllCourses() {
		List<Course> courses = new ArrayList<Course>();
		courses.addAll(CourseDAO.instance.getAllCourses());
		return courses;
	}
	
	//search for a course
	@Path("{searchTerm}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Course> getSearchedCourses(
			@PathParam("searchTerm") String searchTerm) {
		List<Course> courses = new ArrayList<Course>();
		courses.addAll(CourseDAO.instance.getCourse(searchTerm));
		return courses;
	}
	
	//add new record through xml format	
	@POST
	@Path("/test")
	@Consumes(MediaType.APPLICATION_XML)
	public Response insertCourse(List<Course> course){
		
			Response res = null;
			String n;//coursename
			String c;//courseCredit
			String d; //courseDuration
			String t; //courseTutor
			for(int i=0; i<course.size(); i++){
				
				String credits ="";
				String name = "";
				String duration = "";
				String tutor = "";
				
				n=course.get(i).getCourseName();
				c=course.get(i).getCourseCredits();
				d=course.get(i).getCourseDuration();
				t=course.get(i).getCourseTutor();
				
				if(n.equals("")||c.equals("credits")||d.equals("months")||t.equals("")){
					if(n.equals("")){
						name="please insert name\n";
						res= Response.status(Status.BAD_REQUEST).entity(name).build();
					}
					if(c.equals("credits")){
						credits="please choose credits\n";
						res= Response.status(Status.BAD_REQUEST).entity(name+credits).build();
					}
					if(d.equals("months")){
						duration = "please choose months\n";
						res= Response.status(Status.BAD_REQUEST).entity(name+credits+duration).build();
					}
					if(t.equals("")){
						tutor="please insert Tutor";
						res= Response.status(Status.BAD_REQUEST).entity(name+credits+duration+tutor).build();
					}
				}else{
					CourseDAO.instance.insertCourse(course.get(i));
					res= Response.status(Status.BAD_REQUEST).entity("One record is inserted").build();
				}
				
			}
			return res;
			
		}
		

}
