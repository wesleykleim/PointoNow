# PontoNow
Uma API para sistemas de pontos digitais.

## Endpoints
- Funcionários
    - [Cadastra](#cadastrar-funcionários)
        - Nome 
        - CPF
        - Sexo
        - Cargo
        - Coletar biometria 
        - Reconhecimento Facial
        - [mostrar detalhes](#detalhe-cadastro)
    - [Acesso](#acesso-funcionário)
         - Login usuario
         - Senha
         - Esqueci a senha
         - Data e hora
    - [Rastreamento do funcionário](#localização-do-funcionário)
        - Localização GPS
        - Biometria 
        - Reconhecimento Facial
        - Informar nome da empresa
        - [mostrar detalhes](#detalhe-localização)
    - [Marcador de Ponto](#marcador-de-ponto)
        - Históriaco de pontos
        - Botão para validar o ponto 
    - [Banco de Horas](#banco-de-horas)

        - Débito de Horas
        - Crédito de horas
        - Agendar Pagamento de Horas
        - Agendar compensação de Horas
***
### Cadastrar Funcionários

`POST` / pontonow/api/cadastrar


**Campos da Requisição**

| campo | tipo | obrigatório | descrição 
|:-------:|:------:|:-------------:|:----------:
| nome | string | sim | campo para inserir o nome completo do funcionário
| cpf | long | sim | campo para inserir cpf do funcionário
| Sexo | char | não | campo para informar o sexo do funcionário
| Cargo | string | sim | campo para identificar o cargo 
| biometria | object | sim | coleta de digital do funcionário para maracar os pontos
| reconhecimento_facial | object | sim | reconhecimento facial para identificação do funcionário 
---



**Exemplo de corpo de requisição**

```js
{
    nome: 'Jorge Rodrigo'
    cpf: '123.456.78-90'
    sexo: 'M'
    cargo: 'gerente_ti'
    biometria: API
    reconhecimento_facial: object
}
```
**Respostas**
| código | descição
|-|-
| 201 | funcionário cadastrado com sucesso
| 400 | campo inválido
---

### Detalhe cadastro

`GET` / pontonow/api/cadastrar{id}

**Exemplo de corpo de resposta**

```js
{
    nome: 'Jorge Rodrigo'
    cpf: '123.456.78-90'
    sexo: 'M'
    cargo: 'gerente_ti'
    biometria: API{
        biometria_id: 1
        nome: 'Jorge Rodrigo'
    }
    reconhecimento_facial: API{
        reconhecimento_facial_id: 1
        nome: 'Jorge Rodrigo'
    }
}
```

**Código de Respostas**
| código | descição
|-|-
| 200 | dados do funcionário retornados com sucesso
| 400 | não exixte funcionário com o id informado
***

### Acesso Funcionário

`POST` / pontonow/api/login

| campo | tipo | obrigatório | descrição 
|:-------:|:------:|:-------------:|:----------:
| usuario | string | sim | campo para usuario se logar no app
| senha | string | sim | campo para inserir a senha do usuário
| esqueci a senha | string | sim | campo de redirecionámento para alteração de senha 
| data e hora| date | sim | campo que exibe a data e a hora de aceeso ao app 

**Exemplo de corpo de requisição**

```js
{
    usuario: 'jorgerodrigo@gmail.com'
    senha: '123#rodrigo'
    data_hora: '06/03/2023 - 11:00h'
    
}
```
**Respostas**
| código | descição
|-|-
| 201 | login efetuado com sucesso
| 400 | usuário inválido

***

### Localização do funcionário

`POST` / pontonow/api/localizacao

| campo | tipo | obrigatório | descrição 
|:-------:|:------:|:-------------:|:----------:
| gps | Google Maps | sim | campo que identifica a localização do funcionário
| Biometria  | Object | sim | campo para confirmação do funcionário
| Reconhecimento Facial  | Object | sim | campo para confirmação do funcionário
| nome da empresa| string | sim | identificação da organização onde coopera 

**Exemplo de corpo de requisição**

```js
{
    gps: 'Av. Lins de Vasconcelos, 1222 - Aclimação, São Paulo - SP, 01538-001'
    biometria: object
    reconhecimento_facial: object
    nome_da_empresa: 'Faculdade de Informática e Administração Paulista'
    
}
```
**Respostas**
| código | descição
|-|-
| 201 | login efetuado com sucesso
| 400 | usuário inválido

***
### Detalhe Localização

`GET` / pontonow/api/localizacao{id}

**Exemplo de corpo de resposta**

```js
{
    gps: {
        rua: 'Av. Lins de Vasconcelos,'
        cep: 'SP, 01538-001'
        bairro:     'aclimação'
        numero: '1222,'
        UF: 'sp'
    }
   
    biometria: object{
        biometria_id: 1
        nome: 'Jorge Rodrigo'
    }
    reconhecimento_facial: object{
        reconhecimento_facial_id: 1
        nome: 'Jorge Rodrigo'
    }
    nm_empresa:{
        razao_social: 'faculdade de informática e administração paulista'
        cnpj: '28.252.381/0001-15.'
    }
}
```

**Código de Respostas**
| código | descição
|-|-
| 200 | dados de localização retornados com sucesso
| 400 | não exixte esta localizaçãocom o id informado
***
### Marcador de ponto

`POST` / pontonow/api/maracadorPonto

| campo | tipo | obrigatório | descrição 
|:-------:|:------:|:-------------:|:----------:
| histórico_ponto | date | sim | campo que identifica as horas trabalhadas 
| botão_ponto | Object | sim | marcador de ponto digital


**Exemplo de corpo de requisição**

```js
{
    historico_ponto: '06/08/2023'
                     'entrada - 8:00' 
                     'almoço  - 12:00 '
                     'saida   - 17:00'

                     '05/08/2023'
                     'entrada - 8:00' 
                     'almoço  - 12:00 '
                     'saida   - 17:00'

                     '04/08/2023'
                     'entrada - 8:00' 
                     'almoço  - 12:00 '
                     'saida   - 17:00'

                     '03/08/2023'
                     'entrada - 8:00' 
                     'almoço  - 12:00 '
                     'saida   - 17:00'

                     '02/08/2023'
                     'entrada - 8:00' 
                     'almoço  - 12:00 '
                     'saida   - 17:00'

                     '01/08/2023'
                     'entrada - 8:00' 
                     'almoço  - 12:00 '
                     'saida   - 17:00'
    botao: 'clique aqui para registrar seu ponto'
    
    
}
```
**Respostas**
| código | descição
|-|-
| 201 | ponto registrado com sucesso
| 400 | não foi possivel registrar  

***
### Banco de Horas 

`POST` / pontonow/api/bancoHoras

| campo | tipo | obrigatório | descrição 
|:-------:|:------:|:-------------:|:----------:
| debito_horas | date | sim | campo onde o funcionário é informado quanto deve de horas
| credito_horas | date | sim | campo onde o funcionário é informado quanto tem de horas positivas
| agenda_pag_horas | date | sim | agendar dia que pagara as horas 
| agendar_compensacao_horas| date | sim | agendar dia que poderá sair mais cedo ou entrar mais tarde no expediente 

**Exemplo de corpo de requisição**

```js
{
    debito_horas: '06/03/2023'
                  'entrada: 9:00'
                  'saida: 17:00'
                  'horas negativas = 1 hora'

    agendar_pagto_horas:'07/03/2023'

    credito_horas:'07/03/2023'
                  'entrada: 7:00'
                  'saida: 19:00'
                  'horas positivas = 2 hora'
    
    agendar_compensacao_horas: '08/03/2023 '
    
}
```
**Respostas**
| código | descição
|-|-
| 201 | agendamento realizado com sucesso
| 400 | data não disponivel 