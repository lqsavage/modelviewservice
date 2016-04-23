package com.inno.modelview.model.viewmodel;

import com.inno.modelview.model.Contributor;
import com.inno.modelview.model.CoreEntity;
import com.inno.modelview.model.Popularity;

/**
 * EntityVM is to exposed to VIEW LAYER
 */
public class EntityVM {

    private String entityName;
    private Integer views;
    private Integer likes;
    private String createUserName;

    private CoreEntity entity;
    private Popularity popularity;
    private Contributor contributor;

    public String getEntityName() {
        return this.entity.getEntityName();
    }

    public String getCreateUserName() {
        return this.contributor.getCreateUserName();
    }

    public Integer getViews() {
        return this.popularity.getViews();
    }

    public Integer getLikes() {
        return this.popularity.getLikes();
    }
}