// Task 1

document.getElementById("infoForm").addEventListener("submit", function (event) {
    const name = document.getElementById("name").value.trim();
    const age = parseInt(document.getElementById("age").value);
    console.log(name)
    console.log(age)

    if (name === "") {
        alert("Please enter your name.");
        event.preventDefault();
    }
    else if (age < 18 || isNaN(age)) {
        alert("Please make sure age is 18 or above.");
        event.preventDefault();
    }

    else {
        alert("Form submitted successfully!");
    }
});

// Task 2

document.getElementById("hoverbox").addEventListener("mouseover", function(){
    this.style.backgroundColor = "red"
})

document.getElementById("hoverbox").addEventListener("mouseout", function(){
    this.style.backgroundColor = "aqua"
})
