package interactions;

import java.util.List;

import net.sf.json.JSONObject;


public class HyperlinkList extends Interaction {
    private List<List<HyperLink>> hList;
    
    public List<List<HyperLink>> gethList() {
        return hList;
    }
    public void sethList(List<List<HyperLink>> hList) {
        this.hList = hList;
    }
    public HyperlinkList() {
        // TODO Auto-generated constructor stub
    }
    public String generateInteraction(String group) {
        StringBuilder html_hlist=new StringBuilder();
        html_hlist.append("<div class='HyperlinkList' group='"+group+"' >");
        for (int i = 0; i < hList.size(); i++) {
            if (i==0) {
                html_hlist.append("<div style='display:block;'>");
            } else {
                html_hlist.append("<div style='display:none;'>");
            }
            List<HyperLink> hi=hList.get(i);
            for (int j = 0; j < hi.size(); j++) {
                HyperLink hyperlink = (HyperLink) JSONObject.toBean(JSONObject.fromObject(hi.get(j)),
                        HyperLink.class);
                html_hlist.append(hyperlink.generateInteraction(""));
            }
            html_hlist.append("</div>");
        }
        html_hlist.append("</div>");
        return html_hlist.toString();
    }
}
