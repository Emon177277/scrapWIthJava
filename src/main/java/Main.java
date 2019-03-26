import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Main {
    public static void main(String [] args) throws Exception{
        Document document = Jsoup.connect("https://hitosara.com/lst/").get();

        for(Element element:document.select("ul.card li.card__item article div.card-top-wrap a.card-top figure.card-img-shop div.card-shop figcaption")){

            System.out.println(element.getElementsByClass("card-shop__name").text());

        }
    }
}
