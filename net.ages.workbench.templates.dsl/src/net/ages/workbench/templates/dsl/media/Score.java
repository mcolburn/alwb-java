package net.ages.workbench.templates.dsl.media;

public class Score {
	private Composition parent;
	private String id;
	private String arranger;
	private String base;
	private String path;
	private String year;
	
	public Score(Composition parent, String id) {
		this.parent = parent;
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public String getArranger() {
		return arranger;
	}

	public String getBase() {
		return base;
	}
	
	public String getBasePath() {
		return base + path; 
	}

	public String getPath() {
		return path;
	}
	
	public boolean propertyNotNull(String property) {
		return (property != null && (property != "null") && (property != ""));
	}

	public String getYear() {
		return year;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setArranger(String arranger) {
		this.arranger = arranger;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	public boolean hasRequiredMenuProperties() {
		return propertyNotNull(base) && propertyNotNull(path) && propertyNotNull(arranger);
	}
	
	public String getMenuDisplayText() {
		return 	"<span class='mediaMenuItemId'>"
				+ id
				+ "</span>"
				+ " - "
				+ "<span class='mediaMenuItemPeople'>"
				+ parent.getComposer()
				+ " / "
				+ arranger
				+ "</span>";
	}

}
