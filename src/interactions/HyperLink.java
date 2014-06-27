package interactions;

public class HyperLink extends Interaction {
    private String url="";
    public HyperLink() {
        // TODO Auto-generated constructor stub
    }
    public String generateInteraction(String group) {
        return "<a style='position:absolute;"+this.coordinate.toString()+"' href='"+this.url+"'></a>";
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
