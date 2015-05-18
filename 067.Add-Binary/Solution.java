public class Solution {
    public String addBinary(String a, String b) {
        int l1 = a.length();
        int l2 = b.length();
        char c = '0';
        StringBuilder sb = new StringBuilder();
        while(l1 > 0 || l2 > 0){
            char c1 = '0';
            char c2 = '0';
            if(l1 > 0){
                c1 = a.charAt(l1-1);
            }
            if(l2 > 0){
                c2 = b.charAt(l2-1);
            }
            if(c == '0'){
                if((c1 == '0' && c2 == '0')){
                    sb.append('0');
                    c = '0';
                }
                else if((c1 == '1' && c2 == '0') || (c1 == '0' && c2 == '1')){
                    sb.append('1');
                    c = '0';
                }
                else if((c1 == '1' && c2 == '1')){
                    sb.append('0');
                    c = '1';
                }
            }
            else{
                if((c1 == '0' && c2 == '0')){
                    sb.append('1');
                    c = '0';
                }
                else if((c1 == '1' && c2 == '0') || (c1 == '0' && c2 == '1')){
                    sb.append('0');
                    c = '1';
                }
                else if((c1 == '1' && c2 == '1')){
                    sb.append('1');
                    c = '1';
                }
            }
            if(l1 > 0){
                l1--;
            }
            if(l2 > 0){
                l2--;
            }
        }
        if (c == '1'){
        	sb.append('1');
        }
        String op = sb.reverse().toString();
        return op;
    }
}
