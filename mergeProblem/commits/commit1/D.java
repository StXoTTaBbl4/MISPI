class D {
  int p3;
  int p19;
  int p13;
  int p40;
  int p26;
  long p20;
  long p35;
  long p12;
  int[] p37 = {-2, 3, -2, -3};
  int[] p38 = {3, -3, 0, 0};
  int[] p8 = {2, -3, 0, 2};
  static int p30;
  static int p7;
  static int p34;
  static int p10;
  static int p18;
  public D() {
    p3 = 9;
    p19 = 8;
    p13 = 1;
    p40 = 1;
    p26 = 3;
    p20 = 7L;
    p35 = 2L;
    p12 = 9L;
  }
  public void p24() {
    System.out.println("метод p24 в классе D");
    System.out.println((int)p35);
  }
  public void p15() {
    System.out.println("метод p15 в классе D");
    System.out.println(p3 >> 2);
  }
  public void p6() {
    System.out.println("метод p6 в классе D");
    System.out.println(p34++);
  }
  public void p17() {
    System.out.println("метод p17 в классе D");
    System.out.println(p13++);
  }
  public void p36() {
    System.out.println("метод p36 в классе D");
    System.out.println((int)p12);
  }
  public void p33() {
    System.out.println("метод p33 в классе D");
    System.out.println(p13 << 1);
  }
  public static void p29() {
    System.out.println("метод p29 в классе D");
    System.out.println(p10);
  }
  public static void p5() {
    System.out.println("метод p5 в классе D");
    System.out.println((p10 - 1));
  }
  public static void p11() {
    System.out.println("метод p11 в классе D");
    System.out.println(p18);
  }
  public static void p4() {
    System.out.println("метод p4 в классе D");
    System.out.println((p18 - 4));
  }
  public void p16(D r) {
    r.p24();
  }
  public void p16(H r) {
    r.p15();
  }
}
