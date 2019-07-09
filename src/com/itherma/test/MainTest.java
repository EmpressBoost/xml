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

			//要想使用Xpath，还得添加jar，获取的是第一个只返回一个
			Element namElement = (Element) rootElement.selectSingleNode("//name");
//			System.out.println(namElement.getText());
			
			//获取文档里所有的元素
			List<Element> selectNodes = rootElement.selectNodes("//name");
			for (Element element : selectNodes) {
				System.out.println(element.getText());
			}
			
		} catch (DocumentException e) {
			e.printStackTrace();
		} finally {
		}
		
	}

}
