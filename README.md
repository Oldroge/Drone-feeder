<h1>Drone Feeder</h1>

Integrantes:
      - Rogério Martins
      - Gustavo Pozzan Dalmoro

<h2>Índice</h2>
<h4>- <a href="#context">Contexto</a></h4>
<h4>- <a href="#tecnologies">Técnologias utilizadas</a></h4>
<h4>- <a href="#development">Desenvolvimento</a></h4>
<h4>- <a href="#requirements">Requerimentos</a></h4>
<h4>- <a href="#howtouse">Como executar o projeto</a></h4>

<h2 id="context">Contexto</h2>

<p>O Drone Feeder é um projeto de back-end, onde foi feito uma API CRUD para uma aplicação de entregas feitas por Drones.</p>
<p>Esse projeto foi desenvolvido durante o curso de aceleração em Java realizado pela empresa Hub-floripa juntamente com a Trybe com o </p>
<P>objetivo de consolidar os estudos e construir uma API REST CRUD</p>
<p>utilizando Java, foi realizado utilizando SprintBoot no mês Abril de 2023.</p>


<h2 id="tecnologies">Técnologias utilizadas</h2>

<ul>
  <li>Java</li>
  <li>SprintBoot</li>
  <li>JUnit</li>
  <li>Hibernate</li>
  <li>MySQL</li>
  <li>Docker</li>
</ul>

<h2 id="development">Desenvolvimento</h2>

<p>Neste projeto arquitetamos e desenvolvemos uma API de um CRUD para um sistema de entregas por Drone, utilizando a linguagem Java.</p>
<p>Foram criadas tabelas no MySQL, onde é possível criar, editar, deletar e ler pedidos e entregas. Os testes foram realizados utilizando JUnit</p>

<h2 id="requirements">Requerimentos</h2>

<p>Maven</p>
<p>Java jdk 11.0.17</p>
<p>MySQL</p>

<h2 id="howtouse">Como executar o projeto</h2>

  1. Clone o repositório:
    </br>
    * `git clone git@github.com:Oldroge/Drone-feeder.git`.
    </br>
    Entre na pasta do repositório que você acabou de clonar:
    </br>
      * `cd Drone-feeder`
</br>

  2. Com o MySQL instalado e deve ser criado um Schema com o nome de drone_feeder no seu usuário root

  3. Configure as variáveis de ambiente:
    </br>
    * No arquivo src/main/resources/application.properties é possível configurar suas variáveis de ambiente. Segue exemplo:
    </br>
```sh
spring.datasource.url=jdbc:mysql://127.0.0.1:8080/Drone_feeder
spring.datasource.username=SEU_USUARIO_MYSQL
spring.datasource.password=SEU_PASSWORD_MYSQL
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.servlet.multipart.max-file-size=50MB
spring.servlet.multipart.max-request-size=50MB
```
</br>

  4. Instale as dependências:
    </br>
    * `mvn install`
    </br>

  5. Inicie a aplicação, ela rodará na porta 8080:
    </br>
    * `mvn spring-boot:run`
    </br>
    
  6. Para rodar a aplicação com Docker:
    </br>
    * `service mysql stop`
    </br>
    * `No arquivo src/main/resources/application.properties é necessário configurar suas variáveis de ambiente.` Segue exemplo:
    </br>
`
spring.datasource.url=jdbc:mysql://${MYSQL_HOST}:8080/${MYSQL_DATABASE}
spring.datasource.username=${MYSQL_USER}
spring.datasource.password=${MYSQL_PASSWORD}
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.servlet.multipart.max-file-size=50MB
spring.servlet.multipart.max-request-size=50MB`
    </br>
    * `docker-compose:up --build`
</br>
