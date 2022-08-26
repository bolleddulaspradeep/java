public class StringManupulations {
    String reverse(String input, boolean toLowerCase) {
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + (toLowerCase ? input.toLowerCase().charAt(i) : input.charAt(i));
        }
        return output;
    }

    char[] convertToSingleWord(String[] input) {
        String convertedString = "";
        for (int i = 0; i < input.length; i++) {
            convertedString = convertedString + input[i];
        }
        return convertedString.trim().toCharArray();
    }

    String joinString(char[] input) {
        String value = "";
        for (int i = 0; i < input.length; i++) {
            value = value + input[i];
        }
        return value.trim();
    }

    char[] sortAnArray(char[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] > input[j]) {
                    char temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }

    boolean checkTheAnagram(char[] firstWord, char[] secondWord) {
        for (int i = 0; i < firstWord.length; i++) {
            if (firstWord[i] != secondWord[i]) {
                return false;
            }
        }
        return true;
    }

    boolean[] fillElementsInArray(int length) {
        boolean isBool[] = new boolean[length];
        System.out.println(isBool.length);
        for (int i = 0; i < isBool.length; i++) {
            isBool[i] = false;
        }
        return isBool;
    }

    boolean checkTheArrayElementsAreValid(boolean[] isBol) {
        for (int i = 0; i < isBol.length; i++) {
            if (!isBol[i]) {
                return false;
            }
        }
        return true;
    }

}
