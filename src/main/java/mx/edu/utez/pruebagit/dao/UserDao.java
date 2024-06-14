package mx.edu.utez.pruebagit.dao;
import mx.edu.utez.pruebagit.model.User;
import mx.edu.utez.pruebagit.utils.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// me permite hacer funciones crud
public class UserDao {

    // para la lectura de una entidad de una base de datos

    public User getOneUser(String user_name, String pass){
        User u = new User();
        String query = "select * from users where user_name = ? and pass = sha2(?, 256)"; // los simbolos de interrogacion son para evitar la inyeccion de codigo sql


        try {
            // conectarme a la base de datos
            Connection con = DatabaseConnectionManager.getConnection();

            // mw prepara la consulta paea ser ejecutada
            PreparedStatement ps = con.prepareStatement(query);

            // voy a definir los parametros del query (los "?")
            ps.setString(1, user_name);
            ps.setString(2, pass);

            // ejecutar la consulta
            ResultSet rs = ps.executeQuery();
            // obtener la informacion del resultSet
            if(rs.next()){
                // el usuario si existe en la base de datos
                u.setUser_name(rs.getString("user_name"));
                u.setPass(rs.getString("pass"));
                u.setEmail(rs.getString("email"));
                u.setCody(rs.getString("cody"));
            }
        } catch (SQLException e) {

        }

        return u;
    }

}