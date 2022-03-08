import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.DomSerializer;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import xPath.ParseSiteByXPath;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, ParserConfigurationException, XPathExpressionException {

        String expression = "//*[@id=\"content\"]/div/div[1]/div/div[4]/div/ul/li[1]/div/div/div[2]/div[3]";


        ParseSiteByXPath coffee = new ParseSiteByXPath("https://www.domcoffee.ru/");


        System.out.println(coffee.getDataByExpression(expression));


    }
}
