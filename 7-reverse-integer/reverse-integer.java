class Solution {
    public int reverse(int a) {
        long rev=0;
        while(a!=0){
            rev = rev*10 + a%10;
            a=a/10;
        }
        if (rev < -2147483648 || rev > 2147483647)
            return 0;
        return (int)rev;
    }
}