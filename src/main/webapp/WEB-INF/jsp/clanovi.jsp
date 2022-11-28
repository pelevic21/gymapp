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
      <th>Ime</th>
      <th>Prezime</th>
      <th>Datum rodjenja</th>
      <th>Mail</th>
      <th>Broj telefona</th>
      <th>Clanska karta</th>
    </tr>
  
  <tbody>  
  

    <c:forEach items="${clanovi}" var="clanovi">
    <tr>
      <th>${clanovi.ime}</th>
      <th>${clanovi.prezime}</th>
      <th>${clanovi.datumRodjenja}</th>
      <th>${clanovi.mail}</th>
      <th>${clanovi.brTelefona}</th>
      <th>${clanovi.brClanskeKarte}</th>
    
     
    </tr>
     </c:forEach>
  </tbody>
</table>
       
  </div>  
    
    

<%@ include file = "footer.jsp" %>