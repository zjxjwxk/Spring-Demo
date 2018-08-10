package test.com.imooc.ioc.interfaces; 

import com.imooc.ioc.interfaces.OneInterface;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.com.imooc.base.UnitTestBase;

/** 
* OneInterfaceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 21, 2018</pre> 
* @version 1.0 
*/
@RunWith(BlockJUnit4ClassRunner.class)
public class OneInterfaceImplTest extends UnitTestBase{

    public OneInterfaceImplTest(){
        super("resources/spring-ioc.xml");
    }
/** 
* 
* Method: hello(String word) 
* 
*/ 
@Test
public void testHello() throws Exception { 
//TODO: Test goes here...
    OneInterface oneInterface = super.getBean("oneInterface");
    System.out.println(oneInterface.hello("我的输入参数"));
} 


} 
