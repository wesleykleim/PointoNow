# PontoNow
Uma API para sistemas de pontos digitais.

## Endpoints
- Funcionários
    - [Cadastrar](#cadastrar-funcionários)
        - Nome 
        - CPF
        - Sexo
        - Cargo
        - Coletar biometria 
        - Reconhecimento Facial
    - [mostrar detalhes](#detalhe-cadastro)
    - Acesso 
         - Login
         - Senha
         - Esqueci a senha
         - Data e hora
    - Identificação 
        - Localização GPS
        - Biometria 
        - Reconhecimento Facial
        - Informar nome da empresa
    - Marcador de Ponto
        - Históriaco de pontos
        - Bontão para validar o ponto 
    - Banco de Horas 
        - Debito de Horas
        - Crédito de horas
        - Agendar Pagamento de Horas
        - Agendar compensação de Horas
---
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
    cpf: 123.456.78-90
    sexo: 'masculino'
    cargo: 'gerente_ti'
    biometria: API
    reconhecimento_facial: API
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
    cpf: 123.456.78-90
    sexo: 'masculino'
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
---


