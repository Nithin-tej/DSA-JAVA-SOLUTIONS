class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for (String sentence : sentences) {
            int spaces = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    spaces++;
                }
            }
            int words = spaces + 1;
            if (words > maxWords) {
                maxWords = words;
            }
        }

        return maxWords;
    }
}