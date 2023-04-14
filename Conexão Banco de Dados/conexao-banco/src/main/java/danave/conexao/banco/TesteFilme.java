/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.conexao.banco;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author leodanave
 */
public class TesteFilme {

    public static void main(String[] args) {

        Conexao conexao = new Conexao();
        JdbcTemplate con = conexao.getConnection();

        con.execute("DROP TABLE filme IF EXISTS;");

        con.execute(
                "CREATE TABLE filme ("
                + "id INT PRIMARY KEY AUTO_INCREMENT,"
                + "nome VARCHAR(255) NOT NULL,"
                + "ano_lancamento int NOT NULL"
                + ");"
        );

        con.update("INSERT INTO filme VALUES(null, 'Shrek', 2023)");

        String nomeFilme = "Her";
        Integer anoLancamento = 2013;

        con.update(String.format("INSERT INTO filme VALUES(null, '%s', %d)",
                nomeFilme, anoLancamento));

        Filme novoFilme = new Filme(null, "A volta de quem não foi 2", 2077);
        con.update(String.format("INSERT INTO filme VALUES(null, '%s', %d)",
                novoFilme.getNome(), novoFilme.getAnoLancamento()));

        List<Filme> filmes = con.query("SELECT * FROM filme;",
                new BeanPropertyRowMapper(Filme.class));

        System.out.println(filmes);
        
        con.update("UPDATE filme SET nome = 'Shrek 4' WHERE id = ? and nome = ?",
                1, "Shrek 5");
        
        con.update(String.format("UPDATE filme SET nome = 'Shrek 4' WHERE id = %d", 1));                
        
        con.update(String.format("DELETE FROM filme WHERE id = %d", 2));                
           
        filmes = con.query("SELECT * FROM filme;",
                new BeanPropertyRowMapper(Filme.class));
        
        System.out.println(filmes);
        
    }
}
