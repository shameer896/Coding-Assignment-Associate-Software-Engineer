// Function to perform quicksort on an array
function quickSort(array) {
  // Base case: if the array has 1 element or is empty, it is already sorted
  if (array.length <= 1) {
    return array;
  }

  // Choose the first element as the pivot
  const pivot = array[0];
  const left = []; // Array to hold elements smaller than the pivot
  const right = []; // Array to hold elements greater than the pivot

  // Partition the array into elements smaller and greater than the pivot
  for (let i = 1; i < array.length; i++) {
    if (array[i] > pivot) {
      right.push(array[i]); // Element greater than pivot goes to the right array
    } else {
      left.push(array[i]); // Element smaller than or equal to pivot goes to the left array
    }
  }

  // Recursively apply quicksort to the left and right arrays, then concatenate the results
  return [...quickSort(right), pivot, ...quickSort(left)];
}

// Main code
let numbers = [2, 4, 1, 5, 7, 8, 9];

// Print the original array before sorting
console.log(`The array that will be sorted in descending order:\n${numbers}`);

// Call quickSort to sort the array
let result = quickSort(numbers);

// Print the sorted array
console.log(`Array after sorting in descending order:\n${result}`);


/********************************/
/*** Few Output For This Code ***/
/********************************/

/*
Output 1

The array that will be sorted in descending order:
2,4,1,5,7,8,9
VM47:36 Array after sorting in descending order:
9,8,7,5,4,2,1

*/

/*
Output 2

he array that will be sorted in descending order:
1
VM65:36 Array after sorting in descending order:
1

*/

/*
Output 3

The array that will be sorted in descending order:
2,3,4,6,1,5,7,8,9
VM76:36 Array after sorting in descending order:
9,8,7,6,5,4,3,2,1

*/