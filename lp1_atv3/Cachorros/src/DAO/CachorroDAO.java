package DAO;

import DTO.CachorroDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class CachorroDAO {
    //variaveis 
    Connection conn;  
    PreparedStatement pstm;

    public void cadastrarCachorro(CachorroDTO objcachorrodto) {
        String sql = "insert into cachorro (nome,raca,sexo,cor,idade) values (?,?,?,?,?)";

        //classe de conexao
        conn = new ConexaoDAO().conectaBD();

        try {
            //preparando meu sql para receber dos '?'
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcachorrodto.getNome());
            pstm.setString(2, objcachorrodto.getRaca());
            pstm.setString(3, objcachorrodto.getSexo());
            pstm.setString(4,objcachorrodto.getCor());
            pstm.setInt(5,objcachorrodto.getIdade());
            
            pstm.execute();
            pstm.close(); 
             
            
            //caso não funcione o try ele executa o catch
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "CachorroDAO" + erro);

        }
    }

}
