package br.com.ConexaoBanco;

public class Main {

    public static void main(String... args){
        Conexao conexao = new Conexao();

        conexao.conecta();
        conexao.fechaConexao(conexao.getConexao());
    }
}
