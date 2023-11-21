// Function to reverse each word in a sentence
function reverseWords(sentence) {
  let reversedSentence = "";
  let word = "";

  // Loop through each character in the sentence
  for (let i = 0; i < sentence.length; i++) {
    // If the character is not a space, add it to the current word
    if (sentence[i] !== " ") {
      word += sentence[i];
    } else {
      // If a space is encountered, reverse the current word and add it to the result
      reversedSentence += reverseWord(word) + " ";
      word = ""; // Reset the word for the next word
    }
  }

  // Reverse the last word (or the only word if there's only one in the sentence)
  reversedSentence += reverseWord(word);

  return reversedSentence;
}

// Function to reverse a single word
function reverseWord(word) {
  let reversedWord = "";
  // Loop through each character in the word in reverse order
  for (let i = word.length - 1; i >= 0; i--) {
    reversedWord += word[i];
  }
  return reversedWord;
}

// Sample input sentence
let inputSentence = "This is a sunny day";

// Reverse the words in the input sentence
let reversedSentence = reverseWords(inputSentence);

//This code id for the user inputing the sentence
// let inputSentence = prompt("Enter a sentence:");

// // Check if the user canceled the prompt
// if (inputSentence !== null) {
//   let reversedSentence = reverseWords(inputSentence);
//   console.log(reversedSentence);
// } else {
//   console.log("User canceled the input.");
// }

// Display the original and reversed sentences
console.log(`Original Sentence:\n${inputSentence}`);
console.log(`Sentence after reversing each word:\n${reversedSentence}`);

/********************************/
/*** Few Output For This Code ***/
/********************************/

/*
Output

Sentence:
This is a sunny day
Sentence after reversing reverseword in that sentence.
sihT si a ynnus yad

*/
