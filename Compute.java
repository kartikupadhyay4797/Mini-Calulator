package com.example.calculatorforinternship;

public class Compute {
    int result;
    String data;

    public Compute(String data, int result) {
        this.data=data;
        this.result=result;
    }

    public int compute(int temp){
        if (temp<data.length()){
            try {
                if (temp==(data.length()-1))
                    return (int) Integer.parseInt(String.valueOf(data.charAt(temp)));
                switch (data.charAt(temp)) {
                    case '+':
                        return result + compute(temp + 1);
                    case '-':
                        return result - compute(temp + 1);
                    case 'x':
                        return result * compute(temp + 1);
                    case '/':
                        return result/ compute(temp + 1);
                    default:
                        return Integer.parseInt(String.valueOf(data.charAt(temp)));
                }
            } catch (Exception e) {
            }
        }
        return (int) Integer.parseInt(String.valueOf(data.charAt(temp)));

    }
}
