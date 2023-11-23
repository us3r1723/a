function somarEstoque(carros) { 
    const total = carros.reduce((acumulador, carro) => acumulador + carro.preco, 0);
    return total;
}