
//记忆化搜索，动态规划,滚动数组
public class LeetCode70 {
    public static void main(String[] args) {
    int n=3;
    LeetCode70 lc70=new LeetCode70();
        int i = lc70.climbStairs(n);
        System.out.println(i);
    }

    public int climbStairs(int n) {
        int p=0;
        int q=0;
        int sum=1;
        for (int i = 1; i <= n; i++) {
            p=q;
            q=sum;
           sum=p+q;
        }

    return sum;
    }
}
