package bilal.khelifi.touhami.alternativemedicine;

import androidx.annotation.NonNull;

public class MyListItem {

    private String title, content;
    // State of the item
    private boolean expanded;

    public MyListItem(String title, String content) {
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

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    @NonNull
    @Override
    public String toString() {
        return title+" :  "+content;
    }
}
