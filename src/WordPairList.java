import java.util.ArrayList;

public class WordPairList {

    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words)
    {
        allPairs = new ArrayList<WordPair>();
        for(int i=0; i<words.length;i++) {
            for (int j = i + 1; j < words.length; j++) {
                WordPair x = new WordPair(words[i], words[j]);
                allPairs.add(x);

            }
        }
    }

    public int numMatches()
    {
        int ans=0;
        for(WordPair e : allPairs)
            if(e.getFirst().equals(e.getSecond())) ans++;
        return ans;
    }

    public ArrayList<WordPair> getAllPairs(){
        return allPairs;
    }
}