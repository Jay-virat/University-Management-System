const form = document.getElementById('facultyForm');
const list = document.getElementById('facultyList');

form.addEventListener('submit', async (e) => {
  e.preventDefault();
  const data = {
    name: form.name.value,
    id: form.id.value,
    department: form.department.value,
    qualification: form.qualification.value
  };

  await fetch('http://localhost:8080/api/faculty', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(data)
  });

  form.reset();
  loadFaculty();
});

async function loadFaculty() {
  const res = await fetch('http://localhost:8080/api/faculty');
  const data = await res.json();
  list.innerHTML = '';
  data.forEach(f => {
    const li = document.createElement('li');
    li.textContent = `${f.name} | ${f.id} | ${f.department} | ${f.qualification}`;
    list.appendChild(li);
  });
}

loadFaculty();
