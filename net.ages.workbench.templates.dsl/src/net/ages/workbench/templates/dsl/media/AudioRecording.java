package net.ages.workbench.templates.dsl.media;
import org.apache.logging.log4j.Logger;

import net.ages.workbench.utils.AlwbLogger;


public class AudioRecording {
	private Logger logger = AlwbLogger.getLogger("AudioRecording");
	String id;
	Composition parent;
	String singer;
	String base;
	String path;
	String year;
	
	public AudioRecording(Composition parent, String id) {
		this.parent = parent;
		this.id = id;
	}

	public Composition getParent() {
		return parent;
	}

	public void setParent(Composition parent) {
		this.parent = parent;
	}

	public String getId() {
		return id;
	}

	public String getSinger() {
		return singer;
	}

	public String getBase() {
		return base;
	}

	public String getPath() {
		return path;
	}

	public String getYear() {
		return year;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSinger(String singer) {
		this.singer = singer;
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
	
	public String getMenuDisplayText() {
		return 	"<span class='mediaMenuItemId'>"
				+ parent.getId() 
				+ "."
				+ id
				+ "</span>"
				+ " - "
				+ "<span class='mediaMenuItemPeople'>"
				+ singer
				+ "</span>";
	}

	public String getBasePath() {
//		return base + path; 
		return path; 
	}
	
	public boolean propertyNotNull(String property) {
		return (property != null && (property != "null") && (property != ""));
	}
	
	public boolean hasRequiredMenuProperties() {
		return propertyNotNull(base) && propertyNotNull(path) && propertyNotNull(singer);
	}


}
