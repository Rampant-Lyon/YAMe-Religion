package com.sirniloc.yam.reli.gods;

public class God {
	String name;
	Domain[] domains;
	Alignment alignment;
	
	String description;
	
	public God(String name, Domain[] domains, String description) {
		this.name=name;
		this.domains=domains;
		this.alignment=Domain.getAlignment(domains);
		this.description=description;
	}
	
	

}
