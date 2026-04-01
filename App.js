import React, { useState } from "react";

function App() {

  const [students, setStudents] = useState([]);

  const [formData, setFormData] = useState({
    id: "",
    name: "",
    age: "",
    department: "",
    marks: ""
  });

  const handleAddStudent = () => {

  if (!formData.id || !formData.name) {
    alert("ID and Name are required!");
    return;
  }

  setStudents([...students, formData]);

  setFormData({
    id: "",
    name: "",
    age: "",
    department: "",
    marks: ""
  });
};

const handleDelete = (id) => {
  const updatedStudents = students.filter(
    (student) => student.id !== id
  );

  setStudents(updatedStudents);
};

 return (
  <div style={{ padding: "20px" }}>
    <h1>Student Management System</h1>

    <h2>Add Student</h2>

    <input
      type="text"
      placeholder="ID"
      value={formData.id}
      onChange={(e) =>
        setFormData({ ...formData, id: e.target.value })
      }
    />

    <br /><br />

    <input
      type="text"
      placeholder="Name"
      value={formData.name}
      onChange={(e) =>
        setFormData({ ...formData, name: e.target.value })
      }
    />

    <br /><br />

    <input
      type="text"
      placeholder="Age"
      value={formData.age}
      onChange={(e) =>
        setFormData({ ...formData, age: e.target.value })
      }
    />

    <br /><br />

    <input
      type="text"
      placeholder="Department"
      value={formData.department}
      onChange={(e) =>
        setFormData({ ...formData, department: e.target.value })
      }
    />

    <br /><br />

    <input
      type="text"
      placeholder="Marks"
      value={formData.marks}
      onChange={(e) =>
        setFormData({ ...formData, marks: e.target.value })
      }
    />

    <br /><br />

   <button onClick={handleAddStudent}>
  Add Student
</button>



<h2>Student List</h2>

{students.map((student, index) => (
  <div key={index} style={{ border: "1px solid black", padding: "10px", marginBottom: "10px" }}>
    <p>ID: {student.id}</p>
    <p>Name: {student.name}</p>
    <p>Age: {student.age}</p>
    <p>Department: {student.department}</p>
    <p>Marks: {student.marks}</p>

    <button onClick={() => handleDelete(student.id)}>
  Delete
</button>
  </div>
))}
  </div>
);
}

export default App;