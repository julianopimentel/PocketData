create table usuarios (

    usuario_id 	serial,

    login   varchar(50) not null,
    senha   varchar(20) not null,

    constraint usuarios_pkey 
    primary key (usuario_id)

);

insert into usuarios values (
    
    default, 'sismedicoadm', 'teste123'

);
 
create table pacientes (

    paciente_id	serial,		
    nome        varchar(50)	not null,
    datanasc 	varchar(50)	not null,
    imc 	varchar(20)	not null,

    constraint pacientes_pkey 
    primary key (paciente_id)

);

insert into pacientes values (
	default, 'aluno', '01012015', '25.0'
);

//	bd.CadastraDados(
		"INSERT INTO pacientes(nome, datanasc, imc)"+
//  "VALUES(
		'"+Paciente+"','"+DNascimento+"','"+Imc+"');"); 

