Exceptional Handling:-
--------------------

Exception is an event which will cause program termination.

Errors:-
------

1). Syntax
2). Logical

Types of exceptions :-
--------------------

1). The exceptions which are identified by java compiler.
Ex:-
---
InteruptedException.
FileNotFoundException..
IOException etc....

2). Un-Checked Exceptions:-
--------------------------

The exceptions which are not identified by the java compiler.

Ex:-
---

ArithmeticException.
NullPointerException.
ArrayIndexOutOfBoundsExceptions etc...


By using try and catch blocks we will hadle the exceptions.

try
{
statement
}
catch(ArithmeticException e)
{
statements
}


try
{
statements
}
catch()
{
}
finally
{
}

case1: Exception occured, catch block handled---> finally block will execute.
case2: Exception occured, catch block Not handled --> finally block will execute
case3: Exception does not occured, catch block ignored --> finally block will execute.

Checked Exception can be handled by two ways:-
---------------------------------------------

Using try..catch
throws

What is diffrence b/w cheched exceptions and unchecked exception ?








