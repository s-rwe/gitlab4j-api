package org.gitlab4j.api.models;

import org.gitlab4j.api.utils.JacksonJson;

public class GitLabCiTemplate {

    private String name;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return (JacksonJson.toJsonString(this));
    }
}
