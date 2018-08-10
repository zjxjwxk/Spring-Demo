package test.com.imooc.resource; 

import com.imooc.resource.MoocResource;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import test.com.imooc.base.UnitTestBase;

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
public void testResource() throws Exception { 
//TODO: Test goes here...
    MoocResource resource = super.getBean("moocResource");
    resource.resource();
} 


} 
