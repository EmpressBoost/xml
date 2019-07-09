package com.itherma.test;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class MainTest {

	public static void main(String[] args) {
		try {
			//1.创建sax读取对象
			SAXReader reader = new SAXReader();
			//2.指定解析的xml源
			Document document = reader.read(new File("src/xml/stus.xml"));
			//3.获得元素
			Element rootElement = document.getRootElement();
			
//			System.out.println(rootElement.element("stu").getName());
			
//			System.out.println(rootElement.element("stu").element("age").getStringValue());
//			System.out.println(rootElement.element("stu").element("age").getText());
			
			
			List<Element> elements = rootElement.elements();
//			System.out.println(elements.size());
			for(Element element:elements) {
//				System.out.println(element.getName());
				String name = element.element("name").getText();
				String age = element.element("age").getText();
				String address = element.element("address").getText();
				System.out.println("name" + name + " age" + age + " address" + address);
			}
			
			
		} catch (DocumentException e) {
			e.printStackTrace();
		} finally {
		}
		
	}

}
