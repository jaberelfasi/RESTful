var home={}
//insert course
home.insertCourse = function(){
	
	var courseName=$(".courseName").val();
	var courseTutor=$(".courseTutor").val();
	var courseCredits=$(".courseCredits").val();
	var courseDuration=$(".courseDuration").val();
	
	$.ajax({
	    type: "POST",
	    url: "http://localhost:9999/mmu.elfasij.restful/rest/courses/test",
	    dataType: "xml",
	    contentType: "application/xml",
	    data: "<courses><course><courseCredits>" +
	    		courseCredits+"</courseCredits><courseDuration>" +
	    		courseDuration+"</courseDuration>" +
	    		"<courseID>" +
	    		"</courseID><courseName>" +
	    		courseName+"</courseName><courseTutor>" +
	    		courseTutor+"</courseTutor></course></courses>",
	    success: function (res) {
	        alert(res.responseText);
	    },
	    error: function (res) {
	        alert(res.responseText);
	    }
	}); 
	
}

home.getAllCourses = function(){
	
	$('#xmlresult').empty()
	$('<tr><td>Course ID</td><td>Course Name</td><td>Course Credits</td><td>Course Duration</td><td>Course Tutor</td></tr>').appendTo('#xmlresult');
	 $.ajax({
         type: "GET",
         url: "http://localhost:9999/mmu.elfasij.restful/rest/courses",
         dataType: "xml",
         success: function (xml) {
        	 
             $(xml).find('course').each(function () {
                 var id = $(this).find('courseID').text();
                 var name = $(this).find('courseName').text();
                 var credits = $(this).find('courseCredits').text();
                 var duration = $(this).find('courseDuration').text();
                 var tutor = $(this).find('courseTutor').text();
                 $('<tr><td>' + id + '</td><td>' + name + '</td><td>' + credits + '</td><td>' + duration + '</td><td>' +tutor + '</td></tr>').appendTo('#xmlresult');
             });
             
         },
         error: function (xhr) {
             alert(xhr.responseText);
         }
     });
}

home.findCourses=function(){
	
	$('#xmlresult').empty()
	var searchTerm=$(".searchTerm").val();
		$('<tr><td>Course ID</td><td>Course Name</td><td>Course Credits</td><td>Course Duration</td><td>Course Tutor</td></tr>').appendTo('#xmlresult');
		$.ajax({
			type: "GET",
			url: "http://localhost:9999/mmu.elfasij.restful/rest/courses/"+searchTerm,
			dataType: "xml",
			success:
				function (xml) {
	            $(xml).find('course').each(function () {
	                var id = $(this).find('courseID').text();
	                var name = $(this).find('courseName').text();
	                var credits = $(this).find('courseCredits').text();
	                var duration = $(this).find('courseDuration').text();
	                var tutor = $(this).find('courseTutor').text();
	                $(this).remove();
	                $('<tr><td>' + id + '</td><td>' + 
	                name + '</td><td>' + credits + '</td><td>' + duration + '</td><td>' +
	                             tutor + '</td></tr>').appendTo('#xmlresult');
	            });
	        },
	        error: function (xhr) {
	            alert(xhr.responseText);
	        },
	        finish: function (xml){
	        	$(xml).remove();
	        }
		});
		
	
	
}

home.autocomplete=function(){
	var searchTerm=$(".searchTerm").val();
	if(searchTerm!=""){
		$.ajax({
			type: "GET",
			url: "http://localhost:9999/mmu.elfasij.restful/rest/courses/"+searchTerm,
			dataType: "xml",
			success:
				function (xml) {
				var courseNameArray=[];
				var i=0;
	            $(xml).find('course').each(function () {
	                var name = $(this).find('courseName').text();
	                courseNameArray[i]=  name;
	                i++;
	                $(this).remove();
	                });
	            $("#tags").autocomplete({
	                source: courseNameArray
	              });
	        },
	        error: function (xhr) {
	            alert(xhr.responseText);
	        },
	        finish: function (xml){
	        	$(xml).remove();
	        }
		});
	}
	
}

home.validateSearch=function(){
	var searchTerm=$(".searchTerm").val();
	
	if(searchTerm==""){
		alert("please insert search term");
	}else{
		home.findCourses();
	}
}
$(document).ready(function() {
    $(".btnSearch").click(home.validateSearch);
    $(".getAllCoursesClass").click(home.getAllCourses);
    $(".submitForm").click(home.insertCourse);
    $(".searchTerm").keyup(home.autocomplete);
});