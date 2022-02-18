package com.cdac.core;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

public class TestStudent {

	public TestStudent() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("applicationContext.xml");
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    Student student=(Student)factory.getBean("studentbean");  
	    student.displayInfo();  
		
	}

}
