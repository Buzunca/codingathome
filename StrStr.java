class StrStr {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        
        if (haystack.equals(needle) || n == 0) {
            return 0;
        }
        
        for (int i = 0; i <= haystack.length() - n; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, i + n).equals(needle)) {
                    return i;
                }
            }
        }
        
        return -1;
    }
}