package az.edu.turing.module03.lesson7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {

    public static void main(String[] args)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException {


        User user = new User("Test", 15, "12345");

        Class<User> clazz = User.class;


        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.isAnnotationPresent(Print.class)) {
                int times = method.getAnnotation(Print.class).times();
                for (int i = 0; i < times; i++) {
                    method.setAccessible(true);
                    method.invoke(user, "This is printInfo method");
                }

            }

        }

    }

}
