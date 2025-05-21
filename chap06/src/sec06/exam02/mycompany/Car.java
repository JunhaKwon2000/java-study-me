package sec06.exam02.mycompany;

// when using class from other packages, you need to import them (* means everything)
import sec06.exam02.hankook.SnowTire; 
import sec06.exam02.hankook.Tire;
import sec06.exam02.hyundai.Engine;
import sec06.exam02.kumho.BigWidthTire;

public class Car {
	
	// field - ("has a" relationship)
	Engine engine = new Engine(); // auto complete -> auto import or use (ctrl + shift + o)
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();

	
	// if you want to use hankook tire
	Tire tire3 = new Tire();
	
	// if you also want to use kumho tire - use full classname when you can't use import
	// don't make the classes have same name
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();
}
