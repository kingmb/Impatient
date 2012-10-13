package chapter05;

  public class Exercise09 {
		private String manufacturer;
		private String name;
		private int year;
		private String licensePlate;
		
	  public Exercise09(String manufacturer, String name, int year, String licensePlate) {
	  	this.manufacturer = manufacturer;
	  	this.name = name;
	  	this.year = year;
	  	this.licensePlate = licensePlate;
	  }
    
	  // und noch 4 getter und 3 setter
	  
	  Exercise09(String manufacturer, String name) {
      this(manufacturer, name, -1, "");
  	}
	  Exercise09(String manufacturer, String name, int year) {
      this(manufacturer, name, year, "");
  	}
	  Exercise09(String manufacturer, String name, String licensePlate) {
      this(manufacturer, name, -1, licensePlate);
  	}
    public String toString() {  return manufacturer + name + year + licensePlate; }
    
    public static void main(String[] parameter){
    	System.out.println(new Exercise09("hl", "DDF"));
    } 
}