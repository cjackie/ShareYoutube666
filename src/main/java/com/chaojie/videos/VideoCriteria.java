package com.chaojie.videos;

public abstract class VideoCriteria {
    private VideoCriteria next;

    public boolean verify(Video video) {
        return verifyLocally(video) && (next == null || next.verify(video));
    }

    protected abstract boolean verifyLocally(Video video);

    public void setNext(VideoCriteria next) {
        this.next = next;
    }
}
