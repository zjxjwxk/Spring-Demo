package test.com.imooc.aop.api; 

import com.imooc.aop.api.BizLogic;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import test.com.imooc.base.UnitTestBase;

/** 
* AOPAPI Tester.
* 
* @author <Authors name> 
* @since <pre>���� 8, 2018</pre> 
* @version 1.0 
*/ 
public class AOPAPITest extends UnitTestBase {

    public AOPAPITest() {
        super("classpath:spring-aop-api.xml");
    }

    /**
* 
* Method: save() 
* 
*/ 
@Test
public void testSave() throws Exception { 
//TODO: Test goes here...
    BizLogic logic = (BizLogic) super.getBean("bizLogicImpl");
    logic.save();
} 


} 
