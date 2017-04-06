<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h2>My menu</h2>
<hr>
<div id="profilePhoto" class="row">
	<c:choose>
		<c:when test="${mem_savefile == null }">
		<img class="img-responsive" src="./resources/img/logo.png" alt="">
		</c:when>
		<c:otherwise>
		<img class='img-responsive' src='download?mem_id=${mem_id }' height='150' width='170' alt='profile'>
		</c:otherwise>
	</c:choose>
	
</div>
<div id="myMenu1" class="row">
	<p><b>${mem_nickname }</b></p>
	<p><a>update</a></p>
</div>
<br>
<div id="myMenu2" class="row">
</div>
<input type="hidden" id="mem_id" value="${mem_id }">
