package interactions;


import java.util.ArrayList;
import java.util.List;

import publicClass.Coordinate;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


public class LinkageiScroll extends Interaction {
    private String direction="y";//滑动方向 x表示水平，y表示垂直方向
    private List<Coordinate> coordinateList;//图片坐标序列，坐标与imgList中图片序列对应，如第一个coordinate对应第一张img，依次类推
    private List<String> imgList;//图片地址序列
    public LinkageiScroll() {
        // TODO Auto-generated constructor stub
    }

    public String generateInteraction(String group) {
        int x=1000,y=1000,w=0,h=0;
        JSONArray cList = JSONArray.fromObject(this.coordinateList);
        List<Coordinate> cs = new ArrayList<Coordinate>();
        if (cList.size() > 0) {
            for (int i = 0; i < cList.size(); i++) {
                cs.add((Coordinate) JSONObject.toBean(cList.getJSONObject(i), Coordinate.class));
            }
        }
        for (int k = 0; k < cs.size(); k++) {
//            System.out.println(cs.get(k).toString());
            Coordinate c=cs.get(k);
            int cw=c.geIntWidth();
            int ch=c.geIntHeight();
            int cx=c.geIntLeft();
            int cy=c.geIntTop();
            x=Math.min(x,cx);
            y=Math.min(y,cy);
            if (this.direction.equals("x")) {
                w=cw;
                h+=ch;
            }
            else {
                w+=cw;
                h=ch;
            }
        }
        String style="left:"+x+"px;"+"top:"+y+"px;"+"width:"+w+"px;"+"height:"+h+"px;";
        StringBuilder ls_div=new StringBuilder();
        ls_div.append("<div class='LinkageiScroll _forbidClientBar' style='position:absolute;"+style+"overflow:hidden;' ");
        if (this.direction.equals("x")) {
            ls_div.append("direction='x'>");
        }
        else {
            ls_div.append("direction='y'>");
        }
        for(int j=0;j<this.imgList.size();j++)
        {
            int t=cs.get(j).geIntTop()-y;
            int l=cs.get(j).geIntLeft()-x;
            ls_div.append("<img src='"+imgList.get(j)+"' style='position:absolute;left:"+l+"px;top:"+t+"px;'/>");
        }
        
        ls_div.append("</div>");
        return ls_div.toString();
        
        
    }

    public String getOrientation() {
        return direction;
    }

    public void setOrientation(String orientation) {
        this.direction = orientation;
    }

    public List<Coordinate> getCoordinateList() {
        return coordinateList;
    }

    public void setCoordinateList(List<Coordinate> coordinateList) {
        this.coordinateList = coordinateList;
    }

    public List<String> getImgList() {
        return imgList;
    }

    public void setImgList(List<String> imgList) {
        this.imgList = imgList;
    }
}
