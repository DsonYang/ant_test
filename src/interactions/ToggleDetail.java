package interactions;

import java.util.List;

public class ToggleDetail extends Interaction {
    private List<String> imgList;
    public ToggleDetail() {
        // TODO Auto-generated constructor stub
    }
    public String generateInteraction(String group) {
        StringBuilder html_wv=new StringBuilder();
        html_wv.append("<div  class='ToggleDetail _forbidClientBar' group='"+group+"' style='position:absolute;"+this.coordinate.toString()+";overflow:hidden;'>"
                    +"<div style='width:"+this.coordinate.getWidth()+";height:"+this.coordinate.getHeight()+";overflow:scroll;-webkit-overflow-scrolling:touch;position:absolute;left: 0;top:0;-webkit-transition: opacity 0.5s;'>"
                    +"<img src='"+this.imgList.get(0)+"'  />"
                    +"</div>"
                    +"<div style='width:"+this.coordinate.getWidth()+";height:"+this.coordinate.getHeight()+";overflow:hidden;position:absolute;left: 0;top:0;-webkit-transition: opacity 0.5s;'>"
                    +"<img src='"+this.imgList.get(1)+"'  />"
                    +"</div></div>");
        return html_wv.toString();
    }
    public List<String> getImgList() {
        return imgList;
    }
    public void setImgList(List<String> imgList) {
        this.imgList = imgList;
    }
    
}
