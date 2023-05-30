package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        StringBuilder phraseBuilder = new StringBuilder();

        for (char ch : chars) {
            phraseBuilder.append(ch);
        }

        String phrase = phraseBuilder.toString();
        System.out.print(phrase);
    }
}
