package com.brildev.gamelist.dto;

import com.brildev.gamelist.entities.Game;

public class GameMinDto {


    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDto(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Integer getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }

    public GameMinDto() {

}



}
