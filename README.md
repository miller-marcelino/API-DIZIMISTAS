# API-DIZIMISTAS
API Package com.api.demo.controller
Este é o README para o pacote com.api.demo.controller, que contém os controladores da API. Abaixo está uma visão geral das funcionalidades fornecidas por esses controladores.

ControladorPrincipal
Este controlador é responsável por lidar com as requisições relacionadas ao cadastro, listagem, atualização e remoção de igrejas e dizimistas na sua aplicação.

Endpoints:
POST /cadastrar-igrejas: Cadastra uma nova igreja.
POST /cadastrar-dizimistas: Cadastra um novo dizimista.
GET /listar-igrejas: Lista todas as igrejas cadastradas.
GET /listar-dizimistas: Lista todos os dizimistas cadastrados.
DELETE /deletar-igrejas/{id}: Deleta uma igreja pelo seu ID.
DELETE /deletar-dizimista/{id}: Deleta um dizimista pelo seu ID.
PUT /atualizar-igrejas/{id}: Atualiza uma igreja existente pelo seu ID.
PUT /atualizar-dizimistas/{id}: Atualiza um dizimista existente pelo seu ID.
Observações:
Todos os endpoints que recebem dados do cliente esperam que esses dados estejam no formato JSON no corpo da requisição.
Os endpoints de cadastro e atualização realizam validações dos dados recebidos. Caso haja algum erro de validação, o servidor retorna um código de erro e uma mensagem explicativa.
Os endpoints de listagem retornam os dados no formato JSON.
Os endpoints de deleção retornam um status 200 se a operação for bem-sucedida ou um status 204 se o recurso não for encontrado.
Lembre-se de configurar corretamente as permissões de acesso e a segurança da sua API, dependendo dos requisitos do seu sistema e do ambiente de produção em que ela será implantada.

Para mais detalhes sobre como usar cada endpoint, consulte a documentação da API a mesma já está com a depêndencia do swagger.

Se precisar de mais alguma informação ou assistência, não hesite em entrar em contato.


