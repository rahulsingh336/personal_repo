package ikm;

public class C2 implements I2 {
  public static void main(String[] args) {
    System.out.println(I2.name);
    System.out.println(I2.s1+",");
    System.out.println(((I1)new C2()).name);
  }
}
