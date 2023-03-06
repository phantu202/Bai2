package com;

public class Word {
	private String spell;
	private String pronounce;
	private String types;
	private String define;
	private String example;

	public Word() {
	}

	public Word(String spell, String pronounce, String types, String define, String example) {
		this.spell = spell;
		this.pronounce = pronounce;
		this.types = types;
		this.define = define;
		this.example = example;
	}

	public String getSpell() {
		return spell;
	}

	public void setSpell(String spell) {
		this.spell = spell;
	}

	public String getPronounce() {
		return pronounce;
	}

	public void setPronounce(String pronounce) {
		this.pronounce = pronounce;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public String getDefine() {
		return define;
	}

	public void setDefine(String define) {
		this.define = define;
	}

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}

	@Override
	public String toString() {
		return "Word [spell=" + spell + ", pronounce=" + pronounce + ", types=" + types + ", define=" + define
				+ ", example=" + example + "]";
	}

	

}
