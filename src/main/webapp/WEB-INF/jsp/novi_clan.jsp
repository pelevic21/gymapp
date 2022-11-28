<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="com.gymapp.model.SpisakClanova"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<%@ include file = "header.jsp" %>
   <div class="welcome-box">
 <div class="header-box">
 <h2 class="table_hdrs" style="padding:50px; ">ADMIN PANEL</h2></div>   

    <div class="container">

        <form:form method="POST" action="/novi_clan" modelAttribute="clan" class="form-novi-clan">
        
            <h2 class="form-signin-heading table_hdrs">Dodaj novog clana</h2>
            
            <!--  this is first row  -->
             <div class="row">
        <div class="col-12 col-md-6"> 
            <spring:bind path="ime">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="ime" class="form-control" placeholder="Ime"
                                autofocus="true"></form:input>
                    <form:errors path="ime"></form:errors>
                </div>
            </spring:bind>
          </div> 
          <div class="col-12 col-md-6"> 
              <spring:bind path="prezime">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="prezime" class="form-control" placeholder="Prezime"
                                autofocus="true"></form:input>
                    <form:errors path="prezime"></form:errors>
                </div>
            </spring:bind>
          </div> 
          </div> 
          
          <!--  this is second row  -->
            <div class="row">
        <div class="col-12 col-md-6"> 
            <spring:bind path="mail">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="mail" class="form-control" placeholder="Mail"
                                autofocus="true"></form:input>
                    <form:errors path="mail"></form:errors>
                </div>
            </spring:bind>
            </div> 
            <div class="col-12 col-md-6"> 
             <spring:bind path="datumRodjenja">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="datumRodjenja" class="form-control" placeholder="Datum rodjenja"
                                autofocus="true"></form:input>
                    <form:errors path="datumRodjenja"></form:errors>
                </div>
            </spring:bind>
            </div> 
            </div> 
            
            <!--  this is third row  -->
            
           <div class="row">
            <div class="col-12 col-md-6"> 
            <spring:bind path="brClanskeKarte">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="brClanskeKarte" class="form-control" placeholder="Broj clanske karte"
                                autofocus="true"></form:input>
                    <form:errors path="brClanskeKarte"></form:errors>
                </div>
            </spring:bind>
            </div>
           <div class="col-12 col-md-6"> 
           <spring:bind path="brTelefona">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="brTelefona" class="form-control" placeholder="Broj telefona"
                                autofocus="true"></form:input>
                    <form:errors path="brTelefona"></form:errors>
                </div>
            </spring:bind>
            </div>
            </div>
      		</div>
           </div>
 
            </div>
           
            <button class="lg-btn btn btn-lg btn-block" type="submit">Snimi</button>
        </form:form>

    </div>

<%@ include file = "footer.jsp" %>