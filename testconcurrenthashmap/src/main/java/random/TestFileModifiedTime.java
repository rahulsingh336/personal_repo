package random;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFileModifiedTime {

  public static final String MM_DD_YYYY_HH_MM_SS = "MM/dd/yyyy HH:mm:ss";

  public static void main(String[] args) {
    File f = new File("C:\\Project\\config\\test\\throttleprops.properties");
    System.out.println(f.lastModified());
    System.out.println(new Date(f.lastModified()));
    SimpleDateFormat sdf = new SimpleDateFormat(MM_DD_YYYY_HH_MM_SS);
    sdf.format(f.lastModified());
  }
}
