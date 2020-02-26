package tn.app.event.com.myapplication1;



public class Evenement {
    String nom;
    String remarque;
    int imgRow;

    String date;

    public String getName() {
        return nom;
    }
    public void setName(String name) {
        this.nom = name;
    }
    public String getRemarque() {
        return remarque;
    }
    public void setRemarque(String rq) {
        this.remarque = rq;
    }
    public int getImgRow(){
        return imgRow;
    }
    public void setImgRow(int imgRow){
        this.imgRow = imgRow;
    }
    public String getDate(){return date;}
    public void setdate(String date) {
        this.date = date;
    }

    public Evenement(String name, String rq, int imgRow, String date) {
        super();
        this.nom = name;
        this.remarque = rq;
        this.imgRow = imgRow;
        this.date = date;


    }
}