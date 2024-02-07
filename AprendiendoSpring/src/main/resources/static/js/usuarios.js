// Call the dataTables jQuery plugin
$(document).ready(function() {
  usuarios()
  $('#usuarios').DataTable();
});

async function usuarios() {
  fetch('/usuarios')
  .then(response => {
    if (!response.ok) {
      throw new Error('Error al obtener los datos');
    }
    return response.json();
  })
  .then(data => {
    console.log(data);
  })
  .catch(error => {
    console.error('Error:', error);
  });

  console.log(Response.data)
}
