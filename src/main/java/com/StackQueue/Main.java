package com.StackQueue;

public class Main <T> {

	public static void main(String args[]){
		//  stack implement use linked list

		System.out.println("Welcome to Stacks and Queues");

		//create object and give the push method value

		DataStructureStack<Integer> StacksandQueuesdemo = new DataStructureStack<Integer>();

		StacksandQueuesdemo.push(56);
		StacksandQueuesdemo.push(30);
		StacksandQueuesdemo.push(70);
		StacksandQueuesdemo.display();


		System.out.println("\nPeek Value "+StacksandQueuesdemo.peek());

		StacksandQueuesdemo.pop();
		StacksandQueuesdemo.pop();
		System.out.println("After Pop");
		StacksandQueuesdemo.display();


	}
}