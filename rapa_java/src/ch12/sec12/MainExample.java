package ch12.sec12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainExample {

	public static void main(String[] args)  {
		try {
			Class _class = MyService.class;
			Method[] methods = _class.getMethods();
			
			for(Method method : methods) {
				PrintAnnotation printAnn = method.getAnnotation(PrintAnnotation.class);
				if(printAnn != null) {
					String mark = printAnn.value();
					int number  = printAnn.number();
					for(int i=0; i< number; i++) {
						System.out.print(mark);
					}
					System.out.println();
					method.invoke(new MyService());
					for(int i=0; i< number; i++) {
						System.out.print(mark);
					}
					System.out.println();
				}
			}			
			
		} catch(Exception e) {System.err.println(e.getMessage());}


	}

}
