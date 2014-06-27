package interactions;


import java.util.ArrayList;
import java.util.List;



public class PPT extends Interaction {
    private String loop;
    private List<String> imgList;
    private Double interval;
    private Double duration;
    private String mode;//"n"(none) "g"(渐变) "f"（三维翻转） "s"(缩放)
    private String auto;
    private String interaction;//"n"(none)  "c"(click) "t"(touch)
    private String direction;
    private String overflow;
    public PPT() {
        this.loop="false";
        this.imgList=new ArrayList<String>();
        this.interval=2.0;
        this.duration=0.5;
        this.mode="g";
        this.auto="false";
        this.interaction="n";
        this.direction="x";
    }

    public String generateInteraction(String group) {
        StringBuilder html_ppt=new StringBuilder();//html输出
        html_ppt.append("<div class='PPT _forbidClientBar'  group='"+group+"' auto='"+this.auto+"' direction='"+this.direction+"' loop='"+this.loop+"' interaction='"+this.interaction+"' interval='"+this.interval+"' duration='"+this.duration+"' mode='"+this.mode+"' style='position:absolute;"+this.coordinate.toString()+";-webkit-perspective: 1000px;'>");
        if (this.mode.equals("f")) {//三维翻转方式
            html_ppt.append("<div style='position: absolute;-webkit-transform-style: preserve-3d;-webkit-transition: -webkit-transform "+this.duration+"s;-webkit-transform:rotateY(0deg);-webkit-backface-visibility: hidden;display:block;'  angle='0'><img src='" + this.imgList.get(0) + "'></div>");
            for (int j =1; j <this.imgList.size(); j++) { 
                html_ppt.append("<div style='position: absolute;-webkit-transform-style: preserve-3d;-webkit-transition: -webkit-transform "+this.duration+"s;-webkit-transform:rotateY(-180deg);-webkit-backface-visibility: hidden;display:block;' angle='-180'><img src='" + this.imgList.get(j) + "'></div>");
                }
        }else if (this.mode.equals("s")) {//缩放方式
            html_ppt.append("<div style='position: absolute;z-index:10;' ><img src='" + this.imgList.get(0) + "'></div>");
            for (int j =1; j <this.imgList.size(); j++) { 
                    html_ppt.append("<div style='position: absolute;-webkit-transform:scale(6,6);opacity: 0.1;display:block;' ><img src='" + this.imgList.get(j) + "'></div>");
                }
        }
        else{
            html_ppt.append("<img src='"+this.imgList.get(0)+"'  style='position: absolute;opacity:1;-webkit-transition:"+(this.mode.equals("g")?("opacity "+this.duration+"s;"):";")+"'/>");
            for (int i = 1; i <this.imgList.size() ; i++) {
                html_ppt.append("<img src='"+this.imgList.get(i)+"' style='position: absolute;opacity:0;-webkit-transition:"+(this.mode.equals("g")?("opacity "+this.duration+"s;"):";")+"'/>");
            }
        }
        html_ppt.append("</div>");
        return html_ppt.toString();
    }

    public String getLoop() {
        return loop;
    }

    public void setLoop(String loop) {
        if (loop.equals("t")||loop.equals("true")) {
            this.loop = "true";
        } else {
            this.loop = "false";
        }
    }

    public List<String> getImgList() {
        return imgList;
    }

    public void setImgList(List<String> imgList) {
        this.imgList = imgList;
    }

    public Double getInterval() {
        return interval;
    }

    public void setInterval(Double interval) {
        this.interval = interval;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
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

    public String getInteraction() {
        return interaction;
    }

    public void setInteraction(String interaction) {
        this.interaction = interaction;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getOverflow() {
        return overflow;
    }

    public void setOverflow(String overflow) {
        this.overflow = overflow;
    }
}
