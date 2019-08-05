package com.sf.sofarmusic.db.song;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "SONG_RECORD".
 */
@Entity
public class SongRecord {

    @Id(autoincrement = true)
    private Long id;
    private String songId;
    private String content;

    @Generated
    public SongRecord() {
    }

    public SongRecord(Long id) {
        this.id = id;
    }

    @Generated
    public SongRecord(Long id, String songId, String content) {
        this.id = id;
        this.songId = songId;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}