// Task 3

var arr1 = [2, 5, 7, 3, 1, 5, 8, 4, 10, 5]

console.log("Output for Task 3 : ")
console.log(arr1)
arr1.push(20)
console.log(arr1)

// Task 4

arr1.shift();
console.log("Output for Task 4 : ")
console.log(arr1)

// Task 5

arr1.splice(1, 0, 100)
console.log("Output for Task 5 : ")
console.log(arr1)

// Task 6

var oldNumber = 5;
var newNumber = 99;

arr1.forEach(function(value, index, arr) {
    if (value === oldNumber) {
        arr[index] = newNumber;
    }
});

console.log("Output for Task 6 : ")
console.log(arr1)

// Task 7

for(var i = 0; i < arr1.length; i++){
    for(var j = 0; j < arr1.length - i - 1; j++){
        if(arr1[j] > arr1[j+1]){
            var temp = arr1[j]
            arr1[j] = arr1[j+1]
            arr1[j+1] = temp
        }
    }
}

console.log("Output for Task 7 : ")
console.log(arr1)

// Task 8 

var reversedArr = []

for(var i = arr1.length - 1 ; i >= 0; i--){
    reversedArr.push(arr1[i])
}

console.log("Output for Task 8 : ")
console.log(reversedArr)

// Task 9

var findIndex = arr1.indexOf(8)

console.log("Index of 8 is", findIndex)