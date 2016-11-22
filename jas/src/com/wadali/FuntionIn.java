package com.wadali;

public class FuntionIn {

	
	
	public static void main(String[] args) {
		NestedOne nestedOne= new NestedOne() {
			
			@Override
			void methodOne(String value) {
				// TODO Auto-generated method stub
				System.out.println("Result = "+ value);
				
			}
		};
		nestedOne.hello("jaswnider");
	}
	
	
static    abstract	class NestedOne{
	
	String xman=null;
	  void hello(String xman){
		  this.xman=xman;
		  methodOne(xman);
		}
		
		abstract void methodOne(String xman);
	}
}
