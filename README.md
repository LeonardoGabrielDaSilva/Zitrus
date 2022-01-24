# ZitrusChallenge
## Desafio Técnico proposto pela Zitrus com objetivo de subir uma API de cadastro de clientes.
<!--ts-->
   * [Sobre](#sobre)
   * [Pré Requisitos](#pré-requisitos)
   * [EndPoints](#rodando-o-programa)
   * [Tecnologias](#tecnologias)
   * [Detalhes](#detalhes)
   * [Bugs](#bugs)
<!--te-->

### Sobre

* Projeto proposto como desafio técnico pela Zitrus.
* Desenvolvido em Java com Spring MVC e JPA.
* API responsável pelo gerenciamento de cadastro de clientes.
* A aplicação funcionará na porta 8080.


### Pré-requisitos

*  Java 17

### EndPoints

A API deverá ser iniciada no endpoint mapeado como: {localhost:8080/cliente/menu}, recebendo uma lista dos clientes em memória e opções para cadastro,
detalhes e exclusão.


### Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [Spring Tools 4 for Eclipse](https://spring.io/tools)
- [Maven](https://maven.apache.org/)
- [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

### Detalhes

Sendo meu primeiro projeto prático com Spring (anteriormente havia apenas estudado e documentado sobre o framework) e JPA, creio que ficou muito básico, principalmente devido ao tempo gasto com bugs com o thymeleaf no html, onde acabei patinando por muito tempo, inclusive no bug do CEP que me consumiu diversas horas e não encontrei solução.
Ps: Como vão perceber, front end não é o meu forte kkk.

### Bugs

Há um bug na busca de CEP, que mesmo após muito esforço não encontrei solução. Quando o back retorna os dados para o front, o thymeleaf não está populando os
inputs "text" vazios, por exemplo, caso não haja dados no Logradouro e haja no Bairro, ao buscar um CEP, apenas será populado o campo Bairro.

### Autor
---

<a href="https://github.com/LeonardoGabrielDaSilva">
 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/10273541?s=400&u=2e2cf0ac182a36f0d5274bc8a9f0d30d65dadbf1&v=4" width="100px;" alt=""/>
 <br />
 <sub><b>Leonardo Gabriel da Silva</b></sub></a> <a href="https://github.com/LeonardoGabrielDaSilva"</a>


[![Linkedin Badge](https://img.shields.io/badge/-Leonardo-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/leonardo-gabriel-da-silva-3948a7152/)](https://www.linkedin.com/in/leonardo-gabriel-da-silva-3948a7152/) 



