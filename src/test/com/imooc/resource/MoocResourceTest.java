package test.com.imooc.resource; 

import com.imooc.resource.MoocResource;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import test.com.imooc.base.UnitTestBase;

import java.io.IOException;

/** 
* MoocResource Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 23, 2018</pre> 
* @version 1.0 
*/ 
public class MoocResourceTest extends UnitTestBase{

    public MoocResourceTest(){
        super("classpath:spring-resource.xml");
    }

/** 
* 
* Method: resource() 
* 
*/ 
@Test
public void testResource(){
//TODO: Test goes here...
    MoocResource resource = super.getBean("moocResource");
    try {
        resource.resource();
    } catch (IOException e) {
        e.printStackTrace();
    }
} 


} 
