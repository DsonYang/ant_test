package publicClass;

/**
 * 坐标公共类
 * @author yangde
 *
 */

public class Coordinate {

    /**
     * @param args
     */
    private String width;
    private String height;
    private String left;
    private String top;

    public Coordinate() {
        this.width = "0px";
        this.height = "0px";
        this.left = "0px";
        this.top = "0px";
    }

    /**
     * @param width
     * @param height
     * @param left
     * @param top
     */
    public Coordinate(String width, String height, String left, String top) {
        this.width = width;
        this.height = height;
        this.left = left;
        this.top = top;
    }

    public String getWidth() {
        return width;
    }
    
    public int geIntWidth() {
        return stringToInt(this.width);
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }
    
    public int geIntHeight() {
        return stringToInt(this.height);
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getLeft() {
        return left;
    }
    
    public int geIntLeft() {
        return stringToInt(this.left);
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public String getTop() {
        return top;
    }
    
    public int geIntTop() {
        return stringToInt(this.top);
    }

    public void setTop(String top) {
        this.top = top;
    }

    @Override
    public String toString() {
        return "width:" + width + "; height:" + height + "; left:" + left + "; top:" + top + ";";
    }
    
private int stringToInt(String s) {
        
        char[] ch=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]>='0'&&ch[i]<='9') {
                sb.append(ch[i]);
            }
        }
        return Integer.parseInt(sb.toString());
    }

}
