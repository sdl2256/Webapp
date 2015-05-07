package com.sundl.entity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Sun on 2015/5/7.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestApp extends AbstractJUnit4SpringContextTests {

    @Resource
    private App app;

    @Test
    public void testApp() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        App app = (App) context.getBean("app");
        System.out.println(app.getPerson().getName());
        System.out.println(app.getPerson().getAge());
        Assert.assertNotNull(app);
        Assert.assertNotNull(app.getPerson());
    }

    @Test
    public void testApp2() throws Exception {
        System.out.println("使用AbstractJUnit4SpringContextTests");
        System.out.println(app.getPerson().getName());
        System.out.println(app.getPerson().getAge());
        Assert.assertNotNull(app);
        Assert.assertNotNull(app.getPerson());

    }
}
