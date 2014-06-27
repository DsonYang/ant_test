package interactions;



import java.util.ArrayList;
import java.util.List;



public class Slice extends Interaction {
    private String loop;
    private List<String> imgList;
    private Double interval;
    private String mode;//"n"
    private String auto;
    private String interaction;//"n"(none)  "c"(click)
    private int sh;
    private int sw;
    
    public Slice() {
        this.loop="false";
        this.imgList=new ArrayList<String>();
        this.interval=2.0;
        this.sw=100;
        this.sh=100;
        this.mode="g";//r(random) d(Diagonal) s(sequence)
        this.auto="false";
        this.interaction="c";//c (click)  n(none)
    }

    public String generateInteraction(String group) {
        int width=this.coordinate.geIntWidth();
        int height=this.coordinate.geIntHeight();
        float nw=(float) width/this.sw;
        float nh=(float) height/this.sh;
         int sRow=(int) Math.ceil(nh);
         int sCol=(int) Math.ceil(nw);
        int Nw=(int) nw;
        nw=nw-Nw;
        int Nh=(int) nh;
        nh=nh-Nh;
        String il=this.imgList.toString();
        StringBuilder html_slice=new StringBuilder();//
        html_slice.append("<div class='Slice _forbidClientBar'  group='"+group+"' auto='"+this.auto+"' loop='"+this.loop+"' interaction='"+this.interaction+"' interval='"+this.interval+"'  sRow='"+sRow+"' sCol='"+sCol+"' mode='"+this.mode+"' " +
                "imgList='"+il.substring(1, il.length()-1)+"'  style='position:absolute;;"+this.coordinate.toString()+";overflow:hidden; z-index:100;-webkit-transform-style: preserve-3d;-webkit-perspective: 500px;'>");
        for (int i = 0; i < Nh; i++) {
            for (int j = 0; j < Nw; j++) {
                html_slice.append("<span style='width:"+this.sw+"px; height: "+this.sh+"px;position: absolute;left:"+(j*this.sw)+"px;top:"+(i*this.sh)+"px;background: url("+this.imgList.get(0)+") -"+(j*this.sw)+"px -"+(i*this.sh)+"px no-repeat;-webkit-transform:rotateX(0);-webkit-backface-visibility: hidden;-webkit-transition: -webkit-transform 0.5s;'></span>");
                html_slice.append("<span style='width:"+this.sw+"px; height: "+this.sh+"px;position: absolute;left:"+(j*this.sw)+"px;top:"+(i*this.sh)+"px;background: url("+this.imgList.get(1)+") -"+(j*this.sw)+"px -"+(i*this.sh)+"px no-repeat;-webkit-transform:rotateX(180deg);-webkit-backface-visibility: hidden;-webkit-transition: -webkit-transform 0.5s;'></span>");
            }
            if (nw!=0) {
                 int w=(int) (this.sw*nw);
                html_slice.append("<span style='width:"+w+"px; height: "+this.sh+"px;position: absolute;left:"+(Nw*this.sw)+"px;top:"+(i*this.sh)+"px;background: url("+this.imgList.get(0)+") -"+(Nw*this.sw)+"px -"+(i*this.sh)+"px no-repeat;-webkit-transform:rotateX(0);-webkit-backface-visibility: hidden;-webkit-transition: -webkit-transform 0.5s;'></span>");
                html_slice.append("<span style='width:"+w+"px; height: "+this.sh+"px;position: absolute;left:"+(Nw*this.sw)+"px;top:"+(i*this.sh)+"px;background: url("+this.imgList.get(1)+") -"+(Nw*this.sw)+"px -"+(i*this.sh)+"px no-repeat;-webkit-transform:rotateX(180deg);-webkit-backface-visibility: hidden;-webkit-transition: -webkit-transform 0.5s;'></span>");
                
            }
        }
        if (nh!=0) {
            int h=(int) (this.sh*nh);
            for (int j = 0; j < Nw; j++) {
                html_slice.append("<span style='width:"+this.sw+"px; height: "+h+"px;position: absolute;left:"+(j*this.sw)+"px;top:"+(Nh*this.sh)+"px;background: url("+this.imgList.get(0)+") -"+(j*this.sw)+"px -"+(Nh*this.sh)+"px no-repeat;-webkit-transform:rotateX(0);-webkit-backface-visibility: hidden;-webkit-transition: -webkit-transform 0.5s;'></span>");
                html_slice.append("<span style='width:"+this.sw+"px; height: "+h+"px;position: absolute;left:"+(j*this.sw)+"px;top:"+(Nh*this.sh)+"px;background: url("+this.imgList.get(1)+") -"+(j*this.sw)+"px -"+(Nh*this.sh)+"px no-repeat;-webkit-transform:rotateX(180deg);-webkit-backface-visibility: hidden;-webkit-transition: -webkit-transform 0.5s;'></span>");
            }
            if (nw!=0) {
                 int w=(int) (this.sw*nw);
                html_slice.append("<span style='width:"+w+"px; height: "+h+"px;position: absolute;left:"+(Nw*this.sw)+"px;top:"+(Nh*this.sh)+"px;background: url("+this.imgList.get(0)+") -"+(Nw*this.sw)+"px -"+(Nh*this.sh)+"px no-repeat;-webkit-transform:rotateX(0);-webkit-backface-visibility: hidden;-webkit-transition: -webkit-transform 0.5s;'></span>");
                html_slice.append("<span style='width:"+w+"px; height: "+h+"px;position: absolute;left:"+(Nw*this.sw)+"px;top:"+(Nh*this.sh)+"px;background: url("+this.imgList.get(1)+") -"+(Nw*this.sw)+"px -"+(Nh*this.sh)+"px no-repeat;-webkit-transform:rotateX(180deg);-webkit-backface-visibility: hidden;-webkit-transition: -webkit-transform 0.5s;'></span>");
                
            }
        }
        html_slice.append("</div>");
        return html_slice.toString();
    }

    public String getLoop() {
        return loop;
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

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getAuto() {
        return auto;
    }

    public void setLoop(String loop) {
        if (loop.equals("t")||loop.equals("true")) {
            this.loop = "true";
        } else {
            this.loop = "false";
        }
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

    public int getSh() {
        return sh;
    }

    public void setSh(int sh) {
        this.sh = sh;
    }

    public int getSw() {
        return sw;
    }

    public void setSw(int sw) {
        this.sw = sw;
    }
}
