package test.com.imooc.aop.schema.advisors; 

import com.imooc.aop.schema.advice.Fit;
import com.imooc.aop.schema.advice.biz.AspectBiz;
import com.imooc.aop.schema.advisors.service.InvokeService;
import org.junit.Test;
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
        super("classpath:spring-aop-schema-advisors.xml");
    }

    @Test
    public void testSave() {
        InvokeService service = super.getBean("invokeService");
        service.invoke();

        System.out.println();
        service.invokeException();
    }

} 
