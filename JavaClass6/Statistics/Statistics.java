public class Statistics {
    private static int getIngWords(String[] strs){
        int count=0;
        for(int i=0;i<strs.length;i++){
            if(strs[i].contains("ing")){
                count++;
            }
        }
        return count;
    }
    private static int getAndCounts(String[] strs){
        int count=0;
        for(int i=0;i<strs.length;i++){
            if(strs[i].compareTo("and")==0){
                count++;
            }
        }
        return count;
    }
    private static int getWordCounts(String[] strs){
        return strs.length;
    }
    public static void Statistic(String str){
        String[] strs = str.split(" ");
        int ingWords = getIngWords(strs);
        int andCounts = getAndCounts(strs);
        int wordCounts = getWordCounts(strs);
        System.out.println("本文的单词个数为"+wordCounts);
        System.out.println("本文的and个数为"+andCounts);
        System.out.println("本文含ing单词个数为"+ingWords);
    }
}
