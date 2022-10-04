package upeu.edu.pe.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Suppliers {

	private int SupplierID;
	private int CompanyName;
	private int ContactName;
	private int ContactTitle;
	private int Address;
	private int City;
	private int Region;
	private int PostalCode;
	private int Country;
	private int Phone;
	private int Fax;
	private int HomePage;	
}
