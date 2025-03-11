package com.example.model;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "Category")
public class Category {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

@Column(name = "Category_Name")
private @NotBlank String CategoryName;
private @NotBlank String Description;
@Column (name = "image_url")
private @NotBlank String ImageUrl;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getCategoryName() {
	return CategoryName;
}
public void setCategoryName(String categoryName) {
	CategoryName = categoryName;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public String getImageUrl() {
	return ImageUrl;
}
public void setImageUrl(String imageUrl) {
	ImageUrl = imageUrl;
}


}
