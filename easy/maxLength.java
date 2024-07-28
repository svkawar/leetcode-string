class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxLenght = 0;
        for(String str : sentences) {
            maxLenght = Math.max(maxLenght, str.split(" ").length);
        }
        return maxLenght;
    }
}
