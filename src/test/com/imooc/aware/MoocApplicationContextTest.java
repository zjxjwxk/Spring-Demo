package test.com.imooc.aware; 

import com.imooc.aware.MoocApplicationContext;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import test.com.imooc.base.UnitTestBase;

/** 
* MoocApplicationContext Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 21, 2018</pre> 
* @version 1.0 
*/ 
public class MoocApplicationContextTest extends UnitTestBase{

    public MoocApplicationContextTest(){
        super("resources/spring-aware.xml");
    }
/** 
* 
* Method: setApplicationContext(ApplicationContext applicationContext) 
* 
*/ 
@Test
public void testSetApplicationContext() throws Exception {
//TODO: Test goes here...
    System.out.println("testSetApplicationContext:" + super.getBean("moocApplicationContext").hashCode());
}



} 
