package smc.minjoon.intent1;

import java.io.Serializable;

/**
 * Created by skaqn on 2017-01-27.
 */

public class SingleItem implements Serializable{
    private int _id;
    private String title;
    private String content;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public SingleItem(int _id, String title, String content) {
        this._id = _id;
        this.title = title;
        this.content = content;
    }

    public SingleItem(){

    }
    public SingleItem(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
