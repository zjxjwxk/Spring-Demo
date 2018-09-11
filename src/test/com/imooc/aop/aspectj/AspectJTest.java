package test.com.imooc.aop.aspectj;

import com.imooc.aop.aspectj.biz.MoocBiz;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import test.com.imooc.base.UnitTestBase;

/** 
* MoocBiz Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 10, 2018</pre> 
* @version 1.0 
*/ 
public class AspectJTest extends UnitTestBase {

    public AspectJTest() {
        super("classpath:spring-aop-aspectj.xml");
    }


@Test
public void test() throws Exception {
//TODO: Test goes here...

    MoocBiz biz = getBean("moocBiz");
    biz.save("This is test.");
}

} 
