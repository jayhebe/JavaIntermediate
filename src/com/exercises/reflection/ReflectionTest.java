package com.exercises.reflection;

public class ReflectionTest {
    public static void main(String[] args) throws Exception {
        //Before reflection
//        Person p1 = new Person("Tom", 12);
//        p1.age = 10;
//        System.out.println(p1);
//        p1.show();

        //With reflection
//        Class clazz = Person.class;
//        Constructor cons = clazz.getConstructor(String.class, int.class);
//        Object obj = cons.newInstance("Tom", 12);
//        Person p = (Person) obj;
//        System.out.println(p);
//        Field age = clazz.getDeclaredField("age");
//        age.set(p, 10);
//        System.out.println(p);
//        clazz.getDeclaredMethod("show").invoke(p);
//
//        Constructor cons1 = clazz.getDeclaredConstructor(String.class);
//        cons1.setAccessible(true);
//        Person p1 = (Person) cons1.newInstance("Jerry");
//        System.out.println(p1);
//        Field name = clazz.getDeclaredField("name");
//        name.setAccessible(true);
//        name.set(p1, "Hanmeimei");
//        System.out.println(p1);
//        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
//        showNation.setAccessible(true);
//        showNation.invoke(p1, "China");
        test1();
    }

    public static void test1() throws ClassNotFoundException {
        //Method 1
        Class<Person> clazz1 = Person.class;
        System.out.println(clazz1);

        //Method 2
        Person p1 = new Person();
        Class<?> clazz2 = p1.getClass();
        System.out.println(clazz2);

        //Method 3
        Class clazz3 = Class.forName("com.exercises.reflection.Person");
        System.out.println(clazz3);
    }
}
