package com.example.vocubulary;
/*
# this class stores word and it's meaning

 */
public class Word {
        private String meaning;
        private String vocabularyWord;

        public Word() {
        }

        public Word(String vocabularyWord2, String meaning2) {
            this.vocabularyWord = vocabularyWord2;
            this.meaning = meaning2;
        }

        public String getVocabularyWord() {
            return makeFirstWordCap();
        }

        public String getVocabularyMeaning() {
            return this.meaning.toLowerCase();
        }


        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Word{vocabularyWord='");
            sb.append(this.vocabularyWord);
            sb.append('\'');
            sb.append(", meaning='");
            sb.append(this.meaning);
            sb.append('\'');
            sb.append(", sentence='");
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
          //this method makes every word's first letter capital
        private String makeFirstWordCap() {
            String firstLetter = this.vocabularyWord.substring(0, 1).toUpperCase();
            String restLetters = this.vocabularyWord.substring(1).toLowerCase();
            StringBuilder sb = new StringBuilder();
            sb.append(firstLetter);
            sb.append(restLetters);
            return sb.toString();
        }








}
