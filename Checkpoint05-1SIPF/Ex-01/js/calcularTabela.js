

const btn = document.querySelector('#btnDados');
const viagens = document.querySelectorAll('.viagem');




btn.addEventListener('click', ()=> {

    //index
    let maiorTempoViagem = 0;

    //elemento
    let maiorViagemHTML = null;

    //index
    let maiorGastoViagem = 0;

    //elemento
    let maiorGastoHTML = null;


    // ============================================================================

    //index
    let maiorPrecoViagem = 0;


    //index
    let menorPrecoViagem = Number.MAX_VALUE;

    //elemento
    const menorValorElemento = document.querySelector('#menorValor');

    

    viagens.forEach(viagem => {

       
        const mediaPreco = Number(viagem.querySelector('.media-preco').textContent);
        const tempoViagem = parseInt(viagem.querySelector('.duracao').textContent);


        const valorGastoHoraViagem = (mediaPreco / tempoViagem).toFixed(2);
        const valorGastoHTML = viagem.querySelector('.valor-hora').textContent = valorGastoHoraViagem;



        tempoViagem > maiorTempoViagem ? maiorViagemHTML = viagem : maiorViagemHTML = '';


        if(mediaPreco > maiorGastoViagem) {

            maiorGastoViagem = mediaPreco;
            maiorGastoHTML = viagem;

        }

        if(valorGastoHoraViagem > maiorPrecoViagem) {
            maiorPrecoViagem = valorGastoHoraViagem;
            document.querySelector('#maiorValor').textContent = 
            viagem.querySelector('.destino').textContent;
        }

        if(valorGastoHoraViagem < menorPrecoViagem) {
            menorPrecoViagem = valorGastoHoraViagem;
            document.querySelector('#menorValor').textContent = 
            viagem.querySelector('.destino').textContent;
        }

    });


    maiorViagemHTML.classList.add('bg-danger');
    maiorGastoHTML.classList.add('bg-warning');


});






