class RomanToInt {
    public int romanToInt(String s) {
        int n = s.length();
        int curr = 0;
        int next = 0;
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            curr = value(s.charAt(i));
            next = (i + 1 < n) ? value(s.charAt(i + 1)) : 0;
            
            if (next > curr) {
                sum -= curr;
            }
            else {
                sum += curr;
            }
        }
        
        return sum;
    }
    
    private int value(char ch) {
        switch(ch) {
            
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
}