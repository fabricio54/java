
public class Publicacao {
    private String link;
    private String tag;

    public Publicacao(String link, String tag){
        this.link = link;
        this.tag = tag;
    }

    public void imprimePublicacao(){
        System.out.println("---- Acesso Publicação ----");
        System.out.println("Link: "+this.link);
        System.out.println("Tag: "+this.tag);
    }

    public String getLink(){
        return this.link;
    }

    public String getTag(){
        return this.tag;
    }

    public void setLink(String link){
        this.link = link;
    }

    public void setTag(String tag){
        this.tag = tag;
    }
}
