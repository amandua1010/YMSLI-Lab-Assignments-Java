package question1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


enum DemoEnumSingleton {
	INSTANCE;
}

class Singleton implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;
	
//	private static Singleton singleton = new Singleton();	//-->	Eager Initialization

	
//  Static Initialization
	
//	private static Singleton singleton;
//	static {
//		singleton = new Singleton();
//	}
	

	private static volatile Singleton singleton; 	// volatile keyword

	private Singleton() {
		if (singleton != null) {
			throw new IllegalStateException();
		}
	}

	
// Double Checking for making it Thread Safe
	
	public static Singleton getSingleton() {

		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton(); 			// --> Lazy Initialization
				}
			}
		}

		return singleton;
	}


//  Clone prevention
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	
//	preventing for serialization and deserialization issue using readResolve method
	
	private Object readResolve() {
		return getSingleton();
	}

}

public class SingletonDp {

	public static void main(String[] args)
			throws CloneNotSupportedException, FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		
		Singleton singletonDemo = Singleton.getSingleton();
		System.out.println(singletonDemo.hashCode());

		
//		Serialization and Deserailization issue

		Singleton singletonSerialization = Singleton.getSingleton();
		System.out.println(singletonSerialization.hashCode());

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("demo.txt")));
		oos.writeObject(singletonSerialization);

		// Read back
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("demo.txt")));

		Singleton singletonDeSerialization = (Singleton) ois.readObject();

		System.out.println(singletonDeSerialization.hashCode());
		oos.close();
		ois.close();

		
//		Cloning issue

		Singleton singleton2 = (Singleton) singletonDemo.clone();
		System.out.println(singleton2.hashCode());


// 		Enum Singleton
		System.out.println(DemoEnumSingleton.INSTANCE.hashCode());

		
//		Java Reflection in singleton
		
		Singleton singletonJavaReflection1 = Singleton.getSingleton();
		System.out.println(singletonJavaReflection1.hashCode());

		Class<?> clazz = Class.forName("question2.Singleton");

		@SuppressWarnings("rawtypes")
		Constructor [] constructors = clazz.getDeclaredConstructors();
		constructors[0].setAccessible(true);

		Singleton singletonJavaReflection2 = (Singleton) constructors[0].newInstance();

		System.out.println(singletonJavaReflection2.hashCode());
		
		


	}

}








