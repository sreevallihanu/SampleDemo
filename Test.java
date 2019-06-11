import java.util.ArrayList;
/* class Animal{
	String type = "Canine";
	int maxSpeed=60;
	Animal(){}
	Animal(String type,int maxSpeed){
		this.type=type;
		this.maxSpeed=maxSpeed;
	}
}
class WildAnimal extends Animal{
	String bounds;
	WildAnimal(String bounds){
		//super();
		this("Canine",60);
		this.bounds=bounds;
	}
	WildAnimal(String type,int maxSpeed,String bounds){
		/* super(type,maxSpeed);
		this.bounds=bounds; */
	//}
//} *//* 
/*class Caller{
	private void init(){
		System.out.println("init initialized");
	}
	private void start(){
		init();
		System.out.println("started");
	}
} *//* 
class Employee{
	public int salary;
} 
class Manager extends Employee{
	public int budget;
}
class Director extends Manager{
	public int stockOptions;
} */
/* import java.util.ArrayList;
abstract class Animal{
	
}
interface Hunter{}
class Cat extends Animal implements Hunter{}
class Tiger extends Cat{} */
/* class Vehicle{
int x;
Vehicle(){
	this.x=10;
}
Vehicle(int x){
	this.x=x;
}
}
class Car extends Vehicle{
	int y;
	Car(){
		super();
		this(20);
	}
	Car(int y){
		this.y=y;
	}
	public String toString(){
		return super.x+":"+this.y;
	}
} */
/* class Base{
	public void test(){
		System.out.println("base");
	}
} *//* 
class A{
	int r;
	 A(int r){
		this.r=r;
	}
}
class B extends A{
	int c;
	B(int r,int c){
		super(r);
		this.c=c;
	}
} */
/* interface Readable{
	public void readBook();
	public void setBookMark();
}
class Book implements Readable{
	public void readBook(){}
}
class Ebook extends Book{
	public void readBook(){}
	public void setBookMark(){}
} */
/* class X{
	public void printfile()throws IOException{
		
	}
} */
/* class Vehicle{
	String type="4w";
	int maxSpeed=100;
	Vehicle(String type,int maxSpeed){
		this.type=type;
		this.maxSpeed=maxSpeed;
	}
}
class Car extends Vehicle{
	String trans;
	Car(String trans){
		this.trans=trans;
	}
	Car(String type,int maxSpeed,String trans){
		super(type,maxSpeed);
		this(trans);
	}
} */
public class Test{
	
		public static void main(String[] args) {
			/* WildAnimal wolf=new WildAnimal("long");
			WildAnimal tiger=new WildAnimal("feline",80,"short");
			System.out.println(wolf.type+""+wolf.maxSpeed+""+wolf.bounds);
			System.out.println(tiger.type+""+tiger.maxSpeed+""+tiger.bounds); */
			boolean a=new Boolean(Boolean.valueOf(args[0]));
			boolean b=new Boolean(args[1]);
			System.out.println(a+""+b); 
			/* Caller c=new Caller();
			c.init();
			c.start(); */
			/* Employee e=new Employee();
			Director d=new Director();
			Manager m=new Manager();
			//e.salary=50_000;
			d.stockOptions=500;  */
			/* ArrayList<Animal> mylist=new ArrayList<>();
			mylist.add(new Tiger()); */
	} 
	// public static void main(String[] args) {
		// Vehicle y=new Car();
		// System.out.println(y);
	// }

/* public static void main(String[] args){
	Car c1=new Car("Auto");
	Car c2=new Car("4W",150,"manual");
	System.out.println(c1.type+" "+c1.maxSpeed+" "+c1.trans);
	System.out.println(c2.type+" "+c2.maxSpeed+" "+c2.trans);
 */		//double discount=0;
		//int qty=Integer.parseInt(args[0]);
		/* if(qty >= 90){discount=0.5;}
		if(qty>80 && qty<90){discount=0.2;} */
		//discount=(qty>=90)?0.5:(qty>80)?0.2:0;
		/* discount=(qty>=90)?0.5:0;
		discount=(qty>80)?0.2:0; */
		/* if(qty>80&&qty<90){
		discount=0.2;
	}
	else{
		discount=0;
	}
	if(qty>=90){
		discount=0.5;
	}
	else{
		discount=0;
	} */
	/* Book b=new EBook();
	b.readBook(); */
	/* X obj=new X();
	obj.printfile(); */
	//}
}