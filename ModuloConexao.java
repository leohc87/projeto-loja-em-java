/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author Leandro
 */
public class ModuloConexao {

    //metodo responsalvel por estabelecer a conexao com o banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //abaixo chama o driver 
        String driver = "com.mysql.jdbc.driver";
        // armazenando informacoes do banco
        String url = "jdbc:mysql://localhost/dbinfox?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "";
        //estabelecendo conexao com o banco
        try{
           
           conexao = DriverManager.getConnection(url, user, password);
           return conexao;
        } catch (Exception e){
            System.out.println(e);
            return null;
        
        }
        
    }

}
