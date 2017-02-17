package net.ages.workbench.templates.dsl.version.blocks;

public class Block {
	private String idPreferred;
	private String idDefault;
	private String filePreferred;
	private String fileDefault;
	private int versionType;
	
	
	public Block(String idPreferred, String idDefault, String filePreferred,
			String fileDefault, int versionType) {
		this.idPreferred = idPreferred;
		this.idDefault = idDefault;
		this.filePreferred = filePreferred;
		this.fileDefault = fileDefault;
		this.versionType = versionType;
	}
	public String getIdPreferred() {
		return idPreferred;
	}
	public String getIdDefault() {
		return idDefault;
	}
	public String getFilePreferred() {
		return filePreferred;
	}
	public String getFileDefault() {
		return fileDefault;
	}
	public int getVersionType() {
		return versionType;
	}
	public void setIdPreferred(String idPreferred) {
		this.idPreferred = idPreferred;
	}
	public void setIdDefault(String idDefault) {
		this.idDefault = idDefault;
	}
	public void setFilePreferred(String filePreferred) {
		this.filePreferred = filePreferred;
	}
	public void setFileDefault(String fileDefault) {
		this.fileDefault = fileDefault;
	}
	public void setVersionType(int versionType) {
		this.versionType = versionType;
	}
}
