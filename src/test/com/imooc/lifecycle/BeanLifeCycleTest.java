package test.com.imooc.lifecycle; 

import com.imooc.lifecycle.BeanLifeCycle;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import test.com.imooc.base.UnitTestBase;

/** 
* BeanLifeCycle Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 21, 2018</pre> 
* @version 1.0 
*/ 
public class BeanLifeCycleTest extends UnitTestBase{

    public BeanLifeCycleTest(){
        super("resources/spring-lifecycle.xml");
    }

    @Test
    public void test1(){
        super.getBean("beanLifeCycle");
    }
} 
