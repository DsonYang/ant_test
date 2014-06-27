package interactions;


public class Audio extends Interaction {

    private String auto;
    private String src;
    
    public Audio() {
    }
    @Override
     public String generateInteraction(String group) {
        StringBuilder html_btn=new StringBuilder();//html输出
        html_btn.append("<span class='Audio' group='"+group+"' auto='"+this.auto+"'  src='"+this.src+"' style='position:absolute;"+this.coordinate.toString()+";"+(this.auto.equals("true")?"display:none;":"")+"'></span>");
        return html_btn.toString();
    }
    public String getAuto() {
        return auto;
    }
    public void setAuto(String auto) {
        if (auto.equals("t")||auto.equals("true")) {
            this.auto = "true";
        } else {
            this.auto = "false";
        }
    }
    
    public String getSrc() {
        return src;
    }
    public void setSrc(String src) {
        this.src = src;
    }
   
    
    


    

}
