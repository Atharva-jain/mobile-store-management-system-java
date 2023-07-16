
package admin.Product.addproduct;

import admin.Product.ProductChoices;
import mobilestoremanagementsystem.CheckCompanyName;
import mobilestoremanagementsystem.Input;
import mobilestoremanagementsystem.ProductCheck;


public class AddProduct
{
      Input input = new Input();
      public void insertProduct()
      {
            CheckCompanyName  ccn = new CheckCompanyName();
            System.out.println("//////////////////////////////////////////////////////////////////////////////");
            System.out.println("----------------------------------------------------------------");
            System.out.println("Enter Product Name ::: ");
            String productName =  input.inputString();
            ProductCheck check1 = new ProductCheck();
            productName = productName.toUpperCase().trim();
            boolean ok = check1.checkMedicine(productName);
            if(ok){
            System.out.println("----------------------------------------------------------------");
            System.out.println("Enter Company Name ::: ");
            String companyName = input.inputString();
            companyName = companyName.toUpperCase().trim();
            boolean check = ccn.checkingCompanyName(companyName);
            if(check)
            {
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter Front Camera(Megapixels) ::: ");
                String frontCamera = input.inputString();
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter Back Camera(Megapixels) ::: ");
                String backCamera = input.inputString();
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter Screen Type ::: ");
                String screenType = input.inputString();
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter Screen Size ::: ");
                String screenSize = input.inputString();
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter Battery Power(mH) ::: ");
                String batteryPower  = input.inputString();
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter Ram ::: ");
                String ram = input.inputString();
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter Inbuilt Storage ::: ");
                String inbuiltStorage = input.inputString();
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter Expandable Storage ::: ");
                String expandableStorage = input.inputString();
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter Processor ::: ");
                String processor = input.inputString();
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter Operating System ::: ");
                String operatingSystem = input.inputString();
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter Warranty ::");
                String warranty = input.inputString();
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter Quantity ::: ");
                int quantity = input.integerBug();
                String quantityString  = Integer.toString(quantity);
                System.out.println("----------------------------------------------------------------");
                System.out.println("Price  ::: ");
                int price = input.integerBug();
                String pricePerUnit = Integer.toString(price);
                System.out.println("----------------------------------------------------------------");
                StoreProductData data = new StoreProductData();
                data.storeMedicianData(productName, companyName, frontCamera, backCamera, screenType, screenSize, batteryPower, ram, 
                inbuiltStorage, expandableStorage, processor, operatingSystem, warranty, quantityString, pricePerUnit);
                System.out.println("Medicine Details are Store !!! ...............................");
                ProductChoices choices = new ProductChoices();
                choices.productChoices();
            }
            else
            {
                System.out.println("Company Name is Not Availlable ..............");
                System.out.println("You want to try Again (Yes / No )");
                String str = input.inputString();
                str = str.toUpperCase().trim();
                if(str.equals("YES"))
                {
                    insertProduct();
                }
                else
                {
                     ProductChoices choices = new ProductChoices();
                     choices.productChoices();
                }
            }
            }
            else
            {
                System.out.println("Product Name is Already Availlable ..............");
                System.out.println("You want to try Again (Yes / No )");
                String str = input.inputString();
                str = str.toUpperCase().trim();
                if(str.equals("YES"))
                {
                    insertProduct();
                }
                else
                {
                      ProductChoices choices = new ProductChoices();
                     choices.productChoices();
                }
            }
      }    
}
