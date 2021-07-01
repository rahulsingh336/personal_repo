package random;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPath {

	private static final Pattern WINDOWS_PATH = Pattern.compile("[a-zA-Z]:[/\\\\][^/\\\\].*");
	private static final Pattern URL_PATTERN = Pattern.compile("([a-zA-Z0-9]+):[/]+([^/].*)");
  public static void main(String[] args) {
  	String fileLocation = "s3://throttle_config/user-manager/dev/throttleconfig.properties";
  	//String fileLocation = "s3://production-s3secureconfigbucket-s0c8rjw1s0/application.properties";
    System.out.println(getUrlWithoutProtocol(fileLocation));
    fileLocation = getUrlWithoutProtocol(fileLocation);
	  if (fileLocation.startsWith("//")) {
		  fileLocation = fileLocation.substring(2);
	  } else if (fileLocation.startsWith("/")) {
		  fileLocation = fileLocation.substring(1);
	  }
	  	  String bucket = fileLocation.substring(0, fileLocation.indexOf("/"));
		  String fileName = fileLocation.substring(fileLocation.indexOf("/") + 1);
		  //return new S3FilePointer(bucket, fileName);
	  	System.out.println(bucket +"  --  "+ fileName);

  }

	public static String getUrlWithoutProtocol(String url) {

		//normalize slashes to forward-slashes
		url = url.replaceAll(Pattern.quote("\\"),"/");

		if (WINDOWS_PATH.matcher(url).matches()) {
			return url;
		}

		String noProtocolUrl = (getUrlMatchingGroup(url,2));
		if (noProtocolUrl == null) {
			return url;
		} else {
			if (!noProtocolUrl.startsWith("/") &&
					(!WINDOWS_PATH.matcher(noProtocolUrl).matches())) {
				noProtocolUrl = "/" + noProtocolUrl;
			}
			return noProtocolUrl;
		}
	}

	private static String getUrlMatchingGroup(String url, int captureGroup) {
		Matcher m = URL_PATTERN.matcher(url);
		if (m.matches() && (captureGroup <= m.groupCount())) {
			return m.group(captureGroup);
		} else {
			return null;
		}
	}

}
