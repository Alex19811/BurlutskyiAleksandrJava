package LabWork295.TestRegExp;



public class Main {
    public static void main(String[] args) {

        //String[]  userNameString  = { "VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345"  , "ToAd", "TomCat", ""};


        String[] tests = {"try it on me", "what about me, huh?", "my name is vasya. london is the capital of great-britain!"};
        for (String s : tests) {
            System.out.println(toUp(s));
        }
    }

    static String toUp(String s){
        char[] arr = s.toCharArray();
        boolean inWord = false;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] >= 97 && arr[i] <= 122) {
                if (inWord) {
                    continue;
                }
                arr[i] -= 32;
                inWord = true;
            } else {
                inWord = false;
            }
        }
        return new String(arr);
    }
}
//
//
//    }

//???????????
//    Этот метод должен возвращать true только в том случае, если значение
//    строки аргумента  начинаются с верхнего регистра, затем другие символы
//    в нижнем регистре и содержат только буквы.

//    public static String checkPersonWithRegExp () {
//    }
//}
