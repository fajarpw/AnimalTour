package org.aplas.animaltour;

public class DataItem {
    private String title;
    private String info;
    private int color;
    private int icon;

    public DataItem(String title, String info, int color, int icon) {
        this.title = title;
        this.info = info;
        this.color = color;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
