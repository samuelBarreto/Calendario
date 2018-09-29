# Calendario
PI - projeto - faculdade

coloque o tomcast testa a url: 
http://localhost:8080/Calendario/

Configure o BD com root e senha pois o que está é um localhost de teste 
Depois teste as funcionalidade do cadastro :

http://localhost:8080/Calendario/adiciona-contato.jsp

create  DATABASE nomedoBD;
// atenção não se esqueça de altera na connectionFactory
use nomedoBD;
 
create table contatos (
   
     id BIGINT NOT NULL AUTO_INCREMENT,

        nome VARCHAR(255),

        email VARCHAR(255),

        senha varchar(255),

        Projeto VARCHAR(255),

        dataNascimento DATE,
 
       dataFinal DATE,

        primary key (id)

    );

--------------------------------Estou a disposição para duvidas -------------------------------------
