# springboot2024
Criar arquivo Spring
dependencies:
SpringWeb


Base dos arquivos para uso do Gitpod
.gitpod.yml

ports:
  - port: 8080
    visibility: public
image: 
  file: .gitpod.Dockerfile


.gitpod.Dockerfile

FROM gitpod/workspace-mysql

USER gitpod

RUN /bin/bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh \ 
        && sdk install java 17.0.8-oracle < /dev/null \
        && sdk flush archives \
        && sdk flush temp"

Referencia repositório: https://github.com/mineda/springboot3lab4/blob/main/.gitpod.yml
