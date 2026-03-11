import java.util.*;
class Solution{
    public List<Integer> selfDividingNumbers(int left,int right){
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++)
            if(check(i)) list.add(i);
        return list;
    }
    private boolean check(int n){
        int x=n;
        while(n>0){
            int d=n%10;
            if(d==0||x%d!=0) return false;
            n/=10;
        }
        return true;
    }
}