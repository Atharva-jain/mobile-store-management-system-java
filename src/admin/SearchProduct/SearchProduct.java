
package admin.SearchProduct;

import admin.Product.ProductChoices;
import customer.customerinfo.CustomerChoices;
import java.io.BufferedReader;
import java.io.FileReader;
import mobilestoremanagementsystem.CheckCompanyName;
import mobilestoremanagementsystem.Input;
import mobilestoremanagementsystem.ProductCheck;


public class SearchProduct
{
    
       public void displayData(String productName)
      {
          try
          {
               FileReader fileReader = new FileReader(productName+".txt");  
               BufferedReader reader = new BufferedReader(fileReader);
               String data =  "";
               int i = 0 ; 
               System.out.println("//////////////////////////////////////////////////////////////////////////////");
               while((data = reader.readLine()) != null)
               {
                     if(i == 0 )
                     {
                         System.out.println("Product Name ::: " +data);
                     }

                      
                     if(i == 1 )
                     {
                         System.out.println("Company Name ::: " +data);
                     }
                     if(i == 2 )
                     {
                         System.out.println("Front Camera ::: " +data);
                     }
                     if(i == 3 )
                     {
                         System.out.println("Back Camera ::: " +data);
                     }
                     if(i == 4 )
                     {
                         System.out.println("Screen Type  ::: " +data);
                     }
                     if(i == 5 )
                     {
                         System.out.println("Screen Size ::: " +data);
                     }
                     if(i == 6 )
                     {
                         System.out.println("Battery Power ::: " +data);
                     }
                     if(i == 7 )
                     {
                         System.out.println("Ram ::: " +data);
                     }
                     if(i == 8 )
                     {
                         System.out.println("Inbuilt Storage ::: " +data);
                     }
                     if(i == 9 )
                     {
                         System.out.println("Expandable Storage ::: " +data);
                     }
                     if(i == 10 )
                     {
                         System.out.println("Processor ::: " +data);
                     }
                     if(i == 11 )
                     {
                         System.out.println("Operating System ::: " +data);
                     }
                     if(i == 12 )
                     {
                         System.out.println("Warranty ::: " +data);
                     }
                     if(i == 13 )
                     {
                         System.out.println("Quantity ::: " +data);
                     }
                     if(i == 14 )
                     {
                         System.out.println("Price ::: " +data);
                     }
                     i++;
               }
               System.out.println("//////////////////////////////////////////////////////////////////////////////");
          }
          catch (Exception e) {
          }
      }
    
      public void searchProduct(String userID, int index)
      {
           Input input = new Input();
           System.out.println("//////////////////////////////////////////////////////////////////////////////");
           System.out.println("----------------------------------------------------------------");
           System.out.println("Enter Mobile Name ::: ");
           String companyName = input.inputString();
           companyName = companyName.toUpperCase().trim();
           ProductCheck ccn = new ProductCheck();
           boolean check = ccn.checkingMedicine(companyName);
           if(check)
           {
                 displayData(companyName);
                      if(index == 0)
                      {
                          ProductChoices choices = new ProductChoices();
                          choices.productChoices();
                      }
                      if(index == 1)
                      {
                          CustomerChoices cc = new CustomerChoices();
                          cc.customerChoices(userID);
                      }
           }
           else
           {
                System.out.println("Company Name is Not Availlable ..............");
                System.out.println("You want to try Again (Yes / No )");
                String str = input.inputString();
                str = str.toUpperCase().trim();
                if(str.equals("YES"))
                {
                    searchProduct(userID,index);
                }
                else
                { 
                      if(index == 0)
                      {
                          ProductChoices choices = new ProductChoices();
                          choices.productChoices();
                      }
                      if(index == 1)
                      {
                          CustomerChoices cc = new CustomerChoices();
                          cc.customerChoices(userID);
                      }
                      
                }
                
           }
      }
    
}
