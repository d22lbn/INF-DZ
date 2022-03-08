package xPath;

import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.DomSerializer;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.w3c.dom.Document;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ParseSiteByXPath {
    private URL url;
    private String html;

    public ParseSiteByXPath(String url) throws IOException {
        this.url = new URL(url);
        this.html = getPageByUrl();
    }

    public String getDataByExpression(String expression) throws ParserConfigurationException, XPathExpressionException {
        HtmlCleaner htmlCleaner = new HtmlCleaner();
        TagNode tagNode = htmlCleaner.clean(html);

        XPath xpath = XPathFactory.newInstance().newXPath();
        Document document = new DomSerializer(new CleanerProperties()).createDOM(tagNode);

        String str = (String) xpath.evaluate(expression, document, XPathConstants.STRING);
        return str;
    }

    private String getPageByUrl() throws IOException {
        URLConnection urlConnection = (HttpURLConnection) url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        StringBuilder result = new StringBuilder();
        String readLine;
        readLine = in.readLine();
        while (readLine != null) {
            result.append(readLine);

            readLine = in.readLine();
        }
        in.close();
        String s = result.toString();
        return s;
    }

}
