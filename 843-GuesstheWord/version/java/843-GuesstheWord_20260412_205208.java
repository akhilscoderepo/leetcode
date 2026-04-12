// Last updated: 12/04/2026, 20:52:08
import java.util.*;

class Solution {

    public void findSecretWord(String[] wordlist, Master master) {
        List<String> candidates = new ArrayList<>(Arrays.asList(wordlist));
        Random rand = new Random();

        while (!candidates.isEmpty()) {
            // Random pick
            String guessWord = candidates.get(rand.nextInt(candidates.size()));
            int matches = master.guess(guessWord);

            if (matches == 6) return; // Found the secret

            // Filter candidates with same match count
            List<String> newCandidates = new ArrayList<>();
            for (String word : candidates) {
                if (matchCount(guessWord, word) == matches) {
                    newCandidates.add(word);
                }
            }
            candidates = newCandidates;
        }
    }

    // Count how many letters match in exact position
    private int matchCount(String a, String b) {
        int count = 0;
        for (int i = 0; i < 6; i++) {
            if (a.charAt(i) == b.charAt(i)) count++;
        }
        return count;
    }
}