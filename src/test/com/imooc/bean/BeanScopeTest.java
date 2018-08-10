package test.com.imooc.bean; 

import com.imooc.bean.BeanScope;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import test.com.imooc.base.UnitTestBase;

/** 
* BeanScope Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 21, 2018</pre> 
* @version 1.0 
*/ 
public class BeanScopeTest extends UnitTestBase{

    public BeanScopeTest(){
        super("resources/spring-beanscope.xml");
    }

@Test
public void testSay() throws Exception {
//TODO: Test goes here...
    BeanScope beanScope = super.getBean("beanScope");
    beanScope.say();

    BeanScope beanScope2 = super.getBean("beanScope");
    beanScope2.say();
}

    @Test
    public void testSay2() throws Exception {
//TODO: Test goes here...
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();
    }

} 
