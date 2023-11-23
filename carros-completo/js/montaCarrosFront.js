const tbody = document.querySelector('.table-car');
console.log(tbody);
carros.forEach(carro => {
    tbody.innerHTML += ` 
        <tr'>
            <td>${carro.marca}</td>
            <td>${carro.modelo}</td>
            <td>${carro.ano}</td>
            <td>${carro.cor}</td>
            <td>${carro.transmissao}</td>
            <td>${carro.combustivel}</td>
            <td>${formatarMoeda(carro.preco)}</td>
        </tr>
    `;
});

//exibindo total de carros automáticos
document.querySelector('#automaticos').textContent = totalCarros(carros,'transmissao');

//exibindo total de carros elétricos
document.querySelector('#eletricos').textContent = totalCarros(carros,'combustivel');

//somando o estoque
document.querySelector('#total').textContent = formatarMoeda(somarEstoque(carros));