package test.com.imooc.beanannotation.injection.service; 

import com.imooc.beanannotation.injection.service.InjectionService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import test.com.imooc.base.UnitTestBase;

/** 
* InjectionServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 24, 2018</pre> 
* @version 1.0 
*/ 
public class InjectionServiceImplTest extends UnitTestBase{

    public InjectionServiceImplTest(){
        super("classpath:spring-beanannotation.xml");
    }

    @Test
    public void testAutowired(){
        InjectionService service = super.getBean("injectionServiceImpl");
        service.save("This is a autowired");
    }
} 
