# hangman-java-project
pseudocode

* welcome message   
* create array/arrayList of words in WordLibrary (see about importing file of words)
* display new word blanked out e.g _ _ _ _ _ _ _ 
* get RANDOM new word from WordLibrary
* make function getRandomWord()
* replace each character in word by " _ "
* player enters character in terminal
* checks if character is valid input(letter)
* ->not number or special character 
* display "Invalid input" in terminal
* if character is valid change input to uppercase
* check if character is in word 
* if character is correct
* -> change all matching characters in word to show character.
* if character is incorrect 
* ->display message "You have n lives remaining"
* ->display HangmanDisplay for corresponding lives remaining
* create list of characters already entered 
* if player re-enters guess display message "You have already guessed that letter!"
* if all correct characters are entered 
* display message "Congratulations!"
* if lives = 0 and characters are still hidden
* display message "Better luck next time"   

