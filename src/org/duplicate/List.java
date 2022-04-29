package org.duplicate;

import java.util.ArrayList;

public class List {
	public static void main(String[]args) {
     ArrayList li = new ArrayList();
     li.add(10); //0
     li.add("java");//1
     li.add('A');//2
     li.add(786688967899l);//3
     li.add('A');//4
     li.add("java");//5
     System.out.println(li);
     int size = li.size();
     System.out.println(size);
     Object Object = li.get(1);
     System.out.println(Object);
    Object Object1= li.get(2);
    System.out.println(Object1);
    Object Object2=li.get(4);
    System.out.println(Object2);
    Object Object3=li.get(5);
    System.out.println(Object3);
     
}
}
