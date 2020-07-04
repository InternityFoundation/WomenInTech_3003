<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Online Exam Client</title>
<style type="text/css">
   body{background-color:black;font-family:courier;color:blue}
</style>
</head>
<body>
<h2 style="text-align:center">ONLINE EXAMINATION</h2>
<h3>Answer the following questions (5 marks for each correct answer)</h3>
<hr/>
<form name="examForm" method="post" action="ExamServer2.jsp">
Q 1 - Prefix notation is also known as? <br/>
<input type="radio" name="ans1" value="A - Reverse Polish Notation">A - Reverse Polish Notation
<input type="radio" name="ans1" value="B - Reverse Notation">B - Reverse Notation
<input type="radio" name="ans1" value="C - Polish Reverse Notation">C - Polish Reverse Notation
<input type="radio" name="ans1" value="D - Polish Notation">D - Polish Notation

<br/><br/>

Q 2 - Binary search tree is an example of complete binary tree with special attributes
 <br/>
<input type="radio" name="ans3" value="A - BST does not care about complete binary tree properties.">A - BST does not care about complete binary tree properties.
<input type="radio" name="ans3" value="B - BST takes care of complete binary tree properties.">B - BST takes care of complete binary tree properties.
<input type="radio" name="ans3" value="C - It depends upon the input.">C - It depends upon the input.
<input type="radio" name="ans3" value="D - None of the above">D - None of the above
<br/><br/>

Q 3 -In context with time-complexity, find the odd out −
 <br/>
<input type="radio" name="ans1" value="A - Deletion from Linked List.">A - Deletion from Linked List.
<input type="radio" name="ans1" value="B - Searching in Hash Table">B - Searching in Hash Table
<input type="radio" name="ans1" value="C - Adding edge in Adjacency Matrixe">C - Adding edge in Adjacency Matrix
<input type="radio" name="ans1" value="Napier">D - Polish Notation
<input type="submit" value="Check Your Result"/>
</form>
</body>
</html>