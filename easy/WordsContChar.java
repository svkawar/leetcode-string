// Find Words Containing Character
class WordsContChar {
    
    public List<Integer> findWordsContaining(String[] words, char x) {
        int i = 0;
        List<Integer> output = new ArrayList<>();
        for(String s : words) {
            if(s.indexOf(x) >= 0) {
                output.add(i);
            }
            i++;
        }
        return output;
    }
}
