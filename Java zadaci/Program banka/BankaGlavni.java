
package domaciSql;

import java.sql.SQLException;
import java.util.Scanner;

public class BankaGlavni {

	public static void main(String[] args) {

		BankaSql database = new BankaSql(
				"jdbc:sqlite:C:\\Users\\Irena\\Desktop\\JDBC_SQLite\\Banka.db");
		Scanner sc = new Scanner(System.in);
		
		try {
			database.printNazivMesta();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
