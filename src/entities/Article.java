package entities;

import java.util.Date;
import java.util.Objects;

public class Article {
    private int id_article,id_user,nbrevue;
    private String nom_article,contenu_article,image_article,titre_event;
    private Date date_article;

    public int getId_article() {
        return id_article;
    }

    public void setId_article(int id_article) {
        this.id_article = id_article;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getNbrevue() {
        return nbrevue;
    }

    public void setNbrevue(int nbrevue) {
        this.nbrevue = nbrevue;
    }

    public String getNom_article() {
        return nom_article;
    }

    public void setNom_article(String nom_article) {
        this.nom_article = nom_article;
    }

    public String getContenu_article() {
        return contenu_article;
    }

    public void setContenu_article(String contenu_article) {
        this.contenu_article = contenu_article;
    }

    public String getImage_article() {
        return image_article;
    }

    public void setImage_article(String image_article) {
        this.image_article = image_article;
    }

    public String getTitre_event() {
        return titre_event;
    }

    public void setTitre_event(String titre_event) {
        this.titre_event = titre_event;
    }

    public Date getDate_article() {
        return date_article;
    }

    public void setDate_article(Date date_article) {
        this.date_article = date_article;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id_article=" + id_article +
                ", id_user=" + id_user +
                ", nbrevue=" + nbrevue +
                ", nom_article='" + nom_article + '\'' +
                ", contenu_article='" + contenu_article + '\'' +
                ", image_article='" + image_article + '\'' +
                ", titre_event='" + titre_event + '\'' +
                ", date_article=" + date_article +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return id_article == article.id_article &&
                id_user == article.id_user &&
                nbrevue == article.nbrevue &&
                nom_article.equals(article.nom_article) &&
                contenu_article.equals(article.contenu_article) &&
                image_article.equals(article.image_article) &&
                titre_event.equals(article.titre_event) &&
                date_article.equals(article.date_article);
    }

    public Article(int id_article, int id_user, int nbrevue, String nom_article, String contenu_article, String image_article, String titre_event, Date date_article) {
        this.id_article = id_article;
        this.id_user = id_user;
        this.nbrevue = nbrevue;
        this.nom_article = nom_article;
        this.contenu_article = contenu_article;
        this.image_article = image_article;
        this.titre_event = titre_event;
        this.date_article = date_article;
    }
}
