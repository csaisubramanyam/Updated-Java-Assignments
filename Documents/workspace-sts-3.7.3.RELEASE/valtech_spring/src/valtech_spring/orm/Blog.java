package valtech_spring.orm;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("Bbook")
public class Blog extends Book{
	
	private String url;
	private int NoOfVisited;

	public Blog() {}

	public Blog(String url, int noOfVisited) {
		super();
		this.url = url;
		NoOfVisited = noOfVisited;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getNoOfVisited() {
		return NoOfVisited;
	}

	public void setNoOfVisited(int noOfVisited) {
		NoOfVisited = noOfVisited;
	}

	@Override
	public String toString() {
		return "Blog [url=" + url + ", NoOfVisited=" + NoOfVisited + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getYearPublished()=" + getYearPublished() + "]";
	}
	
}
