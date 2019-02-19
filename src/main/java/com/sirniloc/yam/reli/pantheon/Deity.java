package com.sirniloc.yam.reli.pantheon;

public abstract class Deity {
	String name;
	Domain[] domains;
	Alignment alignment;
	
	float influenece;
	
	String description;
	
	public Deity(String name, Domain[] domains, String description) {
		this.name=name;
		this.domains=domains;
		this.alignment=Domain.getAlignment(domains);
		this.description=description;
	}
	
	public void setInfluence(float i) {
		this.influenece=i;
	}
	public float getInfluence() {
		return this.influenece;
	}

	public void addInfluence(float i) {
		this.influenece+=i;
	}

}
