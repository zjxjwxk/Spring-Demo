package test.com.imooc.autowiring; 

import com.imooc.autowiring.AutoWiringService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import test.com.imooc.base.UnitTestBase;

/** 
* AutoWiringService Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 23, 2018</pre> 
* @version 1.0 
*/ 
public class AutoWiringServiceTest extends UnitTestBase{

    public AutoWiringServiceTest(){
        super("resources/spring-autowiring.xml");
    }

    @Test
    public void testSay(){
        AutoWiringService service = super.getBean("autoWiringService");
        service.say("this is a test");
    }
} 
