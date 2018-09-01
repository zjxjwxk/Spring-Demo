package test.com.imooc.beanannotation.javabased; 

import com.imooc.beanannotation.javabased.MyDriverManager;
import com.imooc.beanannotation.javabased.Store;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import test.com.imooc.base.UnitTestBase;

/** 
* StringStore Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 31, 2018</pre> 
* @version 1.0 
*/ 
public class StoreTest extends UnitTestBase {

    public StoreTest() {
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void test() {
        Store store = super.getBean("stringStore");
        System.out.println(store.getClass().getName());
    }

    @Test
    public void testMyDriverManager() {
        MyDriverManager manager = super.getBean("myDriverManager");
        System.out.println(manager.getClass().getName());
    }

    @Test
    public void testScope() {
        Store store = super.getBean("stringStore");
        System.out.println(store.hashCode());

        store = super.getBean("stringStore");
        System.out.println(store.hashCode());
    }

    @Test
    public void testG() {
        Store store = super.getBean("stringStoreTest");
    }
} 
