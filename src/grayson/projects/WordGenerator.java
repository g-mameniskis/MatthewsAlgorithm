package grayson.projects;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

// this class intends to generate random (correct or incorrect) words
// the algorithm states that the set size and number of elements in each set should be equal
// the result should be an NxN set of random words
// I will start by creating a multidimensional arraylist to store the generated words
// At the moment, I think an iterative process with a random number would work best

public class WordGenerator {

//    public WordGenerator(ArrayList<ArrayList<String>> randomWordArrayList) {
//        ArrayList<ArrayList<String>> randomWordArrayList = new ArrayList<ArrayList<String>>();
//    }

    private char[] lettersInAlphabet = { 'a','b','c','d',
                                 'e','f','g','h',
                                 'i','j','k','l',
                                 'm','n','o','p',
                                 'q','r','s','t',
                                 'u','v','w','x',
                                 'y','z' };

    public String generateRandomWord(int numberOfSetsAndElements) {
        StringBuilder generatedWord = new StringBuilder();
        for (int i = 0; i < numberOfSetsAndElements; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, lettersInAlphabet.length);
            generatedWord.append(lettersInAlphabet[randomNum]);
        }

        return generatedWord.toString();
    }

    public ArrayList<ArrayList<String>> addWordsToArrayList(int wordLength) {
        ArrayList<ArrayList<String>> randomWordArrayList = new ArrayList<ArrayList<String>>();
        randomWordArrayList.add(new ArrayList<String>());
        for (int i = 0; i < wordLength; i++) {
            randomWordArrayList.add(new ArrayList<String>());
//            randomWordArrayList.get(i);
            for (int j = 0; j < wordLength; j++) {
                randomWordArrayList.get(i).add(j, generateRandomWord(wordLength));
            }
        }

        return randomWordArrayList;
    }

    public StringBuilder printRandomWordArray(int size) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < addWordsToArrayList(size).size(); i++) {
                for (int j = 0; j < addWordsToArrayList(size).get(i).size(); j++) {
                    result.append(addWordsToArrayList(size).get(i).get(j));
                    result.append(" ");
                }
                result.append("\n");
            }

            return result;
    }
}
