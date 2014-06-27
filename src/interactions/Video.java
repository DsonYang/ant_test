package interactions;


public class Video extends Interaction {
    private String src;
    
    public Video() {
    }
    @Override
     public String generateInteraction(String group) {
        StringBuilder html_btn=new StringBuilder();//html输出
        html_btn.append("<span class='Video' group='"+group+"'  src='"+this.src+"' style='position:absolute;"+this.coordinate.toString()+"'></span>");
        return html_btn.toString();
    }
   
    public String getSrc() {
        return src;
    }
    public void setSrc(String src) {
        this.src = src;
    }
    
    


    

}
