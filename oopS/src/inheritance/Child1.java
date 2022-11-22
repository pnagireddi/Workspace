package inheritance;

public class Child1 extends Parent1{
int x;
int y;
public Child1() {
	x=100;
	y=200;
	System.out.println("child class constructor");
}
public Child1(int x, int y) {
	super(30);
	this.x=x;
	this.y=y;
}
public void display() {
	System.out.println("a="+a);
	System.out.println("b="+b);
	System.out.println("c="+c);
	System.out.println("x="+x);
	System.out.println("y="+y);
}
}
