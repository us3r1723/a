// A função recebe um parâmetro
function formatarMoeda(valor) {

    const valorFormatado = new Intl.NumberFormat('pt-BR', {

        // Define o estilo de formatação como 'currency', indicando que queremos formatar como moeda.
        style: 'currency',

        // Define a moeda como o Real brasileiro (BRL).
        currency: 'BRL'

        // Chama o método 'format' do objeto Intl.NumberFormat, passando o 'valor' como argumento.Resultado é armazenado na variável 'valorFormatado'.
    }).format(valor);

    // Retorna a string formatada, que representa o 'valor' como moeda brasileira.
    return valorFormatado;
}