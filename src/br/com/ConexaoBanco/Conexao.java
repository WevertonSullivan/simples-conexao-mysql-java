package br.com.ConexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private Connection conexao;

    public void conecta() {
        try {

            this.conexao = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/meu_banco", "usuário do banco", "senha");

            System.out.println("Conectado!");

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void fechaConexao(Connection conexao) {

        try {
            conexao.close();

        } catch (SQLException e){

            e.printStackTrace();
        }finally {

            System.out.println("Conexão fechada com sucesso!");
        }
    }

    public Connection getConexao(){
        return this.conexao;
    }
}
