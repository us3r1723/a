

const form = document.querySelector('#dados');
const tbody = document.querySelector('.historico');


form.addEventListener('submit' , (event) => {

    event.preventDefault();

    const campos = [

        form.querySelector('#nome').value,
        form.querySelector('#celular').value,
        form.querySelector('#origem').value, 
        form.querySelector('#destino').value, 
        form.querySelector('#data').value, 
        form.querySelector('#modelo').value, 
    
    ];

    const tr = document.createElement('tr');
    campos.forEach(campo => {

 
        const td = document.createElement('td');
        td.textContent = campo;
        tr.appendChild(td);

    });

    
    tbody.appendChild(tr);

    form.reset();

});

