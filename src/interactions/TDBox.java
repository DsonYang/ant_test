package interactions;

import java.util.ArrayList;
import java.util.List;



public class TDBox extends Interaction {
    private List<String> imgList= new ArrayList<String>();
    private String fullScreen;
    private Integer imgWidth;
   

    public TDBox() {
        // TODO Auto-generated constructor stub
    }
    
    public String generateInteraction(String group) {
        StringBuilder html_tb=new StringBuilder();
        if (this.fullScreen.equals("true")) {
            html_tb.append("<div  class='TDBox _forbidClientBar' fullScreen='true' group='"+group+"' ><div  style='position:absolute;width:768px;height:1024px;left:0px;top:0px;overflow: hidden;" +
                    "-webkit-perspective-origin: 50% 50%;-webkit-perspective:"+(this.imgWidth/2)+"px;'>" );
        } else {
            html_tb.append("<div  class='TDBox _forbidClientBar' fullScreen='false' group='"+group+"' ><div  style='position:absolute;"+this.coordinate.toString()+";overflow: hidden;" +
                    "-webkit-perspective-origin: 50% 50%;-webkit-perspective:"+(this.imgWidth/2)+"px;'>" );
        }
        
        html_tb.append("<div style='width:"+this.imgWidth+"px;height:"+this.imgWidth+"px;-webkit-transform-style:preserve-3d;opacity: "+(this.fullScreen.equals("true")?0:1)+";'>");
        Number halfWidth=this.imgWidth/2-1;
        for (int i = 0; i < imgList.size(); i++) {
            html_tb.append("<img src='"+imgList.get(i)+"'  style='position:absolute;width:"+this.imgWidth+"px;height:"+this.imgWidth+"px;-webkit-backface-visibility:hidden;" );
            switch (i) {
            case 0://front
                html_tb.append("-webkit-transform:translateZ("+halfWidth+"px) rotateY(180deg);' />");
                break;
            case 1://r
                html_tb.append("-webkit-transform:translateX("+halfWidth+"px) rotateY(-90deg);' />");
                break;
            case 2://ba
                html_tb.append("-webkit-transform:translateZ(-"+halfWidth+"px);' />");
                break;
            case 3://l
                html_tb.append("-webkit-transform:translateX(-"+halfWidth+"px) rotateY(90deg);' />");
                break;
            case 4://t
                html_tb.append("-webkit-transform:translateY(-"+halfWidth+"px) rotateX(-90deg);' />");
                break;
            case 5://b
                html_tb.append("-webkit-transform:translateY("+halfWidth+"px) rotateX(90deg);' />");
                break;
            }
        }
        html_tb.append("</div></div>");
        if (this.fullScreen.equals("true")) {
            html_tb.append("<div style='position: absolute;left:4px;top: 8px;width:26px;height: 26px;color:#f0f0f0;padding-left: 1px;padding-top: 1px;background:#000;display: none; z-index:100;'>" +
            		"<div style='-webkit-box-sizing: border-box;border: 1px solid white;width:25px;height:25px;display:block;text-align:center;font-size:22px;line-height:1.1em;text-indent:1px;'>&#10006;</div></div>");
        }
        html_tb.append("</div>");
        return html_tb.toString();
    }

    public List<String> getImgList() {
        return imgList;
    }

    public void setImgList(List<String> imgList) {
        this.imgList = imgList;
    }
    public String getFullScreen() {
        return fullScreen;
    }

    public void setFullScreen(String fullScreen) {
        if (fullScreen.equals("t")||fullScreen.equals("true")) {
            this.fullScreen = "true";
        } else {
            this.fullScreen = "false";
        }
    }

    public Integer getImgWidth() {
        return imgWidth;
    }

    public void setImgWidth(Integer imgWidth) {
        this.imgWidth = imgWidth;
    }

    

}
