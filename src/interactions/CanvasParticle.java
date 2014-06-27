package interactions;


public class CanvasParticle extends Interaction {
    private String imgSrc="";//图片地址
    private String mode="v";//变化方式
    private String gesture="true";// 是否支持手势
    public CanvasParticle() {
        // TODO Auto-generated constructor stub
    }
    public String generateInteraction(String group) {
        StringBuilder html_cp=new StringBuilder();
        int width=this.coordinate.geIntWidth(),height=this.coordinate.geIntHeight();
        String ct="";
        if (this.mode.equals("v")) {
            ct="CanvasParticleV";
        } else {
            ct="CanvasParticleG";
        }
        html_cp.append("<canvas class='"+ct+" _forbidClientBar' group='"+group+"' isGesture='"+this.gesture+"'  imgSrc='"+this.imgSrc+"' width="+width+" height="+height+" style='position:absolute;"+this.coordinate.toString()+"'></canvas>");
        
        return html_cp.toString();
    }
    public String getImgSrc() {
        return imgSrc;
    }
    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }
    public String getMode() {
        return mode;
    }
    public void setMode(String mode) {
        this.mode = mode;
    }
    public String getGesture() {
        return gesture;
    }
    public void setGesture(String gesture) {
        if (gesture.equals("t")||gesture.equals("true")) {
            this.gesture = "true";
        } else {
            this.gesture = "false";
        }
        
    }
}
