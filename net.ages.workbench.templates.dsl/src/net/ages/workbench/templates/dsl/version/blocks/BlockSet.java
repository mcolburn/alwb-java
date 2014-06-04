package net.ages.workbench.templates.dsl.version.blocks;

public class BlockSet {
	private int versionId;
	private Block liturgical;
	private Block gospel;
	private Block epistle;
	private Block psalter;
	private Block prophetologion;
	private boolean on = true;
	
	
	public BlockSet() {
		
	}
	
	public int getVersionId() {
		return versionId;
	}
	public Block getLiturgical() {
		return liturgical;
	}
	public Block getGospel() {
		return gospel;
	}
	public Block getEpistle() {
		return epistle;
	}
	public Block getPsalter() {
		return psalter;
	}
	public Block getProphetologion() {
		return prophetologion;
	}
	public boolean isOn() {
		return on;
	}
	public void setVersionId(int versionId) {
		this.versionId = versionId;
	}
	public void setLiturgical(Block liturgical) {
		this.liturgical = liturgical;
	}
	public void setGospel(Block gospel) {
		this.gospel = gospel;
	}
	public void setEpistle(Block epistle) {
		this.epistle = epistle;
	}
	public void setPsalter(Block psalter) {
		this.psalter = psalter;
	}
	public void setProphetologion(Block prophetologion) {
		this.prophetologion = prophetologion;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
}
