/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class conexion {
    public static int avatarBs,id,activar=0;
    public static String fecha="";
    public static Connection getConexion() {
        try {
            String url4 = "jdbc:sqlserver://localhost:1433;database=Veterinaria;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url4);
            
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    

    public static Connection IniciarSeccion(String usuario, String contra) {
        String usuBase = "", contraBase = "";
        try {
            Connection con = conexion.getConexion();
            String consulta = "Select Usuario,Contra,Avatar from Dueño where Usuario='" + usuario + "' and Contra='" + contra + "'";
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                usuBase = rs.getString(1);
                contraBase = rs.getString(2);
                avatarBs = rs.getInt(7);
            }
            if (usuario.equals("") && contra.equals("")) {
                JOptionPane.showMessageDialog(null, "Llene los campos");
            } else if (usuBase.equals(usuario) && contraBase.equals(contra)) {
                
                JOptionPane.showMessageDialog(null, "Bienvenido " + usuario);
            } else {
                JOptionPane.showMessageDialog(null, "Informacion incorrecta");
            }
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    
    public static Connection RegistroUsuario(String usuario,String contraseña,int edad,String nombre,int sexo,int avatar,String nombreMs){
        try {
            Connection con = conexion.getConexion();
            String UsExistente="";
            String consulta ="Select Usuario from Dueño where Usuario='"+usuario+"'";
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                UsExistente = rs.getString(1);
            }
            if (UsExistente.equals(usuario)) {
                JOptionPane.showMessageDialog(null,"No puede registrarse\n(Usuario ya existe)");
            }else{
                RegistroMascota(nombreMs,sexo);
                consulta = "insert into Dueño (Usuario,Contra,Edad,Nombre,codMascota,Avatar) values ('"+usuario+"','"+contraseña+"',"+edad+",'"+nombre+"',"+id+","+avatar+")";
                PreparedStatement ps2 = con.prepareStatement(consulta);
                ps2.executeUpdate();
            }
            
            return  con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            return null;
        }
    }
    
    public static Connection RegistroMascota(String nombreM,int sexo){
        try {
            Connection con = conexion.getConexion();
            String consulta="insert into Mascota (NombreM,Sexo) values('"+nombreM+"',"+sexo+")";
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.executeUpdate();
            consulta = "select codMascota from Mascota where NombreM='"+nombreM+"' and Sexo="+sexo+"";
            PreparedStatement ps2 = con.prepareStatement(consulta);
            ResultSet rs = ps2.executeQuery();
            
            while (rs.next()) {                
                id = Integer.parseInt(rs.getString(1));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
           
        }
        return null;
    }
       
    public static Connection Clientes(JComboBox combo){
        try {
            Connection con = conexion.getConexion();
            String consulta ="select Usuario from Dueño where Condicion='1'";
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                combo.addItem(rs.getString(1));
            }
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            return null;
        }
    }
    public static Connection Asignar(String Usuario,String fecha){
        try {
            Connection con = conexion.getConexion();
            String consulta="update Dueño set Fecha='"+fecha+"' where Usuario='"+Usuario+"'";
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Cita Asignada");
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            return null;
        }
    }
    public static Connection Eliminar(String Usuario){
        try {
            Connection con = conexion.getConexion();
            String fecha="";
            int condiccion=0;
            String consulta="update Dueño set Fecha='"+fecha+"',Condicion="+condiccion+" where Usuario='"+Usuario+"'";
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Cita eliminada");
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            return null;
        }
    }
    
    public static Connection TuCita(String Usuario){
        try {
            Connection con = conexion.getConexion();
            fecha="";
            int condiccion=0;
            String consulta="select Fecha from Dueño where Usuario='"+Usuario+"' and Condicion=1";
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                fecha = rs.getString(1);
            }
            if (fecha.equals("")) {
                activar=0;
            }else{
                activar=1;
            }
            
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            return null;
        }
    }
    public static Connection Correo(String Usuario){
        try {
            Connection con = conexion.getConexion();
            String consulta = "update Dueño set Condicion=1 where Usuario='"+Usuario+"'";
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.executeUpdate();
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            return null;
        }
    }
}
