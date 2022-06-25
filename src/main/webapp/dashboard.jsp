<%@page import="java.util.List"%>
<%@page import="com.nagarro.library.models.Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard</title>
</head>
<body>
    <div class="head-section">
        <div class="left">
            <h2>Dashboard</h2>
        </div>
        <div class="right">
            <span>Welcome Mr. Raju</span>
            <button class="btn btn-success">Logout</button>
        </div>
    </div>
    <div class="body-section">
        <div>
            <h2 class="display-5">Books Listing</h2>
            <button class="btn btn-primary">Add Book</button>
        </div>
        <% List<Book> books = (List<Book>)request.getAttribute("books");
            if(books == null){
         %>
         <div>The library does not have any book.</div>
         <% }else{ %>
        <table class="table">
            <tr>
                <td>Book Code</td>
                <td>Book Name</td>
                <td>Author</td>
                <td>Date Added</td>
                <td>Actions</td>
            </tr>
            <% for(Book book: books){ %>
            <tr>
                <td><%= book.getCode() %></td>
                <td><%= book.getName() %></td>
                <td><%= book.getAuthor() %></td>
                <td><%= book.getDateCreated() %></td>
            </tr>
            <% } } %>
        </table>
    </div>
</body>
</html>