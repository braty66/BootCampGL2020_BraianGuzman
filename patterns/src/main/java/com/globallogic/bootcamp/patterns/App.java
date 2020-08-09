package com.globallogic.bootcamp.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Game residentEvil = new Game("Resident Evil");
    	Playstation p = new Playstation(residentEvil);
    	
    	p.askMygame();
    	Game newGame= new Game("Brawlhalla");
    	p.setGame(newGame);
    	p.askMygame();
    	Game newNull = new Game();
    	Playstation a = new Playstation(newNull);
    	a.askMygame();
    	
    	
    	
    }
}
