package interactions;

import java.util.ArrayList;
import java.util.List;


public class Flip extends Interaction {
    private List<String> imgList = new ArrayList<String>();
    private String mode="p";//翻页的方式，p：软书页；c：硬卡片
    
    public Flip() {
        // TODO Auto-generated constructor stub
    }
    public String generateInteraction(String group) {
        StringBuilder html_fp=new StringBuilder();
        int width=this.coordinate.geIntWidth()*2;
        int height=this.coordinate.geIntHeight();
        int r=(int)Math.ceil(Math.sqrt((width*width+height*height)));
        if (this.mode.equals("p")) {//软页面
            StringBuilder div_fp=new StringBuilder();
            div_fp.append("<div class='FlipPage _forbidClientBar' group='"+group+"' style='position:absolute;left:"+this.coordinate.getLeft()+";top:"+this.coordinate.getTop()+";width:"+width+"px;height:"+this.coordinate.getHeight()+";overflow:hidden;'>");
            
            int num=this.imgList.size();
            if (num%2==0) {
                for (int i = this.imgList.size()-2; i >=0; i-=2) {
                    StringBuilder fp_fp=new StringBuilder();//flipPage-frontpage  翻页的正面
                    StringBuilder fp_fpb=new StringBuilder();//flipPage-frontpageback  翻页的背面
                    StringBuilder fp_fps=new StringBuilder();//flipPage-frontpageshadow  翻页的阴影
                    
                    fp_fp.append("<div class='frontpage' style='position:absolute;left:"+width/2+"px;width:"+r+"px;height:"+height+"px;overflow: hidden;'>" +
                        "<div style='background-image:url("+this.imgList.get(i)+");width:"+width/2+"px;height:"+height+"px;-webkit-transform:translateZ(0);-webkit-box-shadow: 0 0 11px rgba(0,0,0,0.5);'></div>" +
                        "</div>");
                    fp_fpb.append("<div class='frontpageBack' style='position:absolute;left:"+width/2+"px;width:"+r+"px;height:"+height+"px;overflow: hidden;'>" +
                        "<div style='background-image:url("+this.imgList.get(i+1)+");width:"+width/2+"px;height:"+height+
                        "px;-webkit-box-shadow: 0 0 11px rgba(0,0,0,0.5);-webkit-transform: rotate(-180deg) translate(-100%,0) translateZ(0);'></div>" +
                        "</div>");
                    fp_fps.append("<div class='frontpageShadow' style='position:absolute;left:"+width/2+"px;width:"+width/2+"px;height:"+height+"px;overflow: hidden;'>" +
                            "<div style='position: absolute;width:25px;height:"+r+"px;overflow:hidden;'></div>" +
                             "</div>");
                    div_fp.append(fp_fp);
                    div_fp.append(fp_fpb);
                    div_fp.append(fp_fps);
                }
            } else {
                    div_fp.append("<div class='frontpage' style='position:absolute;left:"+width/2+"px;width:"+r+"px;height:"+height+"px;overflow: hidden;'>" +
                            "<div style='background-image:url("+this.imgList.get(num-1)+");width:"+width/2+"px;height:"+height+"px;-webkit-transform:translateZ(0);-webkit-box-shadow: 0 0 11px rgba(0,0,0,0.5);'></div>" +
                            "</div>");
                    div_fp.append("<div class='frontpageBack' style='position:absolute;left:"+width/2+"px;width:"+r+"px;height:"+height+"px;overflow: hidden;'>" +
                            "<div style='background-color:gray;width:"+width/2+"px;height:"+height+
                            "px;-webkit-box-shadow: 0 0 11px rgba(0,0,0,0.5);-webkit-transform: rotate(-180deg) translate(-100%,0) translateZ(0);'></div>" +
                            "</div>");//如果页数为奇数，则最后一页为白色空白
                    div_fp.append("<div class='frontpageShadow' style='position:absolute;left:"+width/2+"px;width:"+width/2+"px;height:"+height+"px;overflow: hidden;'>" +
                            "<div style='position: absolute;width:25px;height:"+r+"px;overflow:hidden;'></div>" +
                            "</div>");
                for (int i = this.imgList.size()-3; i >=0; i-=2) {  
                    StringBuilder fp_fp=new StringBuilder();//flipPage-frontpage  翻页的正面
                    StringBuilder fp_fpb=new StringBuilder();//flipPage-frontpageback  翻页的背面
                    StringBuilder fp_fps=new StringBuilder();//flipPage-frontpageshadow  翻页的阴影
                    fp_fp.append("<div class='frontpage' style='position:absolute;left:"+width/2+"px;width:"+r+"px;height:"+height+"px;overflow: hidden;'>" +
                        "<div style='background-image:url("+this.imgList.get(i)+");width:"+width/2+"px;height:"+height+"px;-webkit-transform:translateZ(0);-webkit-box-shadow: 0 0 11px rgba(0,0,0,0.5);'></div>" +
                        "</div>");
                    fp_fpb.append("<div class='frontpageBack' style='position:absolute;left:"+width/2+"px;width:"+r+"px;height:"+height+"px;overflow: hidden;'>" +
                        "<div style='background-image:url("+this.imgList.get(i+1)+");width:"+width/2+"px;height:"+height+
                        "px;-webkit-box-shadow: 0 0 11px rgba(0,0,0,0.5);-webkit-transform: rotate(-180deg) translate(-100%,0) translateZ(0);'></div>" +
                        "</div>");
                    fp_fps.append("<div class='frontpageShadow' style='position:absolute;left:"+width/2+"px;width:"+width/2+"px;height:"+height+"px;overflow: hidden;'>" +
                            "<div style='position: absolute;width:25px;height:"+r+"px;overflow:hidden;'></div>" +
                             "</div>");
                    div_fp.append(fp_fp);
                    div_fp.append(fp_fpb);
                    div_fp.append(fp_fps);
                }
            }
            
            div_fp.append("</div>");
            html_fp.append(div_fp);
        }
        else {//硬卡片
            StringBuilder div_fp=new StringBuilder();
            div_fp.append("<div class='FlipCard _forbidClientBar' group='"+group+"' style='left:"+this.coordinate.getLeft()+";top:"+this.coordinate.getTop()+";width:"+width+"px;height:"+this.coordinate.getHeight()+";'>");
            for (int i = this.imgList.size()-2; i >=0; i-=2) {
                StringBuilder fp_fp=new StringBuilder();//flipPage-frontpage  翻页的正面
                StringBuilder fp_fpb=new StringBuilder();//flipPage-frontpageback  翻页的背面
                
                fp_fpb.append("<div style='position:absolute;left:0px;-webkit-transform: rotateY(180deg);-webkit-transform-origin: 100% 50%;'>" +
                        "<img src='"+this.imgList.get(i+1)+"' width='"+width/2+"' height='"+height+"'/>" +
                        "</div>");
                fp_fp.append("<div style='position:absolute;left:"+width/2+"px;width:"+width/2+"px;height:"+height+"px;-webkit-transform-origin: 0px 0px;'>" +
                             "<img src='"+this.imgList.get(i)+"' width='"+width/2+"' height='"+height+"'/>" +
                              "</div>");
                div_fp.append(fp_fpb);
                div_fp.append(fp_fp);
                
            }
            div_fp.append("</div>");
            html_fp.append(div_fp);
        }
        return html_fp.toString();
    }
    public List<String> getImgList() {
        return imgList;
    }
    public void setImgList(List<String> imgList) {
        this.imgList = imgList;
    }
    public String getMode() {
        return mode;
    }
    public void setMode(String mode) {
        this.mode = mode;
    }
}
