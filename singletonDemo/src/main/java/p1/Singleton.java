package p1;

/*
 * 单例模式
 * 
 * 
 * */

public class Singleton 
{
          private static Singleton instance;
          
          //同步锁对象
          private static Object lock=new Object();
          
          
          //构造器私有化，使实例化时只能在本类中进行，外部不可以new对象
          private Singleton()
          {
        	  
          }
          
          public static Singleton getInstance()
          {
        	  if(instance==null)
        	  {
        		  synchronized (lock)
        		  {
					   if(instance==null)
					   {
						   instance=new Singleton();
					   }
        			  
			      }
        	  }
        	  
        	  return instance;
          }
}
