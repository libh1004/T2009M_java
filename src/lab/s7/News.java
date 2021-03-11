package lab.s7;

import java.util.ArrayList;

public class News implements INews{
    public ArrayList<Integer> RateList;
    public News(){
        RateList = new ArrayList<Integer>();
    }

    Integer p1 = 0;
    Integer p2 = 1;
    Integer p3 = 2;

    @Override
    public void Display() {
        System.out.println("Title: "+getTitle());
        System.out.println("PublishDate: "+getPublishDate());
        System.out.println("Author: "+getAuthor());
        System.out.println("Content: "+getContent());
        System.out.println("AverageRate: "+getAverageRate());
    }

    public int ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public float AverageRate;

    public int Calculate(){
        return (p1+p2+p3)/3;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

}
