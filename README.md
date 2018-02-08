Smelly Mars Rover movement code refactoring exercise
=============================================

Smelly Mars Rover movement code to practice refactoring.

We'll use it to learn to recognize some code smells
and to fix them applying some useful refactorings.

## Description
In this exercise we'll refactor [a particularly smelly implementation of the movement of the rover](http://bit.ly/1X5cxhB) from the [Mars Rover kata](https://anirudhbhargava7.wordpress.com/2014/04/01/mars-rover-kata/). 

This is a summary of the behavior of the rover:

 - It's located on a grid at some point with coordinates (x,y) and facing a direction encoded with a character.

 - The meaning of each direction character is:

      - N -> North

      - S -> South

      - E -> East 

      - W -> West

 - The rover receives a sequence of commands (a string of characters) which are codified in the following way:

      - When it receives an **f**, it moves forward one position in the direction it is facing.

      - When it receives a **b**, it moves backward one position in the direction it is facing.

      - When it receives a **l**, it turns left changing its direction.

      - When it receives a **r**, it turns right changing its direction.
 
This initial code was created using TDD, but the coders unfortunately skipped the refactoring step of TDD. 

For this reason, even though, the code is fully tested and behaves as expected, it's full of communication and maintanability problems.

We need to refactor it!