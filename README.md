# <h2>Text File Reader</h2>
A simple Java solution for reading a text file. It contains one abstract class with a single argument mehtod "readFile" that returns a List object of type String that contains the lines of the text file. This project also contains one concrete child class with single argument mehtod "readTextFile". This child class calls it's parent methods and returns a List object.

<h2>Installation</h2>
Extend the base class with either overriding the parent's methods or call and return the parent's methods.

<h2>Concrete Class Usage</h2>
Generate a jar file then include it in your project's build path and call the child's readTextFile method.

<h2>Motivation</h2>
I suppose its a lazy reason but I did not want to have to type the code from scratch any time a project I am working requires the ability to read a text file.

<h2>Info</h2>
This project does not contain any test cases but some may be added after cloning. The readFile method will either return a List object containing the lines of text upon successful read or null if otherwise.
