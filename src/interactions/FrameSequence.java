package interactions;


import java.util.ArrayList;
import java.util.List;



public class FrameSequence extends Interaction {
   
    private List<String> imgList;
    private String direction;
    
    public FrameSequence() {
        this.imgList=new ArrayList<String>();
        this.direction="x";
    }

    public String generateInteraction(String group) {
        StringBuilder html_fs=new StringBuilder();//html输出
        html_fs.append("<div class='FrameSequence _forbidClientBar'  group='"+group+"'  direction='"+this.direction+"' style='position:absolute;"+this.coordinate.toString()+";'>");
        html_fs.append("<img  src='"+this.imgList.get(0)+"' width='"+this.coordinate.geIntWidth()+"' height='"+this.coordinate.geIntHeight()+"' />");
        html_fs.append("<div  style='position:fixed;left:-100px;top:-100px;'>");
        for (int i = 0; i < this.imgList.size(); i++) {
            html_fs.append("<img src='"+this.imgList.get(i)+"' width='10' height='10' />");
        }
        html_fs.append("</div></div>");
        return html_fs.toString();
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
