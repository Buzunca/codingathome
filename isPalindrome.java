class isPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        int last = 0;
        int reverse = 0;
        int n = x;
        
        while (x != 0) {
            last = x % 10;
            reverse = reverse * 10 + last;
            x /= 10;
        }
        
        return n == reverse;
    }
}