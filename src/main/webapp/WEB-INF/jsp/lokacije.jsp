<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ include file = "header.jsp" %>


<div class="welcome-box">
<div class="header-box">

<h2 class="table_hdrs" style="padding:50px; ">Lista clanova</h2></div>

	<table class="table table-inverse">
  					
  <thead>
  
    <tr>
      <th>Naziv</th>
      <th>Adresa</th>
      <th>Mesto</th>
      <th>Mail</th>
      <th>Broj telefona</th>
    </tr>

  <tbody>  
  

    <c:forEach items="${lokacije}" var="lokacije">
    <tr>
      <th>${lokacije.naziv}</th>
      <th>${lokacije.adresa}</th>
      <th>${lokacije.mesto}</th>
      <th>${lokacije.mail}</th>
      <th>${lokacije.telefon}</th>
     
    </tr>
     </c:forEach>
  </tbody>
</table>
       
  </div>  
    
    

<%@ include file = "footer.jsp" %>