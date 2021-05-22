package ru.netology;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fact {

    private final String id;
    private final String user;
    private final String text;
    private final int version;
    private final boolean used;

    public Fact(
            @JsonProperty("_id") String id,
            @JsonProperty("user") String user,
            @JsonProperty("text") String text,
            @JsonProperty("__v") int version,
            @JsonProperty("used") boolean used) {

        this.user = user;
        this.text = text;
        this.id = id;
        this.version = version;
        this.used = used;
    }

    public String getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public String getText() {
        return text;
    }

    public int getVersion() {
        return version;
    }

    public boolean isUsed() {
        return used;
    }

    @Override
    public String toString() {
        return "CatFact" + "\n  id=" + id + "\n  user=" + user + "\n  text=" + text + "\n  version=" + version + "\n  used=" + used;
    }
}