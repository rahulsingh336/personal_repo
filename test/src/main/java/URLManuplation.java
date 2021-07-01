import com.google.common.net.InternetDomainName;

import java.net.MalformedURLException;
import java.net.URL;

public class URLManuplation {

  public static void main(String[] args) throws MalformedURLException {
	  String str = "https://na1.dev.nice-incontact.com";
	  URL url = new URL(str);
	  InternetDomainName name = InternetDomainName.from(url.getHost()).topPrivateDomain();
	  InternetDomainName namep = InternetDomainName.from(url.getHost());
    System.out.println(name.toString());
    System.out.println(namep.toString());
  }
}
