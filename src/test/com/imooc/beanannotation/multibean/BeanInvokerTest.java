package test.com.imooc.beanannotation.multibean; 

import com.imooc.beanannotation.multibean.BeanInvoker;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import test.com.imooc.base.UnitTestBase;

/** 
* BeanInvoker Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 24, 2018</pre> 
* @version 1.0 
*/ 
public class BeanInvokerTest extends UnitTestBase{

    public BeanInvokerTest(){
        super("classpath:spring-beanannotation.xml");
    }
/** 
* 
* Method: say() 
* 
*/ 
@Test
public void testSay() throws Exception { 
//TODO: Test goes here...
    BeanInvoker invoker = super.getBean("beanInvoker");
    invoker.say();
} 


} 
