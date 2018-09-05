package test.com.imooc.aop.schema.advice; 

import com.imooc.aop.schema.advice.biz.AspectBiz;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import test.com.imooc.base.UnitTestBase;

/** 
* AspectBiz Tester.
* 
* @author <Authors name> 
* @since <pre>���� 5, 2018</pre> 
* @version 1.0 
*/ 
public class AOPSchemaAdviceTest extends UnitTestBase {

    public AOPSchemaAdviceTest() {
        super("classpath:spring-aop-schema-advice.xml");
    }

/**
* 
* Method: before() 
* 
*/ 
@Test
public void testBiz() throws Exception {
//TODO: Test goes here...
    AspectBiz biz = super.getBean("aspectBiz");
    biz.biz();
} 


} 
