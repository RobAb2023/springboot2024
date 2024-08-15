<h1 align="center"> # springboot2024 </h1>

* [Título e Imagem de capa](#Título-e-Imagem-de-capa)
* [Configuração Springboot](#Configuração-Springboot)
* [Modelos configuração Banco de dados GitPod](#Modelos-configuração-Banco-de-dados-GitPod)
* [Descrição do Projeto](#descrição-do-projeto)
* [Status do Projeto](#status-do-Projeto)
* [Funcionalidades e Demonstração da Aplicação](#funcionalidades-e-demonstração-da-aplicação)
* [Acesso ao Projeto](#acesso-ao-projeto)
* [Tecnologias utilizadas](#tecnologias-utilizadas)
* [Pessoas Contribuidoras](#pessoas-contribuidoras)
* [Pessoas Desenvolvedoras do Projeto](#pessoas-desenvolvedoras)
* [Licença](#licença)
* [Conclusão](#conclusão)









#Configuração-Springboot

Criar arquivo Spring
dependencies:
SpringWeb

#Modelos-configuração-Banco-de-dados-GitPod

.gitpod.yml
```
ports:
  - port: 8080
    visibility: public
image: 
  file: .gitpod.Dockerfile
```

.gitpod.Dockerfile
```
FROM gitpod/workspace-mysql

USER gitpod

RUN /bin/bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh \ 
        && sdk install java 17.0.8-oracle < /dev/null \
        && sdk flush archives \
        && sdk flush temp"

```



**[*Repositório Prof°Mineda*](https://github.com/mineda/springboot3lab4/blob/main/.gitpod.yml)** 


| [<img loading="lazy" src="https://avatars.githubusercontent.com/u/131548759?s=400&u=17f723bde4fddaf993acc1c502435760ce66dbbb&v=4" width=115><br><sub>Roberta Cristina de Abreu</sub>](https://github.com/RobAb2023) 
