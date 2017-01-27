<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head><title>New Course</title>
<link rel="stylesheet"
      href="./css/styles.css"
      type="text/css"/>
<script src="./scripts/ajaxData.js"
        type="text/javascript"></script>
<script src="./scripts/ajaxUtils.js"
        type="text/javascript"></script>
<script src="./scripts/ajaxParamString.js"
        type="text/javascript"></script>
<script src="./scripts/jquery.min.js"></script>
<script type="text/javascript" src="./scripts/jqueryData.js"></script>
<script type="text/javascript" src="./scripts/jqueryValidation.js"></script>


<script type="text/javascript">
 function openPage(pageURL)
 {
 window.location.href = pageURL;
 }
</script>        
        
</head>

<body>
<div align="center">
<table border="5">
  <tr><th class="title">New Course Insertion Interface</th></tr>
</table>
<p/>
<div align="left">
	<form action="getAllCourses.jsp">
 		 <input type="button" value="go back to home page"
  			onclick="openPage('index.jsp')"/>
  </form>
</div>
<fieldset>
  <legend>New Course Form Via XML</legend>
  <form action="#" method="post">
  <label>Course Name:</label>
  <input type="text" name="name" class="courseName"/>
  <label>Course Tutor:</label>
  <input type="text" name="tutor" class="courseTutor"/><p/>
  <label>Course Credits:</label>
  <select name="credits" class="courseCredits">
  <option>credits</option>
  <option>1</option>
  <option>2</option>
  <option>3</option>
  <option>4</option>
  <option>5</option>
  </select>
  <label>Course Duration:</label>
  <select name="duration" class="courseDuration">
  <option>months</option>
  <option>1</option>
  <option>2</option>
  <option>3</option>
  <option>4</option>
  <option>5</option>
  </select>
  <p/>
  <input type="button" value="insert new course" class="submitForm"/>
  </form>
  <div id="insertion-result"></div>
</fieldset>
<p/>
</div>
<p/>
<div align="center">
	<form action="getAllCourses.jsp">
 		 <input type="button" value="go back to home page"
  			onclick="openPage('index.jsp')"/>
  </form>
</div>

</body></html>