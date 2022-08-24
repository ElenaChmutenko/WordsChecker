# WordsChecker

The program quickly answers the question whether the input word is in the text 

 

* Class `WordsChecker` 
  * takes as a constructor parameter the text in which we will search for the word and stores it in the field
  * constructs a new set containing the unique words of this text
  * Method `HasWord` takes a word and returns the boolean answer to the question if the text contains this word.
Text is split into words
  ```java
  text.split("\\P{IsAlphabetic}+");
  ```
  and placed in the collection for a quick chek using the standard set method `contains()`.


* Сlass `Main` demonstrates the work of class `WordsChecker` with classic graphic design text Lorem ipsum as an example.

