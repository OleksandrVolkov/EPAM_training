package task_5.task_5_3.service;

import task_5.task_5_3.model.Dictionary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LexemProcessing {
    private List<String> lexems;

    public List<String> getLexems() {
        return lexems;
    }

    public void setLexems(List<String> lexems) {
        this.lexems = lexems;
    }

    private List<Character> signs=new ArrayList<>();

    public LexemProcessing(){
       lexems = new ArrayList<>();
        signs = Arrays.asList(new Character[]{
            ',','-','!','_','^','&','#','?','+'
        });
    }

    public void addLexem(String lexem){

    }
    public void processString(String string){
        String lexem= "";
        for(int i=0; i<string.length(); i++){
            if(i==string.length() - 1){
                if(signs.contains(string.charAt(i))) {
                    lexems.add(lexem);
                    lexems.add(string.charAt(i) + "");
                    lexem = "";
                    continue;
                }else {
                    lexems.add(lexem + string.charAt(i));
                }
            }
            if(string.charAt(i) == ' '){
                if(i>=0 || i<=string.length()){
                    if(string.charAt(i-1) != ' '){
                        lexems.add(lexem);
                        lexem = "";
                    }
                }
            }else{
                    if(signs.contains(string.charAt(i))) {
                        lexems.add(lexem);
                        lexems.add(string.charAt(i) + "");
                        lexem = "";
                        continue;
                    }
                    lexem += string.charAt(i);
            }
        }
    }


    public void displayLexems(){
        for(int i=0;i<lexems.size();i++){
            System.out.println(lexems.get(i));
        }
    }

    public void addWord(Dictionary dictionary, String rus, String en){
        dictionary.add(en, rus);
    }



}
