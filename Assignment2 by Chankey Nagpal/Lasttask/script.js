
var students = [];

function loadStudents() {
  var data = localStorage.getItem('studentsData');
  if (data) {
    students = JSON.parse(data);
  }
}

function saveStudents() {
  localStorage.setItem('studentsData', JSON.stringify(students));
}

function isValidName(name) {
  return name && name.replace(/\s/g, '').length > 0;
}

function isValidMark(mark) {
  return !isNaN(mark) && mark >= 0 && mark <= 100;
}

function calculateTotal(marks) {
  var sum = 0;
  for (var i = 0; i < marks.length; i++) {
    sum += marks[i];
  }
  return sum;
}

function calculateAverage(marks) {
  return Math.round((calculateTotal(marks) / marks.length) );
}

function renderTable() {
  var tbody = document.getElementById('studentsTable').getElementsByTagName('tbody')[0];
  tbody.innerHTML = '';
  for (var i = 0; i < students.length; i++) {
    var student = students[i];
    var tr = document.createElement('tr');
    // Name
    var tdName = document.createElement('td');
    tdName.textContent = student.name;
    tr.appendChild(tdName);
    // Subject marks
    for (var j = 0; j < 5; j++) {
      var tdMark = document.createElement('td');
      tdMark.textContent = student.marks[j];
      tr.appendChild(tdMark);
    }
    // Total
    var tdTotal = document.createElement('td');
    tdTotal.textContent = calculateTotal(student.marks);
    tr.appendChild(tdTotal);
    // Average
    var tdAvg = document.createElement('td');
    tdAvg.textContent = calculateAverage(student.marks).toFixed(2);
    tr.appendChild(tdAvg);
    tbody.appendChild(tr);
  }
}

function addStudent() {
  var name = prompt('Enter student name:');
  if (!isValidName(name)) {
    alert('Name cannot be empty.');
    return;
  }

  var marks = [];
  for (var i = 1; i <= 5; i++) {
    var markStr = prompt('Enter marks for Subject ' + i + ' (0-100):');
    // Try to parse float for validation
    var mark = parseFloat(markStr);
    if (!isValidMark(mark)) {
      alert('Invalid mark for Subject ' + i + '. Please enter a number between 0 and 100.');
      return;
    }
    marks.push(mark);
  }

  students.push({ name: name, marks: marks });
  saveStudents();
  renderTable();
}

document.getElementById('addStudentBtn').onclick = addStudent;

// On page load
window.onload = function() {
  loadStudents();
  renderTable();
};
