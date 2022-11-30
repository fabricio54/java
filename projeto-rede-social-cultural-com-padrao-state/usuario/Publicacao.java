package usuario;

public class Publicacao {
    
    private String link;
    private String tag;

    public Publicacao(String link, String tag) {
        this.link = link;
        this.tag = tag;
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
