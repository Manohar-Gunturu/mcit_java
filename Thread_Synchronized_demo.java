package class_five;

class Counter {
    public long count = 0;
}

class UseCounter extends Thread {    
	Counter c;
    public UseCounter(Counter c) {
		this.c = c;
	}
	public void increment() {	
        synchronized(c) {
		  c.count++; 
		  System.out.print(c.count + " ");
        }
        
    }    
    public void run() {
        increment();
        increment();
        increment();
    }    
}

public class Demo4 {
    public static void main(String[] args) {
    	Counter c = new Counter();
        Thread t1 = new UseCounter(c);
        Thread t2 = new UseCounter(c);
        Thread t3 = new UseCounter(c);
        t1.start();
        t2.start();
        t3.start();
    }
}