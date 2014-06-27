package interactions;


public class CanvasDoodle extends Interaction {
    private String imgSrc="";
    private String textureSrc="";
    public CanvasDoodle() {
        // TODO Auto-generated constructor stub
    }

    public String generateInteraction(String group) {
        StringBuilder html_cd=new StringBuilder();
//        int width=0,height=0;
//        char[] ch=this.coordinate.getWidth().toCharArray();
//        StringBuilder sb=new StringBuilder();
//        for (int i = 0; i < ch.length; i++) {
//            if (ch[i]>='0'&&ch[i]<='9') {
//                sb.append(ch[i]);
//            }
//        }
//        width=Integer.parseInt(sb.toString());
//        
//        ch=this.coordinate.getHeight().toCharArray();
//        sb=new StringBuilder();
//        for (int i = 0; i < ch.length; i++) {
//            if (ch[i]>='0'&&ch[i]<='9') {
//                sb.append(ch[i]);
//            }
//        }
//        height=Integer.parseInt(sb.toString());
        html_cd.append("<canvas class='CanvasDoodle _forbidClientBar' group='"+group+"' texSrc='"+this.textureSrc+"'  imgSrc='"+this.imgSrc+"' width='"+this.coordinate.geIntWidth()+"' height='"+this.coordinate.geIntHeight()+"' style='position:absolute;"+this.coordinate.toString()+"'></canvas>");
        
        return html_cd.toString();
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getTextureSrc() {
        return textureSrc;
    }

    public void setTextureSrc(String textureSrc) {
        this.textureSrc = textureSrc;
    }
}
