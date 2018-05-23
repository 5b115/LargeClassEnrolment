package edu.zut.cs.javaee.dream.customer.domain;

import edu.zut.cs.javaee.dream.base.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "T_FEEDBACK")
public class FeedBack extends BaseEntity {

    @Column
    protected Date time;

    @Column
    String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }


}
