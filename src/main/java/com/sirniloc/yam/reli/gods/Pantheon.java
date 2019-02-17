package com.sirniloc.yam.reli.gods;

public class Pantheon {
	
	public static final Alignment[] ALIGNMENTS = {
			new Alignment("Pure", 155, 255),
			new Alignment("Good", 55, 155),
			new Alignment("Neutral", -55, 55),
			new Alignment("Bad", -155, -55),
			new Alignment("Evil", -255, -155)
	};
	
	public static final Domain[] DOMAINS = {
			new Domain("Life", ALIGNMENTS[0]),
			new Domain("Change", ALIGNMENTS[1]),
			new Domain("War", ALIGNMENTS[2]),
			new Domain("Suffering", ALIGNMENTS[3]),
			new Domain("Death", ALIGNMENTS[4])
			};

	public static final God[] GODS = {
			new God("Maz", new Domain[] {DOMAINS[3],DOMAINS[4]}, "Many vampires follow this divine.") ,
			new God("Diana", new Domain[] {DOMAINS[1],DOMAINS[2]}, "It is said her most devote practice lycanthropy."),
			new God("Koren", new Domain[] {DOMAINS[0]}, "The most common practice of the land, the path of life.") 
			};
	
	
	
	
}
