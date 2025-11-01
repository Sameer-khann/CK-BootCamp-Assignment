// Task 1

const add = (a, b) => a + b;

let ans = add(4, 8)
console.log(ans)

// Task 2

const greet = (name, message = 'Welcome!') => {
    console.log(name, message)
}

greet("Samir")

// Task 3

const formatString = (name, age) => {
    console.log(`Hello, my name is ${name} and I am ${age} years old.`)
}

formatString("Samir", 20)

// Task 4

const person = {
    name: 'Alice',
    age: 25,
    address: {
        city: 'New York',
        country: 'NY'
    }
};

const objectDestructuring = () => {

    const { name, address, address: { city } } = person
    console.log(`${name} lives in ${city}`)
    console.log(address)
}

objectDestructuring()

// Task 5

const arrSum = (...arr) => {
    let ans = 0;
    for (let i = 0; i < arr.length; i++) {
        ans += arr[i];
    }

    console.log(`The sum of all the elements of this array is  ${ans}`)
}

arrSum(42, 36, 21, 82, 34)

// Task 6

const filterEvens = (arrNum) => {
    let newArr = arrNum.filter(val => val % 2 == 0)

    console.log(`New Array which contain only even number is  ${newArr}`)
}
var evenArr = [3, 6, 2, 8, 0, 4, 15, 14]
filterEvens(evenArr)

// Task 7

const doubleValues = (arrNum) => {

    let newArr = arrNum.map(val => val * 2)
    console.log(`New Array with double value is  ${newArr}`)
}

doubleValues(evenArr)

// Task 8

const findMax = (arr) => {
    let newVal = Math.max(...arr)

    console.log(newVal)
}

findMax([3, 5, 7, 2, 8, 12, 9, 15]);

// Task 9

const data = [
    {
        name: "Bob",
        age: 24
    },
    {
        name: "Alice",
        age: 21
    }
]

const arrObjDestucturing = (data) => {
    const [{ name, age }, {
        name: name2, age: age2
    }] = data

    console.log(`${name2}’s age is ${age}.`)
}

arrObjDestucturing(data)

// Task 10

const data10 = [{
    "id": 1,
    "title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
    "price": 109.95,
    "description": "Your perfect pack for everyday use and walks in the forest. Stash your laptop(up to 15 inches) in the padded sleeve, your everyday",
    "category": "men's clothing",
    "image": "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
    "rating": {
        "rate": 3.9,
        "count": 120
    }
}]

const manipulationArrObj = (data) => {
    const [{ id, title, rating: { rate, count } }] = data
    // const returnObj = { id, title, rate, count}

    console.log([{ id, title, rate, count }])
}

manipulationArrObj(data10)

// Task 11

const fun = (name = "abc") => {
    if (name) {
        console.log("if", name);
    } else {
        console.log("else", name);
    }
};
fun("");

// Task 12 

const deepClone = (obj) => {

    if (Array.isArray(obj)) {
        const copyArr = []
        for (let i in obj) {
            copyArr.push(deepClone(obj[i]))
        }
        console.log(` Array Deepclone : ${copyArr}`)
        return copyArr
    }

    const copyObj = {}
    for (let i in obj) {
        if (obj.hasOwnProperty(i)) {
            copyObj[i] = deepClone(obj[i]);
        }
        console.log(`Object Deepclone : ${copyObj}`)
    }
    return copyObj

    return 0
}

const obj = { a: 1, b: { c: 2 } };
const clonedObj = deepClone(obj);
clonedObj.b.c = 42;
console.log(obj.b.c);

// Task 13

console.log("Task 13 starts")

const flattenArray = (arr) => {
    var ansFlat = []

    for (let i of arr) {
        if (Array.isArray(i)) {
            ansFlat = ansFlat.concat(flattenArray(i))
        }
        else{
            ansFlat.push(i)
        }
    }

    return ansFlat
}

let ans13 = flattenArray([1, [2, [3, [4, 5]]]]);
console.log(ans13)