package question1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MerchandiseInventory {
	
	public static void printMerchandiseList(ArrayList<Merchandise> merchandiseList) {
		for(Merchandise item : merchandiseList) {
			System.out.println(item);
		}
	}

	public static void main(String[] args) {
		
		ArrayList<Merchandise> merchandiseList = new ArrayList<>();
		
		String inputDataFilePath = "C:\\Users\\ve00ym263\\Documents\\workspace-spring-tool-suite-4-4.4.2.RELEASE\\Machine Test 1 Java\\src\\question1\\inputData.txt";
		
		File datafile = new File(inputDataFilePath);
		
		String inputData = null;
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(datafile));
			
			while((inputData = br.readLine()) != null) {
				
				String tokens[] = inputData.split(" ");
				merchandiseList.add(new Merchandise(tokens[0], Integer.parseInt(tokens[1]), Double.parseDouble(tokens[1])));
				
			}
			
			br.close();
			
		} 
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Merchandise Items are sorted ascending order on the basis of names and is displayed below: ");
		Collections.sort(merchandiseList);
		printMerchandiseList(merchandiseList);
		
		System.out.println();
		
		System.out.println("Now Merchandise Items are sorted in descending order on the basis of price and is displayed below: ");
		Collections.sort(merchandiseList, new Comparator<Merchandise>() {
			public int compare(Merchandise item1, Merchandise item2) {
				return Double.compare(item1.getUnitPrice(), item2.getUnitPrice());
			}
		});
		printMerchandiseList(merchandiseList);
		
	}

}
