package Java_Package;

public class RentalManagementEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarSystem myCar=new CarSystem("Civic",2010,500.00);
		myCar.display();
		System.out.println("updating Car Details.......");
		
        myCar.setModel("Honda");
        myCar.setYear(2022);
        myCar.setPriceperday(1000.00);
        myCar.display();
	}

}

class CarSystem
{
	private String model;
	private int year;
	private double priceperday;
	
	public CarSystem (String model, int year, double priceperday)
	{
		this.model = model;
		this.year=year;
		this.priceperday=priceperday;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPriceperday(double RentalPricePerDay) {
		return priceperday;
	}

	public void setPriceperday(double priceperday) {
		if (priceperday>0)
		{
		this.priceperday = priceperday;
	}
		this.priceperday = priceperday;
	}
		
		public void display()
		{
		System.out.println("Car Model "+ model);
		System.out.println("Car Year "+ year);
		System.out.println("Car price "+ priceperday);
		}
}


