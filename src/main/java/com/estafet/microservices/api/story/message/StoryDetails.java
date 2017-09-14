package com.estafet.microservices.api.story.message;

import java.util.List;

public class StoryDetails {

	private Integer storyId;

	private String title;

	private String description;

	private Integer storypoints;

	private List<String> criteria;

	public Integer getStoryId() {
		return storyId;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public Integer getStorypoints() {
		return storypoints;
	}

	public List<String> getCriteria() {
		return criteria;
	}

}