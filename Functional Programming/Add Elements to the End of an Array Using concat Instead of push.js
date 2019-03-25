/*
	Change the nonMutatingPush function so it uses concat to add newItem to the end of original instead of push. The function should return an array
 */
function nonMutatingPush(original, newItem) {
  // Add your code below this line
 return original.concat(newItem);
  
  // Add your code above this line
}
var first = [1, 2, 3];
var second = [4, 5];
nonMutatingPush(first, second);
