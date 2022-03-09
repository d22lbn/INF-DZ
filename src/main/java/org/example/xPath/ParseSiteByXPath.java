package org.example.xPath;

import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.DomSerializer;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ParseSiteByXPath {
    String URL;
    Document doc;
    TagNode tagNode;
    XPath xpath;
    XPathExpression expr;
    NodeList nodeList;

    public ParseSiteByXPath(String URL) {
        this.URL = URL;
        init();
    }

    private void init() {
        try {
            tagNode = (new HtmlCleaner()).clean(new URL(URL));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            doc = new DomSerializer(new CleanerProperties()).createDOM(tagNode);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    public List<String> getItems(String expression) {
        xpath = XPathFactory.newInstance().newXPath();
        try {
            expr = xpath.compile(expression);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }

        try {
            nodeList = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }

        List<String> items = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            String s = nodeList.item(i).getTextContent().replaceAll("[\\s]{2,}", " ");
            if (s.charAt(0) == ' ') {
                s = s.substring(1);
            }
            items.add(s);
        }

        return items;
    }


    // этот код в main
    public void main() {
//        String URL = "https://www.domcoffee.ru/";
//        ParseSiteByXPath domCoffee = new ParseSiteByXPath(URL);
//
//        List<String> links = domCoffee.getItems("//div[contains(@class, 'catalog_item')]//div[contains(@class, 'image_wrapper_block')]//a//@href");
//        List<String> photos = domCoffee.getItems("//div[contains(@class, 'catalog_item')]//div[contains(@class, 'image_wrapper_block')]//a//img//@alt");
//        List<String> titles = domCoffee.getItems("//div[contains(@class, 'catalog_item')]//div[contains(@class, 'item_info')]//div[contains(@class, 'item-title')]");
//        List<String> cost = domCoffee.getItems("//div[contains(@class, 'catalog_item')]//div[contains(@class, 'item_info')]//div[contains(@class, 'cost')]");
//
//        for (int i = 0; i < links.size(); i++) {
//            System.out.println();
//            System.out.println("< -- " + (i + 1) + " -- >");
//            System.out.println("Ссылка: " + links.get(i));
//            System.out.println("На фото: " + photos.get(i));
//            System.out.println("Заголовок: " + titles.get(i));
//            System.out.println("Цена: " + cost.get(i));
//        }
    }
}
