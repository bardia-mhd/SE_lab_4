package parser;

import codeGenerator.CodeGeneratorFacade;
import scanner.lexicalAnalyzer;
import scanner.token.Token;

public class ParserFacade {

    private scanner.lexicalAnalyzer lexicalAnalyzer;
    private CodeGeneratorFacade cgf;

    public ParserFacade() {
        this.cgf = new CodeGeneratorFacade();
    }

    void semanticFunction(int semanticAction, Token lookAhead){
        cgf.semanticFunction(semanticAction, lookAhead);
    }

    void reportMemory(){
        cgf.printMemory();
    }

    Token getNextToken(java.util.Scanner sc){
        lexicalAnalyzer = new lexicalAnalyzer(sc);
        return lexicalAnalyzer.getNextToken();
    }

    Token getNextToken(){
        return lexicalAnalyzer.getNextToken();
    }

}