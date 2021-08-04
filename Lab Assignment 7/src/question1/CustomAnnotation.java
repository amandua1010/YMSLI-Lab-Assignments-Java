package question1;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
//import java.lang.reflect.Method;

// Author Annotation
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
	String name() default "unknown";
}

//Version Annotation
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface Version {
	double number();
}


@Author(name = "Johny")
@Version(number = 1.0)
class AnnotatedClass {
	
	@Author(name = "Sample Author")
	@Version(number = 1.0D)
	public AnnotatedClass() {
		System.out.println("Hey");
	}
	
	public AnnotatedClass(int a) {
		System.out.println("Hii");
	}
	
	@Author(name = "Arthur")
	@Version(number = 2.0f)
	public void annotatedMethod1() {
		
	}
	
	@Author(name = "James")
	@Version(number = 4.0)
	public void annotatedMethod2() {
		
	}
	
}


public class CustomAnnotation {
	
	// For Constructor
	private static void readAnnotation(Constructor<?>[] constructors) {
		
		int count = 0;
		
		for (Constructor<?> constructor : constructors) {

			System.out.println( count + 1 + " Constructor is: " + constructor );

			if (constructor.isAnnotationPresent(Author.class)) {
				Author annot = constructor.getAnnotation(Author.class);
				System.out.println("Author : " + annot.name());
			}

			if (constructor.isAnnotationPresent(Version.class)) {
				Version annot = constructor.getAnnotation(Version.class);
				System.out.println("Version : " + annot.number());
			}
			count++;
		}
		
	}
	
	// For Class
	private static void readAnnotation(Class<?> clazz) {
		
		Annotation[] annotations = clazz.getAnnotations();
		for (Annotation annotation : annotations) {
			
			if (annotation instanceof Author) {
				Author author = (Author) annotation;
				System.out.println("Author : " + author.name());
			}
			
			if (annotation instanceof Version) {
				Version version = (Version) annotation;
				System.out.println("Version : " + version.number());
			}
			
		}
		
	}
	
	// For Method
	public static void readAnnotation(Method [] methods) {
		
		int count = 0;
		for (Method method : methods) {

			System.out.println( count + 1 + " Method is: " + method );

			if (method.isAnnotationPresent(Author.class)) {
				Author annot = method.getAnnotation(Author.class);
				System.out.println("Author : " + annot.name());
			}

			if (method.isAnnotationPresent(Version.class)) {
				Version annot = method.getAnnotation(Version.class);
				System.out.println("Version : " + annot.number());
			}
			
			count++;
		}
		
	}


	public static void main(String[] args) {
		
		System.out.println("Details of Annotated Class: ");
		System.out.println();
		
		try {
			
			Class<?> clazz = Class.forName("question1.AnnotatedClass");		// contains meta data of class
			
			System.out.println("Constructor Annotations:- ");
			Constructor<?>[] constructors = clazz.getConstructors();
			readAnnotation(constructors);
			System.out.println();
			
			System.out.println("Class Annotations:- ");
			readAnnotation(clazz);
			System.out.println();
			
			System.out.println("Method Annotations:- ");
			Method [] methods  = clazz.getDeclaredMethods();
			readAnnotation(methods);
			System.out.println();
		
		} 
		
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
