// 一个简单的泛型类
class Point<T> {
  private T var;

  public T getVar() {
    return var;
  }

  public void setVar(T var) {
    this.var = var;
  }
}

// 多元泛型
class Notepad<K, V> {
  private K key; // 此变量的类型由外部决定
  private V value; // 此变量的类型由外部决定

  public K getKey() {
    return this.key;
  }

  public V getValue() {
    return this.value;
  }

  public void setKey(K key) {
    this.key = key;
  }

  public void setValue(V value) {
    this.value = value;
  }
}

public class GenericClass {
  public static void main(String[] args) {
    Point<String> p = new Point<String>();
    p.setVar("it");
    System.out.println(p.getVar().length());

    Notepad<String, Integer> t = null; // 定义两个泛型类型的对象
    t = new Notepad<String, Integer>(); // 里面的key为String，value为Integer
    t.setKey("汤姆"); // 设置第一个内容
    t.setValue(20); // 设置第二个内容
    System.out.print("姓名:" + t.getKey()); // 取得信息
    System.out.print("，年龄:" + t.getValue()); // 取得信息
  }
}
