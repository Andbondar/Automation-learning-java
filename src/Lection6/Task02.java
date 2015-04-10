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
import java.util.Arrays;

/**
 * Created by bondar on 4/10/2015.
 * Написать метод  getInfo(), который парсит документ и достает из него нужную информацию
 (name, age, job использовать как параметры).
 */
//info can be found here http://stackoverflow.com/questions/5059224/which-is-the-best-library-for-xml-parsing-in-java
public class Task02 {
    public static void main(String[] args) {
        String inputFile = "D:\\parseJava.xml";
        System.out.println(Arrays.toString(getXMLInfoByTag(inputFile, "name")));

        inputFile = "D:\\config.xml";
        System.out.println(Arrays.toString(getXMLInfoByTag(inputFile, "login")));
        System.out.println(Arrays.toString(getXMLInfoByTag(inputFile, "envmain")));
    }


    public static String[] getXMLInfoByTag(String inputFile, String tag){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setIgnoringElementContentWhitespace(true);
        //Here we will store mapped data from required tags
        ArrayList<String> arrStrings = new ArrayList<>();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            File file = new File(inputFile);
            Document doc = builder.parse(file);
            XPath xPath =  XPathFactory.newInstance().newXPath();
            String strXPath = "//" + tag;//search by one tag is made
            NodeList nodeList = (NodeList) xPath.compile(strXPath).evaluate(doc, XPathConstants.NODESET);//magic
            for (int i = 0; i < nodeList.getLength(); i++) {
                //add element to arrayList of Names
                String addedValue = nodeList.item(i).getFirstChild().getNodeValue();
                arrStrings.add(addedValue);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //create String[] array to be returned
        String[] stockArr = new String[arrStrings.size()];
        stockArr = arrStrings.toArray(stockArr);
        return stockArr;
    }
}
