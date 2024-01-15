package novelPublisher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Novel_Impl implements Novel_Interface {
	
	InputStreamReader r = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(r);
	
	int tot = 0;
	int qty = 0;
	String type;
	
	@Override
	public void novelService() {

		try {
			
			System.out.println("Novel\t\t\tPrice\n\nVeronica\t\t1350\nPrince & Father\t\t1000\nForest\t\t\t1100\nHarry Potter\t\t1500\nRobinson Cruse\t\t1350\n\n");
			
			System.out.println("Enter the Name of Novel wanted: ");
			type = br.readLine();
			
			
			System.out.println("\nEnter the quantity required: ");
			qty = br.read();
			
			
			if(type.equalsIgnoreCase("Veronica"))
			{
				tot = 1350 * (qty-48);
			}
			else if(type.equalsIgnoreCase("Prince&Father"))
			{
				tot = 1000 * (qty-48);
			}
			else if(type.equalsIgnoreCase("Forest"))
			{
				tot = 1100 * (qty-48);
			}
			else if(type.equalsIgnoreCase("HarryPotter"))
			{
				tot = 1500 * (qty-48);
			}
			else if(type.equalsIgnoreCase("RobinsonCruse"))
			{
				tot = 1350 * (qty-48);
			}
			
			
			System.out.println("\nTotal payable: " +tot + "\n\n");
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
