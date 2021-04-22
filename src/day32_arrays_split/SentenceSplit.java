package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[]words = sentence.split(" ");
        System.out.println("First word: " + words[0]);
        System.out.println("Second word: "+ words[1]);
        System.out.println("Third word: "+ words[2]);
        for (String w:words) {
            System.out.println(w);
        }

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] results = googleResult.split(" ");
        System.out.println("Count: " + results[1]);
        System.out.println("Seconds:" + results[3].replace("(",""));
        System.out.println("Seconds:" + results[3].substring(1));

    }
}
