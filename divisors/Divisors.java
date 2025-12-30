import java.util.ArrayList;
import java.util.List;

class Divisors {
    public static void print_divisors(int n) {
        // code here
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();
        
        for(int i=1; i * i <= n; i++){
            if(n % i == 0){
                res1.add(i);
                
                if(n/i != i){
                    res2.add(n/i);
                }
            }
            
        }
        
        for(int i: res1) System.out.print(i + " ");
        for(int i= res2.size()-1; i>=0; i--){
            System.out.print(res2.get(i) + " ");
        }
    }
}
