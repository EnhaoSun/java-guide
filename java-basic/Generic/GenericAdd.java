class GenericAdd {
  private static int add(int a, int b) {
    System.out.println(a + "+" + b + "=" + (a + b));
    return a + b;
  }

  private static float add(float a, float b) {
    System.out.println(a + "+" + b + "=" + (a + b));
    return a + b;
  }

  private static double add(double a, double b) {
    System.out.println(a + "+" + b + "=" + (a + b));
    return a + b;
  }

  private static <T extends Number> double genericAdd(T a, T b) {
    System.out.println(a + "+" + b + "=" + (a.doubleValue() + b.doubleValue()));
    return a.doubleValue() + b.doubleValue();
  }

  public static void main(String[] args) {
    System.out.println(add(1, 2));
    System.out.println(genericAdd(1.6, 1));
  }
}