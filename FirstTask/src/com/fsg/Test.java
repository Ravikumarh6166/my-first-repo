package com.fsg;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {
	
 Resource res=new ClassPathResource("applicationContext.xml");
 BeanFactory factory=new XmlBeanFactory(res);
 Book b1=(Book)factory.getBean("b1");

 b1.display();
}
}
