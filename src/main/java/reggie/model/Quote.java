package reggie.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "quotes")
public class Quote implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String text;

    @ManyToOne(optional = false)
    @JoinColumn(name = "video_id", nullable = false, updatable = false)
    private Video video;

    @Column(nullable = false)
    private Long startTime;

    @Column(nullable = false)
    private Long endTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
}
