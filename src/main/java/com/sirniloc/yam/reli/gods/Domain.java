package com.sirniloc.yam.reli.gods;

public class Domain {
	private String name;
	private Alignment alignment;
	
	public Domain(String n, Alignment a) {
		this.setName(n);
		this.setAlignment(a);
	}
	
	public static Alignment getAlignment(Domain[] domains) {
		int min=255,max=-255;
		for(Domain d : domains) {
			if(d.getAlignment().getMin()<min)min=d.getAlignment().getMin();
			if(d.getAlignment().getMax()>max)max=d.getAlignment().getMax();
		}
		return new Alignment("", min, max);		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Alignment getAlignment() {
		return alignment;
	}

	public void setAlignment(Alignment alignment) {
		this.alignment = alignment;
	}
}
