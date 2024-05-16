// Inicio do trecho responsal por validar o fomulario de cadastro

//Converte o campo nome para maisculo
function converteNomeParaMaiusculo() {
    //document.getElementById('nome'): Isso procura na página HTML por um elemento que possui o atributo de id igual a 'nome'.
    //value: Uma vez que a referência para o elemento é obtida, .value é usado para acessar ou modificar o valor desse elemento. Em HTML.
    //document.getElementById('nome').value.toUpperCase(): Aqui, o valor do elemento é recuperado usando .value, e .toUpperCase() é chamado. O método toUpperCase() converte todos os caracteres de uma string para maiúsculas
    document.getElementById('nome').value = document.getElementById('nome').value.toUpperCase();
}

//Converte o campo nome do paroco ou responsável para maisculo
function converteNomeParocoParaMaiusculo() {
    document.getElementById('nomeparoco').value = document.getElementById('nomeparoco').value.toUpperCase();
}

//Converte o campo nome da cidade para maisculo
function convertecidadeParaMaiusculo() {
    document.getElementById('cidade').value = document.getElementById('cidade').value.toUpperCase();
}

//Converte o campo Bairro para maisculo
function converteBairroParaMaiusculo() {
    document.getElementById('bairro').value = document.getElementById('bairro').value.toUpperCase();
}

//Converte o campo Rua para maisculo
function converteRuaParaMaiusculo() {
    document.getElementById('rua').value = document.getElementById('rua').value.toUpperCase();
}

//Converte o campo Ponto de Referencia para maisculo
function convertePontoDeReferenciaParaMaiusculo() {
    document.getElementById('referencia').value = document.getElementById('referencia').value.toUpperCase();
}

// Validar cnpj
function validarCNPJ() {
    // Remover caracteres não numéricos
    document.getElementById('cnpj').value = document.getElementById('cnpj').value.replace(/[^\d]/g, '');

    // Verificar se o CNPJ tem 14 dígitos
    if (document.getElementById('cnpj').value.length !== 14) {
        return alert("O CNPJ deve conter 14 dígitos")
    }
}

//Função para validar se e-mail tem pelo menos @
function validarEmail() {
    // Expressão regular para validar o formato do e-mail
    const regexEmail = /@/;


    if (regexEmail.test(document.getElementById('email').value)) {


    } else {
        alert("E-mail inválido: ");

    }
}

//Função para validar se a senha tem 8 dígitos sendo letras e números
function validarSenha() {

    // Pelo menos 8 caracteres

    if (document.getElementById('senha').value.length < 8) {
        return alert("A senha deve conter pelo menos 8 dígitos");
    }

    //Expresão regular para verificar se existe alguma letra
    const regexLetra = /[a-zA-Z]/;

    // Teste para verificar se a senha contém pelo menos 1 letra
    if (regexLetra.test(document.getElementById('senha').value)) {

    } else {
        alert("A senha deve conter pelo menos 1 letra");
        return false;
    }

}

//Função para forçar uma data é atual ou passada
function verificarData() {

    /* Trecho para tratar Substring(parte de um campo)
    let datanascimento = document.getElementById('datafundacao').value;
    let dia = datanascimento.substring(0,2);
    let mes = datanascimento.substring(3,5);
    let ano = datanascimento.substring(6,10);
    */
    // Obtém o valor do campo input com id 'data'
    const dataInput = document.getElementById('datafundacao').value;

    // Obtém a data atual
    const dataAtual = new Date();

    // Converte a data fornecida para um objeto Date
    const dataFornecida = new Date(dataInput);

    // Compara as datas
    if (dataFornecida > dataAtual) {
        alert("Por favor, forneça uma data atual ou passada.");
    }
}

//Função para retirar as letras do campo cep
function retirarLetrasDoCep() {
    // Remover caracteres não numéricos
    document.getElementById('cep').value = document.getElementById('cep').value.replace(/[^\d]/g, '');
}

//Função para retirar as letras do campo DDD e aparecer um alerta informando que só perte números
function retirarLetrasDoDDD() {

    //Expresão regular para verificar se existe alguma letra
    const regexLetra = /[a-zA-Z]/;

    // Teste para verificar se a senha contém pelo menos 1 letra
    if (regexLetra.test(document.getElementById('ddd').value)) {
        alert("Seu DD deve conter apenas números");
        // Remover caracteres não numéricos
        document.getElementById('ddd').value = document.getElementById('ddd').value.replace(/[^\d]/g, '');
    }
}

//Função para retirar as letras do campo Celular e aparecer um alerta informando que só perte números
function retirarLetrasDoCelular() {

    //Expresão regular para verificar se existe alguma letra
    const regexLetra = /[a-zA-Z]/;

    // Teste para verificar se a senha contém pelo menos 1 letra
    if (regexLetra.test(document.getElementById('celular').value)) {
        alert("Seu Celular deve conter apenas números");
        // Remover caracteres não numéricos
        document.getElementById('celular').value = document.getElementById('celular').value.replace(/[^\d]/g, '');
    }
}

//Função para retirar as letras do campo Telefone e aparecer um alerta informando que só perte números
function retirarLetrasDoTelefone() {

    //Expresão regular para verificar se existe alguma letra
    const regexLetra = /[a-zA-Z]/;

    // Teste para verificar se a senha contém pelo menos 1 letra
    if (regexLetra.test(document.getElementById('telefone').value)) {
        alert("Seu Telefone deve conter apenas números");
        // Remover caracteres não numéricos
        document.getElementById('telefone').value = document.getElementById('telefone').value.replace(/[^\d]/g, '');
    }
}

// Função para cadastrar igrejas
function cadastrarIgrejas() {
    // Criando um objeto com os dados do formulário
    var obj = {
        nome: document.getElementById("nome").value, // Obtém o valor do campo de nome
        cnpj: document.getElementById("cnpj").value, // Obtém o valor do campo de CNPJ
        senha: document.getElementById("senha").value, // Obtém o valor do campo senha
        matriz: document.getElementById("radiomatriz").checked, // Obtém o estado do campo "Matriz"
        capela: document.getElementById("radiocapela").checked, // Obtém o estado do campo "Capela"
        ddd: document.getElementById("ddd").value, // Obtém o valor do campo de DDD
        celular: document.getElementById("celular").value, // Obtém o valor do campo de celular
        whatsapp: document.getElementById("whatsapp").checked,  // Obtém o estado do campo "WhatsApp"
        telefone: document.getElementById("telefone").value,  // Obtém o valor do campo de telefone
        email: document.getElementById("email").value,  // Obtém o valor do campo de e-mail
        chave_pix: document.getElementById("pix").value,  // Obtém o valor do campo de chave Pix
        nome_responsavel: document.getElementById("nomeparoco").value,  // Obtém o valor do campo de nome do responsável
        igreja_catolica: document.getElementById("radiocatolica").checked,  // Obtém o estado do campo "Igreja Católica"
        igreja_batista: document.getElementById("radiobatista").checked,  // Obtém o estado do campo "Igreja Batista"
        igreja_assembleia: document.getElementById("radioassembleia").checked,  // Obtém o estado do campo "Igreja Assembleia"
        outras_igrejas: document.getElementById("radiooutrareligiao").checked,  // Obtém o estado do campo "Outras Igrejas"
        estado: document.getElementById("uf").value,  // Obtém o valor do campo de estado
        cidade: document.getElementById("cidade").value,  // Obtém o valor do campo de cidade
        bairro: document.getElementById("bairro").value,  // Obtém o valor do campo de bairro
        rua: document.getElementById("rua").value,  // Obtém o valor do campo de rua
        numero: document.getElementById("numero").value,  // Obtém o valor do campo de número
        ponto_referencia: document.getElementById("referencia").value,  // Obtém o valor do campo de ponto de referência
        cep: document.getElementById("cep").value  // Obtém o valor do campo de CEP
    };

    // Criando uma nova solicitação XMLHttpRequest
    const xhttp = new XMLHttpRequest();

    // Definindo o que fazer quando a solicitação é concluída
    xhttp.onload = function () {
        // Exibindo um alerta com a resposta da API
        alert(this.responseText);
        
        
    };

    // Configurando a solicitação POST para a URL da API
    xhttp.open("POST", "http://localhost:8088/cadastrar-igrejas");

    // Configurando os cabeçalhos da solicitação
    xhttp.setRequestHeader("Accept", "application/json");
    xhttp.setRequestHeader("Content-Type", "application/json");

    // Enviando a solicitação com os dados do formulário convertidos para JSON
    xhttp.send(JSON.stringify(obj));
}


function listarIgrejas() {
    //document.getElementById("demo").innerHTML ='';
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function () {
        console.log("texto"+this.responseText);
        const dados = JSON.parse(this.responseText);
        console.log(dados);
        
        var tabela = '<table id="" name=""  class="table">';
        tabela = tabela + '<tr>';
        tabela = tabela + '<th>Nome</th>';
        tabela = tabela + '<th>Nome Responsável</th>';
        tabela = tabela + '<th>Whatsapp</th>';
        tabela = tabela + '</tr>';

        //imprimir os dados na tabela
        for (let index = 0; index < dados.length; index++) {
            const igreja = dados[index];
            tabela = tabela + '<tr>';
            tabela = tabela + '<td>' + igreja.nome + '</td>';
            tabela = tabela + '<td>' + igreja.nome_responsavel + '</td>';
            tabela = tabela + '<td>' + igreja.whatsapp + '</td>';
            tabela = tabela + '<td>';
            tabela = tabela + '<input type="button" class="btn btn-sm btn-warning" value="Editar" onclick="editarDados('+igreja.idIgreja+');">';
            tabela = tabela + '<a href="#" class="btn btn-sm btn-danger">Remover</a>';
            tabela = tabela + '</td>';
            tabela = tabela + '</tr>';
        }
        tabela = tabela + '</table>';
        document.getElementById("divresultadoapi").innerHTML = tabela;
    }
    
    xhttp.open("get", " http://localhost:8088/listar-igrejas/get/"+document.getElementById('idIgreja').value);
    xhttp.setRequestHeader("Content-Type", "application/text");
    xhttp.send();
}