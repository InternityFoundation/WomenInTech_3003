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
<h1>Predict the output of following Java Programs.</h1>
<hr/>
<form name="examForm" method="post" action="ExamServer.jsp">
Program 1
// filename Main.java 
class Test { 
    protected int x, y; 
} 
  
class Main { 
    public static void main(String args[]) { 
        Test t = new Test(); 
        System.out.println(t.x + " " + t.y); 
    } 
} <br/>
<input type="radio" name="ans1" value="00">00
<input type="radio" name="ans1" value="10">10
<input type="radio" name="ans1" value="01">01
<input type="radio" name="ans1" value="11">11
<br/><br/>
Program 2
// filename Test.java 
class Test { 
    public static void main(String[] args) { 
        for(int i = 0; 1; i++) { 
            System.out.println("Hello"); 
            break; 
        } 
    } 
}<br/>
<input type="radio" name="ans2" value="Compiler Error">Compiler Error
<input type="radio" name="ans2" value="Hello">Hello
<input type="radio" name="ans2" value="error">error
<input type="radio" name="ans2" value="hello">hello
<br/><br/>
Program 3
// filename Main.java 
class Main { 
    public static void main(String args[]) { 
        System.out.println(fun()); 
    }  
    static int fun() { 
        return 20; 
    } 
} 
 <br/>
<input type="radio" name="ans3" value="21">21
<input type="radio" name="ans3" value="10">10
<input type="radio" name="ans3" value="Compiler Error">compiler Error
<input type="radio" name="ans3" value="20">20
<br/><br/>
<input type="submit" value="Check Your Result"/>
</form>
</body>
</html>