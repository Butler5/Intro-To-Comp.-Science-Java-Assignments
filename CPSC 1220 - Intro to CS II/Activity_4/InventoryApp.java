/**
 * Program for InventoryApp.
 *
 * Activity_04 - InventoryApp.java
 * Adam Butler - CPSC 1220 - AO1
 * 11-03-22
 */
public class InventoryApp {
    /**
     * Main method for InventoryApp.
     * @param args for args
     */
   public static void main(String[] args) {
   
      InventoryItem.setTaxRate(0.05);
     
      InventoryItem item1 = new InventoryItem("Oil Change Kit", 39);
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80, 1.8);
      OnlineArticle item3 = new OnlineArticle("Java News", 8.5);
      item3.setWordCount(700);
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L.G. Jones");
     
      System.out.println(item1);
      System.out.println(item2);
      System.out.println(item3);
      System.out.println(item4);
   }
}