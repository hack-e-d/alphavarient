package com.example.alphavarient.ConceptTester;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;

public class PatternCaseSensitivity {
    private String testString;
    private String regexPatternString;
    private Pattern regexPattern;
    private Matcher regexMatcher;

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    public String getRegexPatternString() {
        return regexPatternString;
    }

    public void setRegexPatternString(String regexPatternString) {
        this.regexPatternString = regexPatternString;
    }

    public Pattern getRegexPattern() {
        return regexPattern;
    }

    public void setRegexPattern(Pattern regexPattern) {
        this.regexPattern = regexPattern;
    }

    public Matcher getRegexMatcher() {
        return regexMatcher;
    }

    public void setRegexMatcher(Matcher regexMatcher) {
        this.regexMatcher = regexMatcher;
    }

    public PatternCaseSensitivity() {

    }

    public PatternCaseSensitivity(String testString, String regexPatternString) {
        this.setTestString(testString);
        this.setRegexPatternString(regexPatternString);
        this.setRegexPattern(Pattern.compile(this.getRegexPatternString(),CASE_INSENSITIVE));
        this.setRegexMatcher(this.getRegexPattern().matcher(this.testString));
    }

    public void printMatchedResults(Matcher matcher) {
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }

     public static void main(String a[]){
         PatternCaseSensitivity patternCaseSensitivity = new PatternCaseSensitivity("hello world World wORld worLD WORLD","world");
         patternCaseSensitivity.printMatchedResults(patternCaseSensitivity.getRegexMatcher());
     }


}
