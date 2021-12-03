## Predefine-functional-interface
### Predefined functional interfaces to deal with functional programming by using lambda, with increased code, complexity also increases so if we have already define interfaces then we only need to write lambda expression.
Few important and fundamental predefined functional interfaces are: </br>
Consumer: Consumer interface has a single abstract method that accepts one argument of type but returns nothing. </br>
Supplier: Supplier interface has a single abstract method get that doesn’t accept any argument and returns an object of type. </br>
Predicate: Predicate interface has a single abstract test method that accepts an object of type and returns a boolean value. </br>
Function: Functional interface has a method apply, that takes one argument of type and returns a value of type. </br>

Lambda expression file contains example on predefine functional interfaces: </br>
i) A functionality that checks whether a given number is even. </br>
ii) To check whether a number is even and divisible by 5 as well.</br>
iii) To get a random number less than 100. </br>
iv) To invert the sign of a numerical value and print it. </br>
v) To print a number, its inverted value and then its doubled value. </br>
vi) A Supplier that supplies a random number, a Predicate that checks whether this supplied number is even and finally a Consumer that prints the answer provided by the predicate. This is supplier-predicate-consumer chaining. </br>
vii) square of a number. </br> 
viii) To find area of circle using consume method of function.</br>

In next example a custom employee object is created on which different conditions are applied using these interfaces like checking salary is less than 50k
