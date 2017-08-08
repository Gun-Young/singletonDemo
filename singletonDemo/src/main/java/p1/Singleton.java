package p1;

/*
 * ����ģʽ
 * 
 * 
 * */

public class Singleton 
{
          private static Singleton instance;
          
          //ͬ��������
          private static Object lock=new Object();
          
          
          //������˽�л���ʹʵ����ʱֻ���ڱ����н��У��ⲿ������new����
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
