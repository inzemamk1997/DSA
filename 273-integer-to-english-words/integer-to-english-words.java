class Solution {
    private final String[] belowTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                                          "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                                          "Seventeen", "Eighteen", "Nineteen"};
    private final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};


    public String numberToWords(int num) {
        if (num == 0) return "Zero";

        int i = 0;
        if(num < 20){
            return belowTwenty[num];
        }
        if(num < 100){
            return tens[num / 10] + (num % 10 != 0 ? " " + belowTwenty[num%10] : "");
        }
        if(num < 1000){
            return belowTwenty[num/100] + " Hundred" + (num%100 != 0 ? " " + numberToWords(num%100) : "");
        }
        if(num < 1000000){
            return numberToWords(num/1000) + " Thousand"+ (num%1000 != 0 ? " " + numberToWords(num%1000) : "");
        }
        if(num < 1000000000){
            return numberToWords(num/1000000) + " Million"+ (num%1000000 != 0 ? " " + numberToWords(num%1000000) : "");
        }
        
        return belowTwenty[num/1000000000] + " Billion"+ (num%1000000000 != 0 ? " " + numberToWords(num%1000000000) : "");
        
        
    }

   
}
