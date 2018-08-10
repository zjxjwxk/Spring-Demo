package test.com.imooc.ioc.injection.service; 

import com.imooc.ioc.injection.service.InjectionService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import test.com.imooc.base.UnitTestBase;

/** 
* InjectionServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 21, 2018</pre> 
* @version 1.0 
*/ 
public class InjectionServiceImplTest extends UnitTestBase{

    public InjectionServiceImplTest(){
        super("resources/spring-injection.xml");
    }

/** 
* 
* Method: save(String arg) 
* 
*/ 
@Test
public void testSetter() throws Exception {
//TODO: Test goes here...
    InjectionService service = super.getBean("injectionService");
    service.save("这是要保存的数据");
} 

@Test
public void testCons(){
    InjectionService service = super.getBean("injectionService");
    service.save("这是要保存的数据");
}

} 
