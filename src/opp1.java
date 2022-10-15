
package oop1;

public class Main {

	public static void main(String[] args) {
		//Object Oriented Programming nesne yönelimli programlama
		/*
		Product product1 = new Product();
		//set value
		product1.name = "Delonghi Kahve Makinesi" ;
		product1.unitPrice = 7500;
		product1.discount = 7 ;
		product1.unitInStock = 4 ;
		product1.imageUrl = "bilmemne1.jpg" ;
		//get
		System.out.println(product1.name);
		
		Product product2 = new Product();
		product2.name = "Smeg Kahve Makinesi" ;
		product2.unitPrice = 6500;
		product2.discount = 9 ;
		product2.unitInStock = 1 ;
		product2.imageUrl = "bilmemne2.jpg" ;
		
		Product product3 = new Product();
		product3.name = "Kitchen Aid Kahve Makinesi" ;
		product3.unitPrice = 3500;
		product3.discount = 8 ;
		product3.unitInStock = 3 ;
		product3.imageUrl = "bilmemne3.jpg" ;
		
		Product[] products = {product1,product2,product3};	
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.name + "</li>");
			System.out.println("<li>" + product.unitPrice + "</li>");
		}
		System.out.println("</ul>");
		*/
		
		Product product1 = new Product();
		//set value
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("image1.jpg");
		//get
		
		Product product2 = new Product();
		product2.setName("Tospik Kahve Makinesi");
		product2.setDiscount(10);
		product2.setUnitPrice(15500);
		product2.setUnitInStock(1);
		product2.setImageUrl("image2.jpg");
		//get
		
		Product product3 = new Product();
		product3.setName("Piştipoştipuu Kahve Makinesi");
		product3.setDiscount(14);
		product3.setUnitPrice(9500);
		product3.setUnitInStock(6);
		product3.setImageUrl("image3.jpg");
		//get
		
		Product[] products = {product1,product2,product3};	
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
			System.out.println("<li>" + product.getUnitPrice() + "</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("1234");
		individualCustomer.setPhone("053656599");
		individualCustomer.setFirstName("Semanur");
		individualCustomer.setLastName("Salın");
		
		for (Product product : products) {
			System.out.println(individualCustomer.getFirstName());
			
		}
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("054589895");
		corporateCustomer.setTaxNumber("0123456789");
		corporateCustomer.setCustomerNumber("56565");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		

		
