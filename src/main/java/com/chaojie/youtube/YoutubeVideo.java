package com.chaojie.youtube;

import java.io.OutputStream;

public class YoutubeVideo implements AutoCloseable{
    private String title;
    private String author;
    private OutputStream videoStream;

    public String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    public OutputStream getVideoStream() {
        return videoStream;
    }

    void setVideoStream(OutputStream videoStream) {
        this.videoStream = videoStream;
    }

    @Override
    public void close() throws Exception {
        if (videoStream != null)
            videoStream.close();
    }
}
