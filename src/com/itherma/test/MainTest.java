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
			//1.����sax��ȡ����
			SAXReader reader = new SAXReader();
			//2.ָ��������xmlԴ
			Document document = reader.read(new File("src/xml/stus.xml"));
			//3.���Ԫ��
			Element rootElement = document.getRootElement();

			//Ҫ��ʹ��Xpath���������jar����ȡ���ǵ�һ��ֻ����һ��
			Element namElement = (Element) rootElement.selectSingleNode("//name");
//			System.out.println(namElement.getText());
			
			//��ȡ�ĵ������е�Ԫ��
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
