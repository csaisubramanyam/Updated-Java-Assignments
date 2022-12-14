package valtech_spring.orm;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("Abook")
public class Article extends Book{
	
	private String url;

	public Article() {}

	public Article(String url) {
		super();
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Article [url=" + url + ", getId()=" + getId() + ", getName()=" + getName() + ", getYearPublished()="
				+ getYearPublished() + "]";
	}
	
}
