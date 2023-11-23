 function totalCarros(carros, busca) {
    const quantidadeCarros = carros.reduce((contador, carro) => {
        // Verifica se o carro atende à condição de busca
        if (
            (busca === 'transmissao' && carro.transmissao.toLowerCase() === 'automática') ||
            (busca === 'combustivel' && carro.combustivel.toLowerCase() === 'elétrico')
        ) {
            contador++;
        }

        // Retorna o contador atualizado
        return contador;
    }, 0);

    // Retorna a quantidade total de carros que atendem à condição
    return quantidadeCarros;
}