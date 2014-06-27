package interactions;

public class WebView extends Interaction {
    private String img="";
    private String direction="x";
    public WebView() {
        // TODO Auto-generated constructor stub
    }
    public String generateInteraction(String group) {
        StringBuilder html_wv=new StringBuilder();
        if (this.direction.equals("x")) {
            html_wv.append("<div  class='WebView _forbidClientBar' group='"+group+"' style='position:absolute;width:"+this.coordinate.getWidth()+";left:"+this.coordinate.getLeft()+";top:"+this.coordinate.getTop()+";overflow-x:scroll;overflow-y:hidden;white-space:nowrap;-webkit-overflow-scrolling:touch;-webkit-transform:translate3d(0,0,0);'>"
                    +"<img style='display:inline;' src='"+this.img+"'/>"
                    +"</div>");
        } else {
            html_wv.append("<div  class='WebView _forbidClientBar' group='"+group+"' style='position:absolute;width:"+this.coordinate.getWidth()+";height:"+this.coordinate.getHeight()+";left:"+this.coordinate.getLeft()+";top:"+this.coordinate.getTop()+";overflow:scroll;-webkit-overflow-scrolling:touch;-webkit-transform:translate3d(0,0,0);'>"
                    +"<img style='display:inline;' src='"+this.img+"'/>"
                    +"</div>");
        }
        
        return html_wv.toString();
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
    }
    public String getDirection() {
        return direction;
    }
    public void setDirection(String direction) {
        this.direction = direction;
    }
}
