package com.mx.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mx.ConexionDB.ConexionDB;
import com.mx.Dao.Metodos;
import com.mx.Entity.Creditos;

public class Implementacion implements Metodos {

	Connection conn = ConexionDB.getConnection();

	@Override
	public String save(Creditos credito) {
		PreparedStatement pst = null;
		String query = "INSERT INTO CREDITOS (NOMBRE_CLIENTE, APP, FECHA_NACIMIENTO, EDAD, TIPO_PRESTAMO, FECHA_PRESTAMO, MONTO_PRESTAMO, NO_ABONOS, MONTO_ABONOS, ADEUDO) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			pst = conn.prepareStatement(query);

			pst.setString(1, credito.getNombreCliente());
			pst.setString(2, credito.getApp());
			pst.setDate(3, credito.getFechaNacimiento());
			pst.setInt(4, credito.getEdad());
			pst.setString(5, credito.getTipoPrestamo());
			pst.setDate(6, credito.getFechaPrestamo());
			pst.setDouble(7, credito.getMontoPrestamo());
			pst.setInt(8, credito.getNoAbonos());
			pst.setDouble(9, credito.getMontoAbonos());
			pst.setDouble(10, credito.getAdeudo());

			int fila = pst.executeUpdate();
			if (fila > 0) {
				return "Status:200";
			}

		} catch (Exception e) {
			System.out.println("Error al guardar" + e.getMessage());
		}
		return "Status:400";
	}

	@Override
	public String update(Creditos credito) {

		PreparedStatement pst = null;
		String query = "UPDATE CREDITOS SET NOMBRE_CLIENTE = ?, APP = ?, FECHA_NACIMIENTO = ?, EDAD = ?, TIPO_PRESTAMO = ?, FECHA_PRESTAMO = ?, MONTO_PRESTAMO = ?, NO_ABONOS = ?, MONTO_ABONOS = ?, ADEUDO = ? WHERE ID = ?";

		try {
			pst = conn.prepareStatement(query);

			pst.setString(1, credito.getNombreCliente());
			pst.setString(2, credito.getApp());
			pst.setDate(3, credito.getFechaNacimiento());
			pst.setInt(4, credito.getEdad());
			pst.setString(5, credito.getTipoPrestamo());
			pst.setDate(6, credito.getFechaPrestamo());
			pst.setDouble(7, credito.getMontoPrestamo());
			pst.setInt(8, credito.getNoAbonos());
			pst.setDouble(9, credito.getMontoAbonos());
			pst.setDouble(10, credito.getAdeudo());
			pst.setInt(11, credito.getId());

			int fila = pst.executeUpdate();
			if (fila > 0) {
				return "Status:200";
			}

		} catch (Exception e) {
			System.out.println("Error al editar" + e.getMessage());
		}
		return "Status:400";
	}

	@Override
	public String deleteById(int id) {
		PreparedStatement pst = null;
		String query = "DELETE FROM CREDITOS WHERE ID = ?";

		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, id);
			int fila = pst.executeUpdate();

			if (fila > 0) {
				return "Status:200";
			}

		} catch (Exception e) {
			System.out.println("Error al eliminar" + e.getMessage());
		}
		return "Status:400";
	}

	@Override
	public Creditos findById(int id) {

		Creditos newCredito = null; // usar null hasta encontrar un registro
		PreparedStatement pst = null;
		ResultSet rs = null;
		String query = "SELECT * FROM CREDITOS WHERE ID = ?";

		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, id);
			rs = pst.executeQuery();

			if (rs.next()) {
				newCredito = new Creditos();
				newCredito.setId(rs.getInt("ID"));
				newCredito.setNombreCliente(rs.getString("NOMBRE_CLIENTE"));
				newCredito.setApp(rs.getString("APP"));
				newCredito.setFechaNacimiento(rs.getDate("FECHA_NACIMIENTO"));
				newCredito.setEdad(rs.getInt("EDAD"));
				newCredito.setTipoPrestamo(rs.getString("TIPO_PRESTAMO"));
				newCredito.setFechaPrestamo(rs.getDate("FECHA_PRESTAMO"));
				newCredito.setMontoPrestamo(rs.getDouble("MONTO_PRESTAMO"));
				newCredito.setNoAbonos(rs.getInt("NO_ABONOS"));
				newCredito.setMontoAbonos(rs.getDouble("MONTO_ABONOS"));
				newCredito.setAdeudo(rs.getDouble("ADEUDO"));
			}
		} catch (Exception e) {
			System.out.println("Error al buscar: " + e.getMessage());
		}

		return newCredito;
	}

	@Override
	public List<Creditos> findAll() {
		List<Creditos> lista = new ArrayList();
		PreparedStatement pst = null;
		ResultSet rs = null;
		String query = "SELECT * FROM CREDITOS";

		try {
			pst = conn.prepareStatement(query);
			rs = pst.executeQuery();
			while (rs.next()) {

				Creditos newCredito = new Creditos();

				newCredito.setId(rs.getInt("ID"));
				newCredito.setNombreCliente(rs.getString("NOMBRE_CLIENTE"));
				newCredito.setApp(rs.getString("APP"));
				newCredito.setFechaNacimiento(rs.getDate("FECHA_NACIMIENTO"));
				newCredito.setEdad(rs.getInt("EDAD"));
				newCredito.setTipoPrestamo(rs.getString("TIPO_PRESTAMO"));
				newCredito.setFechaPrestamo(rs.getDate("FECHA_PRESTAMO"));
				newCredito.setMontoPrestamo(rs.getDouble("MONTO_PRESTAMO"));
				newCredito.setNoAbonos(rs.getInt("NO_ABONOS"));
				newCredito.setMontoAbonos(rs.getDouble("MONTO_ABONOS"));
				newCredito.setAdeudo(rs.getDouble("ADEUDO"));
				lista.add(newCredito);
			}
		} catch (Exception e) {
			System.out.println("Error al listar" + e.getMessage());
		}

		return lista;
	}

}
