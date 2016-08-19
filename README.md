<h2>Text File Reader</h2>
A simple Java solution for reading a text file. It contains one abstract class with a single argument mehtod "readFile" that returns a List object of type String that contains the lines of the text file. This project also contains one concrete child class with single argument mehtod "readTextFile". This child class calls it's parent methods and returns a List object.

<h2>Installation</h2>
<ol>
  <li>Download the project's zip</li>
  <li>Compile the project</li>
  <li>Generate a jar file</li>
  <li>Add the jar the project's build path</li>
  <li>Call from the TextFileReader concrete class or sub-class it's parent</li>
</ol>

<h2>Motivation</h2>
Working on a previous project, I needed the ability to read from a text file, so I created a Java library to facilitate that task. And I uploaded to Github as a reference or possible library for others.

<h2>Info</h2>
This project does not contain any test cases but some may be added after cloning. The readFile method will either return a List object containing the lines of text upon successful read or null if otherwise.

