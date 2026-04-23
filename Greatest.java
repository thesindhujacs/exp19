public class Greatest{
  public static void main(String[] args){
    int a=10, b=12, c=15;
    if (a>=b && a>=c){
      System.out.println("A is Greatest");
    }
    else if (b>=a && b>=c){
      System.out.println("B is Greatest");
    }
    else{
      System.out.println("C is Greatest");
    }
  }
}
