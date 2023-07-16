
package admin.Product.addproduct;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class StoreProductData 
{
      public void storeProductNames(String productName)
     {
         try
         {
                FileWriter writer = new FileWriter("ProductNames.txt",true);
                BufferedWriter buffWriter = new BufferedWriter(writer);
                buffWriter.write(productName);
                buffWriter.newLine();
                buffWriter.close();
         }
         catch (Exception e) {
         }
     }
     
     public void storeMedicianData(String name, String cName, String fcamera, String bcamera, String screenType, String screenSize, String batteryPower, 
             String ram, String inbuiltStorage, String expandableStorage, String processor, String operatingSystem,
             String warranty, String quantity, String price)
     {
           
           try 
           {  
                 name = name.toUpperCase().trim();
                 FileWriter fileWriter = new FileWriter(name+".txt");
                 BufferedWriter writer = new BufferedWriter(fileWriter);
                 writer.write(name);
                 writer.newLine();
                 writer.write(cName);
                 writer.newLine();
                 writer.write(fcamera);
                 writer.newLine();
                 writer.write(bcamera);
                 writer.newLine();
                 writer.write(screenType);
                 writer.newLine();
                 writer.write(screenSize);
                 writer.newLine();
                 writer.write(batteryPower);
                 writer.newLine();
                 writer.write(ram);
                 writer.newLine();
                 writer.write(inbuiltStorage);
                 writer.newLine();
                 writer.write(expandableStorage);
                 writer.newLine();
                 writer.write(processor);
                 writer.newLine();
                 writer.write(operatingSystem);
                 writer.newLine();
                 writer.write(warranty);
                 writer.newLine();
                 writer.write(quantity);
                 writer.newLine();
                 writer.write(price);
                 writer.newLine();
                 writer.close();
                 storeProductNames(name);
           } catch (Exception e) 
          {
          }
     }
}
