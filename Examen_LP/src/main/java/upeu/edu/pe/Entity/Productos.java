package upeu.edu.pe.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Productos {
 
	private int ProductID;
	private String ProductName;
	private int SupplierID;
	private int CategoryID;
	private String QuantityPerUnit;
	private int UnitPrice;
	private int UnitsInStock;
	private int UnitsOnOrder;
	private int ReorderLevel;
	private int Discontinued;
}
