public class fiboByUsingTabulationAlgo
{
  static int[] arr = new int[50]; 
  public static int fib(int n) {
    arr[n] = 0;
    arr[1] = 1;
    for(int i=2; i<=n; i++) {
      arr[i] = arr[i-1] + arr[i-2];
    }
    return arr[n];
  }
  public static void main(String[] args){
    System.out.println(fib(10));
  }
}
