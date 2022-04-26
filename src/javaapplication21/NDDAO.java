/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NDDAO {

    public void insert(nguoidung model) {
        String sql = "INSERT INTO nguoidung(hoten, sdt, email) VALUES(?, ?,?)";
        JDBC.executeUpdate(sql,
                
                model.getTen(),
                model.getSdt(),
                model.getEmail());
    }

    public void update(nguoidung model) {
        String sql = "UPDATE nguoidung SET hoten=?, sdt=?, email=? WHERE id=?";
        JDBC.executeUpdate(sql,
                model.getTen(),
                model.getSdt(),
                model.getEmail(),
                model.getId());
    }


    public List<nguoidung> select() {
        String sql = "SELECT * FROM nguoidung";
        return SelectBySQL(sql);
    }

    public List<nguoidung> SelectBySQL(String sql, Object... args) {
        List<nguoidung> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBC.executeQuery(sql, args);
                while (rs.next()) {
                    nguoidung model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private nguoidung readFromResultSet(ResultSet rs) throws SQLException {
        nguoidung model = new nguoidung();
        model.setId(rs.getInt("MaHV"));
        model.setTen(rs.getString("KH"));
        model.setSdt(rs.getString("MaNH"));
        model.setEmail(rs.getString("Diem"));
        return model;
    }

    public void delete(int id) {
        String sql = "DELETE FROM nguoidung WHERE id=?";
        JDBC.executeUpdate(sql, id);
    }

//   

}
