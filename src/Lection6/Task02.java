package Lection6;


import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bondar on 4/10/2015.
 * Написать метод  getInfo(), который парсит документ и достает из него нужную информацию
 (name, age, job использовать как параметры).
 */
//info can be found here http://stackoverflow.com/questions/5059224/which-is-the-best-library-for-xml-parsing-in-java
public class Task02 {
    public static void main(String[] args) {
        String inputFile = "D:\\parseJava.xml";
        getInfo(inputFile, "name");

        inputFile = "D:\\config.xml";
        getInfo(inputFile, "login");
        getInfo(inputFile, "envmain");
    }


    public static List<String> getXMLInfoByXPath(String inputFile, String strXPath){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setIgnoringElementContentWhitespace(true);
        //Here we will store mapped data from required tags
        List<String> arrStrings = new ArrayList<>();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            File file = new File(inputFile);
            Document doc = builder.parse(file);
            XPath xPath =  XPathFactory.newInstance().newXPath();
            //list of elements with input tag is created
            NodeList nodeList = (NodeList) xPath.compile(strXPath).evaluate(doc, XPathConstants.NODESET);
            for (int i = 0; i < nodeList.getLength(); i++) {
                //add element to arrayList of Names
                String addedValue = nodeList.item(i).getFirstChild().getNodeValue();
                arrStrings.add(addedValue);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrStrings;
    }

    public static void getInfo(String inputFile, String tag){
        String xPath = "//" + tag;
        System.out.println(getXMLInfoByXPath(inputFile, xPath));
    }
}
