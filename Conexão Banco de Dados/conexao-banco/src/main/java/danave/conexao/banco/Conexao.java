/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.conexao.banco;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author leodanave
 */
public class Conexao {

    private JdbcTemplate connection;

    public Conexao() {
        // Objeto do dbcp2 - responsável por estabelecer uma conexão fácil
        BasicDataSource dataSource = new BasicDataSource();
        
        // Driver a ser pesquisado de acordo com o Banco de Dados a ser usado
        dataSource​.setDriverClassName("org.h2.Driver");
        
        // Dependência que ele será utilizado
        dataSource​.setUrl("jdbc:h2:file:./banco_teste");
        
        dataSource​.setUsername("sa");

        dataSource​.setPassword("");

        this.connection = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConnection() {
        return connection;
    }

}
