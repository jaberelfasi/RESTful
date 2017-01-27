<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Search Courses</title>
<link rel="stylesheet" href="./css/jquery-ui.css" type="text/css" />
<link rel="stylesheet" href="./css/styles.css" type="text/css" />
<script src="./scripts/ajaxData.js" type="text/javascript"></script>
<script src="./scripts/ajaxUtils.js" type="text/javascript"></script>
<script src="./scripts/ajaxParamString.js" type="text/javascript"></script>
<script src="./scripts/jquery.min.js"></script>
<script type="text/javascript" src="./scripts/jqueryData.js"></script>
<script type="text/javascript" src="./scripts/jquery-ui.js"></script>
  
<script type="text/javascript">
	function openPage(pageURL) {
		window.location.href = pageURL;
	}
</script>

</head>
<body>
	<div align="center">
		<table border="5">
			<tr>
				<th class="title">Search Courses And Get Results Via Different
					Formats</th>
			</tr>
		</table>
		<p />
		<div align="left">
			<form action="getAllCourses.jsp">
				<input type="button" value="go back to home page"
					onclick="openPage('index.jsp')" />
			</form>
		</div>
		<fieldset>
			<legend>Via XML</legend>
			<form action="#">
				<label for="search-term-xml">Search Word:</label> <input type="text"
					id="tags" name="textbx1" class="searchTerm" />
				<input type="button" value="get Courses" class="btnSearch" />
			</form>
			<div id="searchResult">
				<table border='1' id="xmlresult" class="emptyTable">
					<!-- Make a Header Row -->
					<tr><td>Course ID</td><td>Course Name</td><td>Course Credits</td><td>Course Duration</td><td>Course Tutor</td></tr>
				</table>
			</div>
		</fieldset>
		<p />
		

	</div>

	<p />
	<div align="center">
		<form action="getAllCourses.jsp">
			<input type="button" value="go back to home page"
				onclick="openPage('index.jsp')" />
		</form>
	</div>
</body>
</html>