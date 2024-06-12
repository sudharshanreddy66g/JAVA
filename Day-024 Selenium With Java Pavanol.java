Day-024 SDET Selenium With Java | Locators - XPath " Xpath Functions | XPath Types
------------------------------------------------------------------------------

Session 24 - Selenium with Java | Locators - XPath | XPath Functions | XPath Types | 2024 New series

Day-024:-
-------
XPath:-
------

XPath is an address of the element.


DOM - Document Object Model.

There are (2)two kinds of XPath:-
--------------------------------

1). Absolute XPath(Full Xpath).
	
	Ex:- /html/body/header/div/div/div[2]/div/input

	
2). Relative xpath(partial xpath).
	Ex:- //*[@id="search"]/input

Which xpath will be prefered ?
--> Relative Xpath.


Difference between Absolute & Relative Xpath ?

1). Absolute xpath starts with / --> Represents root node.
    Relative xpath starts with // 

2). Absolute xpath do not use attributes.
    Relative xpath works with attribute.

3). Absolute xpath traverse through each node till it finds element.
    Relative xpath directly jump and find the element by using attribute.


Relative Xpath:-
---------------

1). Automatically. --> Devtools, selectorshub
2). Manually(own xpath).


/html/body/header/div/div/div[1]/div/a/img
//*[@id="logo"]/a/img



/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]
//img[@title='Your Store']


/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]
//img[@title="Your Store"]


Syntax:-
-------

//tagname[@attribte='value']
//*[@attribte='value']

ctrl+shit+o

Xpath with single attribute:-
---------------------------

//input[@placeholder='Search']

Xpath with multiple attribute:-
-----------------------------
//input[@name='search'][@placeholder='Search']


xpath with 'and' 'or' operators :-
---------------------------------

//input[@name='search' and @placeholder='Search']

//input[@name='search' or @placeholder='Search']


xpath with inner text - text() 
-------------

//a[text()='Desktops']
//a[text()='MacBook']


<a href="https://xyz.com"> Clik Me </a>

link text = yes
inner text = yes

<div>welcome</div>
linktext=no.
innetrtext=yes.


xpath with contains() :-
-----------------------

//input[contains(@placeholder,'Sea')]

xpath strats-with :-
-----------------

//input[starts(@laceholder, 'Sea')]



handling dynamic attributes:-
----------------------------

//*[@id='start' or @id='stop']
//*[contains(@id,'st')]
//*[starts-with(@id,'st')]


name=xyz001 xyz002 xyz 003 xyz004 xyz001 xyz002


//*[contans(@name,'xyz')]
//*[starts-with(@name,'xyz')]
//*[starts-with(@name,'xyz')]

name=1xyz 2xyz 3xyz 4xyz 1xyz

//*[contains(@name, 'xyz')]


name=101xyz 201xyz 301xyz 401xyz

//*[contains(@name,'xyz')]
//*[contains(@name,'01')]



chained xpath:-
--------------

//div[@id='logo']/a/img

<div></div>

//div[contains(text(), '')]
//[contains(.,'')]

































































































