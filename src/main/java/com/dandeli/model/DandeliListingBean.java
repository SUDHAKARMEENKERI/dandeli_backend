package com.dandeli.model;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="danliOfficelist")
public class DandeliListingBean {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	
	public String name;
	public String category;
	public ArrayList email;
	public ArrayList contactNo;
	public ArrayList address;
	public ArrayList weblink;
	public String logo;
	public String coverPhoto;
	public ArrayList galleries;
	public ArrayList galleriesNotification;
	public ArrayList blogLink;
	public ArrayList officeTiming;
	public String otherDetails;
	
	public DandeliListingBean() {
		
	}

	public DandeliListingBean(int id, String name, String category, ArrayList email, ArrayList contactNo, ArrayList address,
			ArrayList weblink, String logo, String coverPhoto, ArrayList galleries, ArrayList galleriesNotification, ArrayList blogLink,
			ArrayList officeTiming, String otherDetails) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.email = email;
		this.contactNo = contactNo;
		this.address = address;
		this.weblink = weblink;
		this.logo = logo;
		this.coverPhoto = coverPhoto;
		this.galleries = galleries;
		this.galleriesNotification = galleriesNotification;
		this.blogLink = blogLink;
		this.officeTiming = officeTiming;
		this.otherDetails = otherDetails;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public ArrayList getEmail() {
		return email;
	}

	public ArrayList getContactNo() {
		return contactNo;
	}

	public ArrayList getAddress() {
		return address;
	}

	public ArrayList getWeblink() {
		return weblink;
	}

	public String getLogo() {
		return logo;
	}

	public String getCoverPhoto() {
		return coverPhoto;
	}

	public ArrayList getGalleries() {
		return galleries;
	}

	public ArrayList getGalleriesNotification() {
		return galleriesNotification;
	}

	public ArrayList getBlogLink() {
		return blogLink;
	}

	public ArrayList getOfficeTiming() {
		return officeTiming;
	}

	public String getOtherDetails() {
		return otherDetails;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setEmail(ArrayList email) {
		this.email = email;
	}

	public void setContactNo(ArrayList contactNo) {
		this.contactNo = contactNo;
	}

	public void setAddress(ArrayList address) {
		this.address = address;
	}

	public void setWeblink(ArrayList weblink) {
		this.weblink = weblink;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public void setCoverPhoto(String coverPhoto) {
		this.coverPhoto = coverPhoto;
	}

	public void setGalleries(ArrayList galleries) {
		this.galleries = galleries;
	}

	public void setGalleriesNotification(ArrayList galleriesNotification) {
		this.galleriesNotification = galleriesNotification;
	}

	public void setBlogLink(ArrayList blogLink) {
		this.blogLink = blogLink;
	}

	public void setOfficeTiming(ArrayList officeTiming) {
		this.officeTiming = officeTiming;
	}

	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((blogLink == null) ? 0 : blogLink.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((contactNo == null) ? 0 : contactNo.hashCode());
		result = prime * result + ((coverPhoto == null) ? 0 : coverPhoto.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((galleries == null) ? 0 : galleries.hashCode());
		result = prime * result + ((galleriesNotification == null) ? 0 : galleriesNotification.hashCode());
		result = prime * result + id;
		result = prime * result + ((logo == null) ? 0 : logo.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((officeTiming == null) ? 0 : officeTiming.hashCode());
		result = prime * result + ((otherDetails == null) ? 0 : otherDetails.hashCode());
		result = prime * result + ((weblink == null) ? 0 : weblink.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DandeliListingBean other = (DandeliListingBean) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (blogLink == null) {
			if (other.blogLink != null)
				return false;
		} else if (!blogLink.equals(other.blogLink))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (contactNo == null) {
			if (other.contactNo != null)
				return false;
		} else if (!contactNo.equals(other.contactNo))
			return false;
		if (coverPhoto == null) {
			if (other.coverPhoto != null)
				return false;
		} else if (!coverPhoto.equals(other.coverPhoto))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (galleries == null) {
			if (other.galleries != null)
				return false;
		} else if (!galleries.equals(other.galleries))
			return false;
		if (galleriesNotification == null) {
			if (other.galleriesNotification != null)
				return false;
		} else if (!galleriesNotification.equals(other.galleriesNotification))
			return false;
		if (id != other.id)
			return false;
		if (logo == null) {
			if (other.logo != null)
				return false;
		} else if (!logo.equals(other.logo))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (officeTiming == null) {
			if (other.officeTiming != null)
				return false;
		} else if (!officeTiming.equals(other.officeTiming))
			return false;
		if (otherDetails == null) {
			if (other.otherDetails != null)
				return false;
		} else if (!otherDetails.equals(other.otherDetails))
			return false;
		if (weblink == null) {
			if (other.weblink != null)
				return false;
		} else if (!weblink.equals(other.weblink))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DandeliListingBean [id=" + id + ", name=" + name + ", category=" + category + ", email=" + email
				+ ", contactNo=" + contactNo + ", address=" + address + ", weblink=" + weblink + ", logo=" + logo
				+ ", coverPhoto=" + coverPhoto + ", galleries=" + galleries + ", galleriesNotification="
				+ galleriesNotification + ", blogLink=" + blogLink + ", officeTiming=" + officeTiming
				+ ", otherDetails=" + otherDetails + "]";
	}
	
}
