class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] present = new boolean[26];

        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                present[c - 'a'] = true;
            }
        }

        for (boolean b : present) {
            if (!b) {
                return false;
            }
        }

        return true;
    }
}