package com.chaojie.videos;

public class VideoCriteriaByID extends VideoCriteria {
    private Long id;

    public VideoCriteriaByID(Long id) {
        this.id = id;
    }

    @Override
    protected boolean verifyLocally(Video video) {
        if (video != null && video.getId().equals(id))
            return true;
        return false;
    }
}
