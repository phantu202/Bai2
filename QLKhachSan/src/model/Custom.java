package model;

public class Custom {
	private int idCustom;
	private String customName;
	private String customeSex;
	private String customeFone;

	public int getIdCustom() {
		return idCustom;
	}

	public void setIdCustom(int idCustom) {
		this.idCustom = idCustom;
	}

	public String getCustomName() {
		return customName;
	}

	public void setCustomName(String customName) {
		this.customName = customName;
	}

	public String getCustomeSex() {
		return customeSex;
	}

	public void setCustomeSex(String customeSex) {
		this.customeSex = customeSex;
	}

	public String getCustomeFone() {
		return customeFone;
	}

	public void setCustomeFone(String customeFone) {
		this.customeFone = customeFone;
	}

	public Custom(int idCustom, String customName, String customeSex, String customeFone) {
		this.idCustom = idCustom;
		this.customName = customName;
		this.customeSex = customeSex;
		this.customeFone = customeFone;
	}

	public Custom() {
	}

	@Override
	public String toString() {
		return "Custom [idCustom=" + idCustom + ", customName=" + customName + ", customeSex=" + customeSex
				+ ", customeFone=" + customeFone + "]";
	}

}
