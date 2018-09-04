package test.com.imooc.beanannotation.jsr; 

import com.imooc.beanannotation.jsr.JsrService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import test.com.imooc.base.UnitTestBase;

/** 
* JsrService Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 4, 2018</pre> 
* @version 1.0 
*/ 
public class JsrTest extends UnitTestBase {

    public JsrTest() {
        super("classpath*:spring-beanannotation.xml");
    }

    /**
* 
* Method: save() 
* 
*/ 
@Test
public void testSave() throws Exception { 
//TODO: Test goes here...
    JsrService service = super.getBean("jsrService");
    service.save();
} 


} 
