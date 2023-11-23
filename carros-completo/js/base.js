 // O método filter é usado para criar um novo array com todos os elementos que passam em um teste implementado pela função fornecida.
 const carrosCor = carros.filter(carro => carro.cor.toLowerCase() === 'vermelho');
 console.log(carrosCor);

 // O método map é usado para criar um novo array baseado nos resultados da aplicação de uma função a cada elemento do array original.

 const precosComDesconto = carros.map(carro => carro.preco * .5);
 console.log(precosComDesconto);