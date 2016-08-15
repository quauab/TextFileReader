# <h2>Text File Reader</h2>
A simple Java solution for reading a text file. It contains a single abstract class with an overloaded single argument method "readFile", that returns a List object of type String containing the lines in the text file. The argument can be a Path, File or String path to the file.

<h2>Usage</h2>
Download or clone the project -
Generate a jar library -
Then include the jar in the project's build and call at will.

<h2>Motivation</h2>
I suppose its a lazy reason but I did not want to have to type the code from scratch any time a project I am working requires the ability to read a text file.

<h2>Info</h2>
This project does not contain any test cases but some may be added after cloning. The readFile method will either return a List object containing the lines of text upon successful read or null if otherwise.
