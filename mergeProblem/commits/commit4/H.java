class H extends D {
  public H() {
    p19 = 0;
    p13 = 7;
    p40 = 1;
    p26 = 2;
  }
  public void p24() {
    System.out.println("метод p24 в классе H");
    System.out.println(p3);
  }
  public void p15() {
    System.out.println("метод p15 в классе H");
    System.out.println(++p19);
  }
  public void p6() {
    System.out.println("метод p6 в классе H");
    System.out.println(p26);
  }
  public void p17() {
    System.out.println("метод p17 в классе H");
    System.out.println(p40 >> 1);
  }
  public static void p29() {
    System.out.println("метод p29 в классе H");
    System.out.println(p30++);
  }
  public static void p5() {
    System.out.println("метод p5 в классе H");
    System.out.println(p7);
  }
  public static void p11() {
    System.out.println("метод p11 в классе H");
    System.out.println((p7 - 3));
  }
  public static void p4() {
    System.out.println("метод p4 в классе H");
    System.out.println(p7);
  }
  public void p16(D r) {
    r.p6();
  }
  public void p16(H r) {
    r.p17();
  }
}
