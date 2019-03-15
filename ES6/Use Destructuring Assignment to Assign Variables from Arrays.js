/*Use destructuring assignment to swap the values of a and b so that a receives the value stored in b, and b receives the value stored in a.*/
let a = 8, b = 6;
(() => {
  "use strict";
  // change code below this line
  /*let tmp = a;
  a=b; b=tmp;*/
  return [a, b] = [b, a];
  // change code above this line
})();
console.log(a); // should be 6
console.log(b); // should be 8