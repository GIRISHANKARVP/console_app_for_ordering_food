package order;

public abstract class AbstractView {
	public void start(){
		System.out.println("~~ WELCOME TO OUR RESTAURANT FOR ORDERING FOOD ~~");
	}
	public abstract void getUser();
	public abstract void ordering(int a);
	public abstract void bill();
}
