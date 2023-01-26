// 简单的泛型接口
interface Info<T> {
  public T getVar();
}

class InfoImpl<T> implements Info<T> {
  private T var;

  public InfoImpl(T var) {
    this.setVar(var);
  }

  public void setVar(T var) {
    this.var = var;
  }

  public T getVar() {
    return this.var;
  }
}

public class GenericInterface {
  public static void main(String[] args) {
    Info<String> i = null; // 声明接口对象
    i = new InfoImpl<String>("汤姆"); // 通过子类实例化对象
    System.out.println(i.getVar());
  }
}
