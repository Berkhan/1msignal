package ExcerciseOne;

import com.google.gson.annotations.SerializedName;

import java.time.Month;
import java.util.Date;
import java.util.TimeZone;

public class Article {

    @SerializedName("media-type")
    TYPE type;

    public TYPE getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public String getSource() {
        return source;
    }

    public Date getPublished() {
        return published;
    }

    private String id;
    String content;
    String title;
    private String source;
    private Date published;

    Month getMonth() {
        return published.toInstant().atZone(TimeZone.getTimeZone("UTC").toZoneId()).getMonth();
    }

}
