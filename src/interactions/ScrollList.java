package interactions;


import java.util.List;



public class ScrollList extends Interaction {
    private String direction; //X or Y
    private List<String> imgList;
    private String auto;
    private String loop;
    private Double interval;
    private Double duration;
    private String interaction;//"n"(none)  "t"(touch)
    private String mode;//"s"(sequence) "r"(random)
    private String isReverse;
    public ScrollList() {
        this.direction="x";
        this.auto="false";
        this.loop="false";
        this.isReverse="false";
        this.interval=2.0;
        this.duration=0.5;
        this.interaction="t";
        this.mode="s";
    }

    public String generateInteraction(String group) {
        
        StringBuilder html_sl=new StringBuilder();
        int w=0,h=0;
        if (this.direction.equals("x")) {
            w=this.coordinate.geIntWidth()*this.imgList.size();
            h=this.coordinate.geIntHeight();
        }else {
            w=this.coordinate.geIntWidth();
            h=this.coordinate.geIntHeight()*this.imgList.size();
        }
        
        if (this.mode.equals("s")) {
            html_sl.append("<div class='ScrollList _forbidClientBar' group='"+group+"' direction='"+this.direction+"' auto='"+this.auto+"' isReverse='"+this.isReverse+"' interval='"+this.interval+"' duration='"+this.duration+"' loop='"+this.loop+"' interaction='"+this.interaction+"' mode='"+this.mode+"'  style='position: absolute;"+this.coordinate+";overflow: hidden;'>" +
                    "<div style='width:"+w+"px;height:"+h+"px;-webkit-transform:"+genTranString()+";'>"); 
            for (int i = 0; i < imgList.size(); i++) {
                if(this.direction.equals("x")) {
                    html_sl.append("<img style='float:left;' src='"+this.imgList.get(i)+"'/>");
                }else {
                    html_sl.append("<img style='display:block;' src='"+this.imgList.get(i)+"'/>");
                }
            }
        }
        else if (this.mode.equals("r")) {
            html_sl.append("<div class='ScrollList _forbidClientBar' group='"+group+"' direction='"+this.direction+"' auto='"+this.auto+"' isReverse='"+this.isReverse+"'  interval='"+this.interval+"' duration='"+this.duration+"' loop='"+this.loop+"' interaction='"+this.interaction+"' mode='"+this.mode+"'  style='position: absolute;"+this.coordinate+";overflow: hidden;'>" +
                    "<div style='width:"+w+"px;height:"+h+"px;'>");
            if (this.isReverse.equals("false")) {
                html_sl.append("<img style='position: absolute;-webkit-transform:translate3d(0,0,0);' src='"+this.imgList.get(0)+"'/>");
                for (int i = 1; i < this.imgList.size(); i++) {
                    if(this.direction.equals("x")) {
                        html_sl.append("<img style='position: absolute;-webkit-transform:translate3d("+Math.pow(-1,i)*this.coordinate.geIntWidth()+"px,0,0);' src='"+this.imgList.get(i)+"'/>");
                    }else {
                        html_sl.append("<img style='position: absolute;-webkit-transform:translate3d(0,"+Math.pow(-1,i)*this.coordinate.geIntHeight()+"px,0);' src='"+this.imgList.get(i)+"'/>");
                    }
                }
            } else {
                for (int i = 0; i < this.imgList.size()-1; i++) {
                    if(this.direction.equals("x")) {
                        html_sl.append("<img style='position: absolute;-webkit-transform:translate3d("+Math.pow(-1,i)*this.coordinate.geIntWidth()+"px,0,0);' src='"+this.imgList.get(i)+"'/>");
                    }else {
                        html_sl.append("<img style='position: absolute;-webkit-transform:translate3d(0,"+Math.pow(-1,i)*this.coordinate.geIntHeight()+"px,0);' src='"+this.imgList.get(i)+"'/>");
                    }
                }
                html_sl.append("<img style='position: absolute;-webkit-transform:translate3d(0,0,0);' src='"+this.imgList.get(this.imgList.size()-1)+"'/>");
            }     
        }
        
        html_sl.append("</div></div>");
        return html_sl.toString();
    }
    
    private String genTranString() {
        if (this.isReverse.equals("false")) {
            return "translate3d(0,0,0)";
        } else {
            if (this.direction.equals("x")) {
                Number n=this.coordinate.geIntWidth()*(this.imgList.size()-1);
                return "translate3d(-"+n+"px,0,0)";
            } else {
                Number n=this.coordinate.geIntHeight()*(this.imgList.size()-1);
                return "translate3d(0,-"+n+"px,0)";
            }
        }
    }

    public String getOrientation() {
        return direction;
    }

    public void setOrientation(String orientation) {
        this.direction = orientation;
    }

    public List<String> getImgList() {
        return imgList;
    }

    public void setImgList(List<String> imgList) {
        this.imgList = imgList;
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

    public String getInteraction() {
        return interaction;
    }

    public void setInteraction(String interaction) {
        this.interaction = interaction;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getIsReverse() {
        return isReverse;
    }

    public void setIsReverse(String isReverse) {
        if (isReverse.equals("t")||isReverse.equals("true")) {
            this.isReverse = "true";
        } else {
            this.isReverse = "false";
        }
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
