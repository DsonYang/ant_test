package interactions;

import java.util.ArrayList;
import java.util.List;


public class ImageContrast extends Interaction {
    private List<String> imgList= new ArrayList<String>();
    private String direction="x";
    public ImageContrast() {
        // TODO Auto-generated constructor stub
    }
    
    public String generateInteraction(String group) {
        StringBuilder html_ic=new StringBuilder();
        html_ic.append("<div class='ImageContrast _forbidClientBar' group='"+group+"' direction='"+this.direction+"'  style='position:absolute;"+this.coordinate.toString()+";overflow: hidden;" +
                    "background:url("+this.imgList.get(0)+") 0 0 no-repeat;'>" );
        if (this.direction.toLowerCase().equals("x")) {
            html_ic.append("<div style='position: absolute;  width: 1px; left:0px; top:0px; overflow:hidden;-webkit-transform: translateZ(0);'>");
        }
        else {
            html_ic.append("<div style='position: absolute;  height: 1px; left:0px; top:0px; overflow:hidden;-webkit-transform: translateZ(0);'>");
        }
        
        html_ic.append("<img src='"+this.imgList.get(1)+"'/></div></div>");
        return html_ic.toString();
    }

    public List<String> getImgList() {
        return imgList;
    }

    public void setImgList(List<String> imgList) {
        this.imgList = imgList;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

}
