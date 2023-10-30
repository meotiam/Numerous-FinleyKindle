public class NumeralTranslator {
    public static String numeralTranslator(int num){
        int[] numbers = {1000,
                900,500,400,100,
                90,50,40,10,
                9,5,4,1};
        String[] romanNumerals={"M","CM",
                "D","CD","C","XC",
                "L","XL","X","IX",
                "V","IV","I"};
        StringBuilder converted = new StringBuilder();
        for (int i=0; i<numbers.length;i++){
            while (num>=numbers[i]){
                num=num-numbers[i];
                converted.append(romanNumerals[i]);
            }
        }
        return converted.toString();
    }
}
