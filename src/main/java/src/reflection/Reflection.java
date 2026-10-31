//package src.reflection;
//
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
//
//public class Reflection {
//
//    public <T> void useReflectionToPersistEntity(Class<T> clazz ) {
//        try {
//            T t = clazz.getDeclaredConstructor().newInstance();
//            Method[] methods = t.getClass().getMethods();
//
//            for (int i = 0; i < methods.length; i++) {
//                System.out.println(methods[i].getName());
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        Cat myCat = new Cat("Barsik", 3);
//
//        Class<? extends Cat> catClass = myCat.getClass();
//        String canonicalName = catClass.getCanonicalName();
//        Field[] declaredFields = catClass.getDeclaredFields();
//
//        System.out.println(canonicalName);
//
//        for (Field field : declaredFields) {
//            if (field.getName().equals("name")) {
//                field.setAccessible(true);
//                try {
//                    field.set(myCat, "Krumme");
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        System.out.println(myCat.getName());
//
//    }
//}
