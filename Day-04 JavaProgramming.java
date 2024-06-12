Day-04 JavaProgramming Date:10-04-2024
--------------------------------------

1). Relational Operators:-
--------------------------

--> Operators, which is used to compare to 2 value.
--> Return type is boolean.

1). == :- 1). 10==10= true 2). 5==2 = false
2). >  :- 1). 5>5=> false  2). 10>2 => true
3). <  :- 1). 1<2 => true  2). 100<5 => false
4). >= :- 1). 10>10=10=> true 2). 5>=10 => false.
5). <= :- 1). 5<=2=> false 2). 1<=1 => true
6). != :- 1). 10!=10 => false 2). 5!=2 => ture


Logical Operators:-
-----------------
Relational operator will accept two values to perform operation.
Where as logical operator, will accept two condition to perform, task.

Types:-
------

1). OR(||)
2). AND(&&)
3). NOT (!)

1). OR(||) :-
-------------
If any one of the condition is true,
it will return true as result.

Condition:-
---------

It is an expressionm whose final result is boolean.

P	Q	O/P
T	T	T
F	T	T
T	F	T
F	F	F

* Tom's wants to buy a T-Shirt color shold be red or black.


2). AND (&&):-
------------
It will return true, when both condition is satiesfied.

P	Q	O/P

T	F	F
F	T	F
T	T	T
F	F 	F

* Tomorrow wants to buy a T-Shirt, T-Shirt size should be small (s) and price should be less than or eual to 1000.



3). Not Operator (!):-
-------------------

Unary operator.

Syntax:-
-------
! operator.

* Not will work on boolean condition.
* This will navigation of give value.

1). !10 --> Error.
2). !true -> False
3). ! false -> true
4). ! 10==10 -> false


Ternary Operator:-
-----------------

Operator which will accept 3 operand.

1). Conditional Operator:-
-------------------------

Syntax:- op1 ? op2 : op3
------

Condition ? expression|value|variable : expresssion | value | variable ;

--> Based on operand 1 and operand 2 it will return true or false.
op1 ? op2 : op3
  
  op1     op2       op3
10==10 ? "hello" : "bye"
  \/ 
   true 

String str="hello";

5>=6 ? "hello" : 100;

Size 's'
price 850 } -- true op2 
                    "Eligible to buy";

m
	x false    op3
850	          Not eligible 





























