import java.util.ArrayList;

public class Recursividade5 {
    private static ArrayList<Integer> f = new ArrayList<>();
    //fibonacci
    public static void main(String[] args){
        fibo(8);
        f.add(0, 1);
        f.add(1, 1);
        System.out.println(f);
    }
    private static int fibo(int posicao){
        if(posicao > 0){
           // if(posicao == (posicao - 1) + (posicao - 2)) System.out.print(posicao);
            int r = (fibo(posicao - 1))+ (fibo(posicao - 2));
            if(!f.contains(r)){
                f.add(r);
            }
                return r;
        }
        return 1;
    }
}
