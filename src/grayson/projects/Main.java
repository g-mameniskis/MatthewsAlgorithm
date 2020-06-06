package grayson.projects;

public class Main {

    public static void main(String[] args) {

        WordGenerator wordGenerator = new WordGenerator();
        wordGenerator.generateRandomWord(4);
//        System.out.println(wordGenerator.generateRandomWord(4));


        System.out.println(wordGenerator.printRandomWordArray(4));
    }
}
