package test.com.imooc.beanannotation; 

import com.imooc.beanannotation.BeanAnnotation;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import test.com.imooc.base.UnitTestBase;

/** 
* BeanAnnotation Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 24, 2018</pre> 
* @version 1.0 
*/ 
public class BeanAnnotationTest extends UnitTestBase{

    public BeanAnnotationTest(){
        super("classpath:spring-beanannotation.xml");
    }

    @Test
    public void testSay(){
        BeanAnnotation beanAnnotation = super.getBean("beanAnnotation");
        beanAnnotation.say("This is test");

//        beanAnnotation = super.getBean("bean");
//        beanAnnotation.say("This is test");
    }

    @Test
    public void testScope(){
        BeanAnnotation beanAnnotation = super.getBean("beanAnnotation");
        beanAnnotation.myHashCode();

        beanAnnotation = super.getBean("beanAnnotation");
        beanAnnotation.myHashCode();
    }

} 
