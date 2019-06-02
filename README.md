# Snakes-And-Ladder-back-end-code-in-java
This is the back-end code for the very popular game snakes and ladder. This code is written in such a ways that either 2 persons or 3 persons or 4 persons can play it all together. 

Scalability is very simple. This code can be easily modified for more than 4 persons playing the game. So no need to worry about the extension in user.  

The code is written in such a way that it generate the position of ladder and snakes at run time this makes the game a fair one.The code has been written in core java.

Basically I have used single linked list data structure with  modified node.
Node is defines as:

Node{
int data;
Node next;
Node random;
}

This random points to some next node or previous node which makes it acts as a snakes or a ladder. During the run time of the code the position of snakes and ladder is determined randomly. 

Problem: 1.Not a user friendly one. Since graphics is missing.!
         2.code is bit long this can further be reduced.
