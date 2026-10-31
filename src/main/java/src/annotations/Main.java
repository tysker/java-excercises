package src.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// https://www.youtube.com/watch?v=DkZr7_c9ry8
public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat myCat = new Cat("Lissi");

        // checking for an annotation to be present
        if (myCat.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("This is very important!");
        } else {
            System.out.println("This is not very important");
        }

        // loop through all methods to check if annotation is present. Done with reflection
        for (Method method : myCat.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                int times = annotation.times();

                for (int i = 0; i < times; i++) {
                    method.invoke(myCat);
                }
            }
        }

        // check for annotations in a field
        for (Field field : myCat.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(ImportantString.class)) {
                Object objectValue = field.get(myCat);

            // if(objectValue instanceof String){}
                if(objectValue instanceof String stringValue) {
                    System.out.println(stringValue.toUpperCase());
                }
            }
        }

        // loop through all methods to check if annotation is present. Done with reflection
        for (Method method : myCat.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(OnlyWeekend.class)) {
                OnlyWeekend annotation = method.getAnnotation(OnlyWeekend.class);
                Weekdays[] days = annotation.day();

                for (Weekdays day : days) {
                    if(day.equals(Weekdays.SATURDAY) || day.equals(Weekdays.SUNDAY)){
                        System.out.println("It's Weekend!! (-:");
                    } else {
                        System.out.println("Back to work!!! )-:");
                    }
                }
            }
        }
    }
}
