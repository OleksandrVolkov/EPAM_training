package projects.project_2.service;

import projects.project_2.model.PunctuationMark;
import projects.project_2.model.Sentence;
import projects.project_2.model.Word;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private ArrayList<Sentence> sentences = new ArrayList<>();
    private ArrayList<Word> words = new ArrayList<>();
    private ArrayList<Character> endMarks = PunctuationMark.getEndMarks();
    private ArrayList<Character> separatorMarks = PunctuationMark.getSeparatorMarks();
    private ArrayList<Word> uniqueWords = new ArrayList<>();


    public void processText(String string){
        String temp = "";

        int counter = 0;

        for(char ch: string.toCharArray()){
            if(ch == ' '||counter == string.length()-1){
                words.add(new Word(temp));
                temp = "";
            }
            if(separatorMarks.contains(ch))
                temp = "";
            if(endMarks.contains(ch)){
                words.add(new Word(temp));
                sentences.add(new Sentence(words));
                words = new ArrayList<>();
                temp = "";
            }
            else{
                temp += ch;
            }
            counter++;
        }

        processUniqueWords(sentences.get(0),sentences.subList(1,sentences.size()));
    }



    public ArrayList<Word> fixVals(ArrayList<Word> words){
        for(int i=0;i<words.size();i++)
            if (words.get(i).getWord().equals(" ") || words.get(i).getWord().equals(""))
                words.remove(i);

        for(int i =0;i<words.size();i++)
            words.set(i, new Word(words.get(i).getWord().trim()));

        return words;
    }


    public void processUniqueWords(Sentence firstSentence, List<Sentence> otherSentences){
        int counter = 0;

        firstSentence.setWords(fixVals(firstSentence.getWords()));
        for(Sentence sentence: otherSentences)
            fixVals(sentence.getWords());

        for(Word word: firstSentence.getWords()){

            for(Sentence otherSentence: otherSentences)
                for(Word wordOther: otherSentence.getWords())
                    if(wordOther.getWord().equalsIgnoreCase(word.getWord()))
                        counter++;


            if(counter == 0)
                uniqueWords.add(word);
            else
                counter = 0;
        }

    }


    public ArrayList<Word> processUniqueWords() {
        return uniqueWords;
    }

    public void setUniqueWords(ArrayList<Word> uniqueWords) {
        this.uniqueWords = uniqueWords;
    }

    public ArrayList<Word> getUniqueWords() {
        return uniqueWords;
    }
}
