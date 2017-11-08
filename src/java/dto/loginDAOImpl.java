/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import conexion.Acceso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bladi
 */
public class loginDAOImpl implements loginDAO {

    Connection conexion;

    public loginDAOImpl() {
        Acceso cn = new Acceso();
        conexion = cn.getConnection();
    }

    private String sqlQuery = "Select username, password from usuarios where username = ? and password = ?";

    @Override
    public usuarios ValidarUsuario(String username, String password) {

        String query1 = sqlQuery;
        usuarios user = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            pst = conexion.prepareStatement(query1);
            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();

            while (rs.next()) {
                user = new usuarios();
                user.setUsername(rs.getString(1));
                user.setPassword(rs.getString(2));
            }

        } catch (Exception ex) {
            Logger.getLogger(loginDAOImpl.class.getName()).log(Level.SEVERE, null, ex);

        } finally {

            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return user;
    }
}
