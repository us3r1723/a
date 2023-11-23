const form = document.getElementById('busca');
form.addEventListener('submit', function (event) {
    event.preventDefault();

    // Obtém o valor da caixa de pesquisa
    const valorBusca = document.getElementById('txtBusca').value.toLowerCase();

    // Filtra os carros com base na cor
    const carrosFiltrados = carros.filter(function (carro) {
        return carro.modelo.toLowerCase().includes(valorBusca);
    });

    // Exibe os resultados ou alerta se nenhum carro for encontrado
    if (carrosFiltrados.length > 0) {
        exibirResultados(carrosFiltrados);
    } else {
        alert('Desculpe, não temos esse modelo. Refaça sua busca!!!');
        this.reset();
    }
});

function exibirResultados(carros) {
    const tabela = document.querySelector('.table-car');

    // Limpa a tabela antes de exibir novos resultados
    tabela.innerHTML = '';

    // Para cada carro, cria uma linha na tabela
    carros.forEach(function (carro) {
        const linha = document.createElement('tr');
        linha.innerHTML = `
            <td>${carro.marca}</td>
            <td>${carro.modelo}</td>
            <td>${carro.ano}</td>
            <td>${carro.cor}</td>
            <td>${carro.transmissao}</td>
            <td>${carro.combustivel}</td>
            <td>${formatarMoeda(carro.preco)}</td>
        `;
        tabela.appendChild(linha);
    });
}