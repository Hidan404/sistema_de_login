# Sistema de Login Simples

Este é um sistema de login simples em Java que utiliza Java Swing para a interface gráfica e SQLite para persistência de dados. O sistema permite registrar novos usuários, fazer login com usuários registrados e listar todos os usuários registrados (apenas para fins de teste).

## Funcionalidades

- Registrar um novo usuário
- Fazer login com um usuário registrado
- Listar todos os usuários registrados (opcional, apenas para fins de teste)
- Remover um usuário
- Senhas encriptadas usando BCrypt

## Estrutura do Projeto


## Dependências

Este projeto utiliza Maven para gerenciar as dependências. Certifique-se de ter o Maven instalado em sua máquina.

### Adicionando Dependências ao `pom.xml`

```xml
<dependencies>
    <dependency>
        <groupId>org.xerial</groupId>
        <artifactId>sqlite-jdbc</artifactId>
        <version>3.36.0.3</version>
    </dependency>
    <dependency>
        <groupId>org.mindrot</groupId>
        <artifactId>jbcrypt</artifactId>
        <version>0.4</version>
    </dependency>
</dependencies>

## Como Executar
1.Clone o repositório

git clone https://github.com/seu-usuario/sistema-de-login-simples.git

2.Navegue até o diretório do projeto:

cd sistema-de-login-simples

3.Compile o projeto usando Maven:

mvn compile

4.Execute o projeto:
mvn exec:java -Dexec.mainClass="com.example.Main"


