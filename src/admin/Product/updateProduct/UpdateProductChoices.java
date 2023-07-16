
package admin.Product.updateProduct;

import mobilestoremanagementsystem.Input;


public class UpdateProductChoices 
{
             public void updateProductChoices(String productName)
             {
                     Input input = new Input();
              try
               {
                          String temp = "";
                          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
                          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
                          System.out.println("+++++++++++++ A  :  Update Company Name ++++++++++++++");
                          System.out.println("+++++++++++++ B  :  Update Front Camera ++++++++++++++++");
                          System.out.println("+++++++++++++ C  :  Update Back Camera  ++++++++++++++++");
                          System.out.println("+++++++++++++ D  :  Update Screen Type  +++++++++++++++++");
                          System.out.println("+++++++++++++ E  :   Update Screen Size  +++++++++++++++++");
                          System.out.println("+++++++++++++ F  :   Update  Battery Power  +++++++++++++++");
                          System.out.println("+++++++++++++ G :   Update Ram  ++++++++++++++++++++++");
                          System.out.println("+++++++++++++ H :  Update Inbuilt Storage  +++++++++++++++");
                          System.out.println("+++++++++++++ I   :  Update Expandable Storage  +++++++++++");
                          System.out.println("+++++++++++++ J   :  Update Processor   ++++++++++++++++++"); 
                          System.out.println("+++++++++++++ K  :  Update  Operating System  +++++++++++++");
                          System.out.println("+++++++++++++ L   :   Update Warranty  +++++++++++++++++++");
                          System.out.println("+++++++++++++ M  :  Update Quantity  ++++++++++++++++++++");
                          System.out.println("+++++++++++++ N  :  Update Price  +++++++++++++++++++++++");
                          System.out.println("+++++++++++++ X  :  Exit +++++++++++++++++++++++++++++");
                          System.out.println("+++++++++++++ Enter your Choice ::: ");
                          String choice =  input.inputString();
                          choice = choice.toUpperCase().trim();
                          if(choice.equals("A"))
                          {
                                 System.out.println("Enter Company Name ::: ");
                                 temp = input.inputString();
                                 temp = temp.trim();
                                 UpdateProduct medicines = new UpdateProduct();
                                 medicines.updateProductData(productName, temp, 1);
                          }
                          else if(choice.equals("B"))
                          {
                                 System.out.println("Enter Front Camera(MegaPixels) ::: ");
                                 temp = input.inputString();
                                 temp = temp.trim();
                                 UpdateProduct medicines = new UpdateProduct();
                                 medicines.updateProductData(productName, temp, 2);
                              
                          }
                          else if(choice.equals("C"))
                          {
                                 System.out.println("Enter Back Camera(MegaPixels) ::: ");
                                 long countactNumber = input.longBug();
                                 temp = Long.toString(countactNumber);
                                 temp = temp.trim();
                                 UpdateProduct medicines = new UpdateProduct();
                                 medicines.updateProductData(productName, temp, 3);
                          }
                          else if(choice.equals("D"))
                          {
                                 System.out.println("Enter Screen Type ::: ");
                                 temp = input.inputString();
                                 temp = temp.trim();
                                 UpdateProduct medicines = new UpdateProduct();
                                 medicines.updateProductData(productName, temp, 4);
                          }
                          else if(choice.equals("E"))
                          {
                                 System.out.println("Enter Screen Size ::: ");
                                 temp = input.inputString();
                                 temp = temp.trim();
                                 UpdateProduct medicines = new UpdateProduct();
                                 medicines.updateProductData(productName, temp, 5);
                          }
                          else if(choice.equals("F"))
                          {
                                 System.out.println("Enter Battery Power ::: ");
                                 temp = input.inputString();
                                 temp = temp.trim();
                                 UpdateProduct medicines = new UpdateProduct();
                                 medicines.updateProductData(productName, temp, 6);
                          }
                          else if(choice.equals("G"))
                          {
                                 System.out.println("Enter Ram ::: ");
                                 temp = input.inputString();
                                 temp = temp.trim();
                                 UpdateProduct medicines = new UpdateProduct();
                                 medicines.updateProductData(productName, temp, 7);
                          }
                          else if(choice.equals("H"))
                          {
                                 System.out.println("Enter Inbulit Storage ::: ");
                                 temp = input.inputString();
                                 temp = temp.trim();
                                 UpdateProduct medicines = new UpdateProduct();
                                 medicines.updateProductData(productName, temp, 8);
                          }
                          else if(choice.equals("I"))
                          {
                                 System.out.println("Enter Expandable Stroage ::: ");
                                 temp = input.inputString();
                                 temp = temp.trim();
                                 UpdateProduct medicines = new UpdateProduct();
                                 medicines.updateProductData(productName, temp, 9);
                          }
                          else if(choice.equals("J"))
                          {
                                 System.out.println("Enter Processor ::: ");
                                 temp = input.inputString();
                                 temp = temp.trim();
                                 UpdateProduct medicines = new UpdateProduct();
                                 medicines.updateProductData(productName, temp, 10);
                          }
                          else if(choice.equals("K"))
                          {
                                 System.out.println("Enter Operating System ::: ");
                                 temp = input.inputString();
                                 temp = temp.trim();
                                 UpdateProduct medicines = new UpdateProduct();
                                 medicines.updateProductData(productName, temp, 11);
                          }
                          else if(choice.equals("L"))
                          {
                                 System.out.println("Enter Warranty ::: ");
                                 temp = input.inputString();
                                 temp = temp.trim();
                                 UpdateProduct medicines = new UpdateProduct();
                                 medicines.updateProductData(productName, temp, 12);
                          }
                          else if(choice.equals("M"))
                          {
                                 System.out.println("Enter Quantity ::: ");
                                 int quantity =  input.integerBug();
                                 temp = Integer.toString(quantity);
                                 temp = temp.trim();
                                 UpdateProduct medicines = new UpdateProduct();
                                 medicines.updateProductData(productName, temp, 13);
                          }
                          else if(choice.equals("N"))
                          {
                                 System.out.println("Enter Price ::: ");
                                 int Price =  input.integerBug();
                                 temp = Integer.toString(Price);
                                 temp = temp.trim();
                                 UpdateProduct medicines = new UpdateProduct();
                                 medicines.updateProductData(productName, temp, 14);
                          }
                          else if(choice.equals("X"))
                          {
                                 
                          }
                          else
                          {
                              System.out.println("Enter the Choice Between the given Choices .......................");
                             
                          }
                          
             }
            catch (Exception e) {
           }
          
        }    
                 
             
}
