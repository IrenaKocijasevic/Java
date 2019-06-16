//Napisati program koji iz baze podataka Banka.db ispisuje sve filijale 
//kao i naziv mesta gde se nalaze
//koristiti model sa casa

package domaciSql;

import java.sql.*;

public class BankaSql {

	String connectionString;
	Connection connection;

	public BankaSql(String connectionString) {
		this.connectionString = connectionString;
	}

	public void printNazivMesta() throws SQLException {

		try (Connection connection = DriverManager
				.getConnection(connectionString);
				Statement statement = connection.createStatement()) {
			final ResultSet resultSet = statement
					.executeQuery("SELECT Filijala.IdFil, Filijala.Naziv, Filijala.Adresa, Mesto.Naziv AS Grad FROM Filijala INNER JOIN Mesto ON Filijala.IdMes = Mesto.IdMes");

			while (resultSet.next()) { // popunjava redove preko baze banka.db

				int idFil = resultSet.getInt(1); // red1 kolona1 filijala

				String naziv = resultSet.getString(2); // red1 kolona2 naziv

				String adresa = resultSet.getString(3); // red1 kolona3 adresa

				String grad = resultSet.getString(4); // red1 kolona4
														// mesto.naziv AS grad

				System.out.println(idFil + "\t" + naziv + "\t" + adresa + "\t"
						+ grad);// "\t" izmedju nabrajanja
			}

		}
	}
}
