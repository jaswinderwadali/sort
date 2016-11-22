package com.wadali;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
	
	
	
	private void test(){
		List<ModelOne> list= new ArrayList<>();
		for (int i = 0,j=0; i < 20; i++,j++,j++) {
			ModelOne modelOne= new  ModelOne();
			modelOne.setCount(i);
			modelOne.setNewCounter(j);
			list.add(modelOne);			
			list.stream().forEach(System.out::println);
		}
		
	
		Collections.sort(list, (o1, o2) -> o2.getCount()-o1.getCount());
		list.forEach((data)->System.out.println(data.getCount()+""));

		
		
		
//		Hello jas= (message, jasss) -> {		};
//		Hello one =(message,jass)->System.out.println(message+jas);
	}
	
	
	
	class ModelOne{
		String jas,hello;
		int count;
		int newCounter;
		public String getJas() {
			return jas;
		}
		public void setJas(String jas) {
			this.jas = jas;
		}
		public String getHello() {
			return hello;
		}
		public void setHello(String hello) {
			this.hello = hello;
		}
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		public int getNewCounter() {
			return newCounter;
		}
		public void setNewCounter(int newCounter) {
			this.newCounter = newCounter;
		} 
		
	}

	
	public static void main(String[] args) {
		new MainClass().test();
	}
	
	interface Hello{
	      void sayMessage(String message,String jas);
	      void hello();
	}

}
