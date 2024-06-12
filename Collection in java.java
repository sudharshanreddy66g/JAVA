Day20
-----
Collections in Java
-------------------

Collection in java interface.		  Map(I)
						\
	Collectio(I)			     HashMap(C)
	 |	  |
	List(I)   Set(I)			Name:mobile
	  \	      \				x: 12345
	ArrayList(C)  HashSet(C)       Keys -->	y:56789  ---> Values
						z:234589
	
	                                        id:name
						101:john
						102:scott
						103:mary




Collections:-
------------
--> Collection - To represent group of elements/objects/data into single entity.
--> "Collection" is an interface available in java.util

ArrayList - Is class which is implemented List interface.
--------------------------------------------------------

1). Hetrogenious data - Allowed
2). Insertion order - Preserved(Index)
3). Duplicate elements -- Allowed
4). Multiple nulls -- Allowed


String m1()
{
}
String x=m1()

Iterator iterator()
{
---
}

Iterator it=mylist.iterator();


HashSet - A class implemented Set interface.
--------
1). Hetrogenios data ---> Allowed.
2). Insertion order ----> Not preserved (Index not supported).
3). Duplicate elements -> Not allowed.
4). Multiple nulls Not allowed / Only single null is allowed.


HashMap:- A class implemented Map interface.
--------
1). Data can be stored in the form of key, value pairs.
2). Key is unique. But we can have duplicate values.
3). Insertion order not preserved(Index not followed).



