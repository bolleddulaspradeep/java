public class App {
    public static void main(String[] args) {
        System.out.println("1. WAP to reverse a String");
        String input = "iNeuron";
        String output = new StringManupulations().reverse(input, false);
        System.out.println("Reverse a string O/P " + output);

        System.out.println("2. WAP to reverse a sentence while perserving the position of a string");

        try {
            System.out.println("Enter a String");
            String input1 = new ScannerClass().ScannerString();
            String words[] = input1.split("\\s", 0);
            String finalWord = "";
            for (int i = 0; i < words.length; i++) {
                finalWord = finalWord + new StringManupulations().reverse(words[i], true) + " ";
            }
            System.out.println(finalWord.trim());
        } catch (Exception e) {
            System.err.println("error occured");
        }
        System.out.println("3. WAP to check a string is anagram or not");
        try {
            System.out.println("Enter a First String");
            String input1 = new ScannerClass().ScannerString().toLowerCase();
            System.out.println("Enter a Second String");
            String input2 = new ScannerClass().ScannerString().toLowerCase();
            String words[] = input1.split("\\s", 0);
            String firstWord[] = String.join("", words).split("");
            String words2[] = input2.split("\\s", 0);
            String secondWord[] = String.join("", words2).split("");
            char firstWordChar[] = new StringManupulations().convertToSingleWord(firstWord);
            char[] firstWordSort = new StringManupulations().sortAnArray(firstWordChar);

            char secWordChar[] = new StringManupulations().convertToSingleWord(secondWord);
            char[] secWordSort = new StringManupulations().sortAnArray(secWordChar);

            if (firstWordSort.length > 0 && secWordSort.length > 0 && firstWordSort.length == secWordSort.length) {
                boolean isValidAnagram = new StringManupulations().checkTheAnagram(firstWordSort, secWordSort);
                if (isValidAnagram) {
                    System.out.println("Entered words are Anagram");
                } else {
                    System.out.println("Entered words are not Anagram");
                }
            } else {
                System.out.println("Entered words are not Anagram");
            }
        } catch (Exception e) {
            System.out.println("Error Occuered");
            System.exit(1);
        }

        System.out.println("4. WAP to check a string is pangram or not");

        try {
            System.out.println("Enter a String");
            String input1 = new ScannerClass().ScannerString();
            String words[] = input1.split("\\s", 0);
            String finalWord = String.join("", words).toLowerCase().trim();
            boolean isBol[] = new StringManupulations().fillElementsInArray(26);
            for (int i = 0; i < finalWord.length(); i++) {
                if (finalWord.charAt(i) >= 97 && finalWord.charAt(i) <= 122) {
                    int val = finalWord.charAt(i) - 'a';
                    isBol[val] = true;
                } else {
                    int val = finalWord.charAt(i) - 'a';
                    isBol[val] = false;
                }
            }

            boolean isValid = new StringManupulations().checkTheArrayElementsAreValid(isBol);
            if(isValid){
                System.out.println("Entered String is a Pangram");
            } else {
                System.out.println("Entered String is not a Pangram");
            }
        } catch (Exception e) {
            System.out.println("error occured in pangram"+ e);
            System.exit(1);
        }
        System.out.println("5. WAP to print repetedly occering charecters in a string");
        try {
            System.out.println("Enter a String");
            String input1 = new ScannerClass().ScannerString();
            String words[] = input1.split("\\s", 0);
            String word[] = String.join("", words).split("");
            String occrence = "";
            for (int i = 0; i < word.length; i++) {
                if (occrence.contains(word[i])) {
                    System.out.print(word[i] + " ");
                } else {
                    occrence = occrence + word[i];
                }
            }
            System.out.println();

        } catch (Exception e) {
            System.exit(1);
        }
        System.out.println("6. WAP to sort a string alphabetically");
        try {
            System.out.println("Enter a String");
            String sortString = new ScannerClass().ScannerString();
            String sortWords[] = sortString.split("\\s", 0);
            char[] convertToSingleWords = new StringManupulations().convertToSingleWord(sortWords);
            char[] sortingAlpha = new StringManupulations().sortAnArray(convertToSingleWords);
            String sortedVals = new StringManupulations().joinString(sortingAlpha);
            System.out.println("sortedString ===> " + sortedVals);
        } catch (Exception e) {
            System.err.println("error occured");
        }
        System.out.println("7. WAP to count the number of vowels and constants of a given string value");
        try {
            System.out.println("Enter a String to calculate no of vowels and constants");
            String vowCoString = new ScannerClass().ScannerString();
            String sortWords[] = vowCoString.split("\\s", 0);
            String word = String.join("", sortWords).toLowerCase();
            int isVowel = 0;
            int isConstants = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 97 || word.charAt(i) == 101 || word.charAt(i) == 105 ||
                        word.charAt(i) == 111
                        || word.charAt(i) == 117) {
                    isVowel = isVowel + 1;
                } else {
                    isConstants = isConstants + 1;
                }

            }
            System.err.println("No of vowels and constants are vowels == " + isVowel + " constants == " + isConstants);
        } catch (Exception e) {
            System.err.println("error occured");
        }

        System.out.println("8. WAP to count number of special charecters");
        try {
            System.out.println("Enter a String to count special chars");
            String sortString = new ScannerClass().ScannerString();
            String sortWords[] = sortString.split("\\s", 0);
            String word = String.join("", sortWords);
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if ((word.toLowerCase().charAt(i) < 97 && word.toLowerCase().charAt(i) > 122)
                        || (word.toLowerCase().charAt(i) < 48 && word.toLowerCase().charAt(i) > 57)) {
                    count = count + 1;
                }
            }
            System.out.println("The no of special charecters are " + count);
        } catch (Exception e) {
            System.err.println("error occured");
        }
    }
}
