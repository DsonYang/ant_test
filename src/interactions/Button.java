package interactions;


public class Button extends Interaction {

    private String interaction;//'click' 'pre' 'next' 'toggle' 'index(如1、2、3等)'
    private String bgImg;
    
    public Button() {
        this.interaction="cilck";
        this.bgImg="";
    }
    @Override
     public String generateInteraction(String group) {
        StringBuilder html_btn=new StringBuilder();//html输出
        html_btn.append("<span class='Button  _forbidClientBar' group='"+group+"' clickMsg='"+this.interaction+"' style='position: absolute;"+this.coordinate.toString()+";background:"+(this.bgImg.length()==0?"none;":"url("+this.bgImg+") no-repeat;")+"'></span>");
        return html_btn.toString();
    }
    
    


    public String getInteraction() {
        return interaction;
    }
    public void setInteraction(String interaction) {
        this.interaction = interaction;
    }
    public String getBgImg() {
        return bgImg;
    }

    public void setBgImg(String bgImg) {
        this.bgImg = bgImg;
    }

}
