package Main;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class PrimitiveVersionOfConsumer {

	public static void main(String[] args) {   				 //here 10 is int while we have passed Integer as an argument
		Consumer<Integer> c= i->System.out.println(i*i);
		c.accept(10);
		
		IntConsumer c1 = i->System.out.println(i*i);  //LongConsumer , DoubleConsumer are other examples
		c1.accept(20);
	}

}
// if one is object type and other is primitve type then ObjIntConsumer ,ObjLongConsumer and objDoubleComsumer