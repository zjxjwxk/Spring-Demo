package test.com.imooc.aware; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import test.com.imooc.base.UnitTestBase;

/** 
* MoocBeanName Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 21, 2018</pre> 
* @version 1.0 
*/ 
public class MoocBeanNameTest extends UnitTestBase{

    public MoocBeanNameTest(){
        super("resources/spring-aware.xml");
    }
/** 
* 
* Method: setBeanName(String name) 
* 
*/
    @Test
    public void testMoocBeanName(){
        System.out.println("testMoocBeanName:" + super.getBean("moocBeanName").hashCode());
    }

} 
