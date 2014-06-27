

import java.util.ArrayList;
import java.util.List;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import publicClass.*;
import interactions.*;

public class Test {

	public static void main(String[] args) throws Exception {
//	    TestTS();
//	    TestPPT();
//	    TESTNextSlide();
//	    TESTHyperlink();
//	    TESTWebView();
//	    TESTScrollList();
//	    TESTImageContrast();
//	    TestFlip();
//	    TESTLinkageiScroll();
//	    TESTDazzleImg();

//	    TESTCanvasParticle();
//	    TESTCanvasDoodle();
//	     TESTBtn();
//	    TESTAudio();
//	    TESTVideo();
//	    TESTBtnList();
//	    TESTHyperlinkList();
//	    TESTSlice();
	    TESTTBox();
//	    TESTFrameSequence();
//	    TESTToggleDetail();
//	    TEST1();//buttonlist+scrollList
//	    TEST2();//buttonlist+PPT
//	    TEST3();//buttonlist+ImageContrast
//	    TEST4();//buttonlist+Flip
//	    TEST5();//buttonlist+Slice
//	    TEST6();//button+Audio
//	    String aString="nbsp;aaa";
//	    aString=aString.replaceAll("\\$nbsp;", "&nbsp;");
//	    System.out.print(aString);
//	    String aString=formatHTMLString("<div>abc<span>vnhg</span><img hahaha /><div><div>she</div></div></div>");
//	    System.out.print(aString);
	    
//	    yd();
	    
	}
	
	public static void yd() throws Exception {
        String abc="{" +
                "Group1:[" +
                "{'duration':0.5,'imgList':['img/iQI/0.png','img/iQI/1.png','img/iQI/2.png','img/iQI/3.png'],'interval':2,'coordinate':{'height':'718px','width':'72px','left':'756px','top':'100px'},'auto':'false','loop':'false','classType':'PPT','mode':'g'},"+
                "{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'100px'},'classType':'Button','interaction':'0'},"+
                "{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'228px'},'classType':'Button','interaction':'1'},"+
                "{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'371px'},'classType':'Button','interaction':'2'},"+
                "{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'504px'},'classType':'Button','interaction':'3'}"+
                "]"+
                "}";
        System.out.println(abc);
        System.out.println(AutoBuildMagazine.createHtmlText(abc));
    }
	
	public static String formatHTMLString(String htmlString) {
	       StringBuilder returnStringBuilder=new StringBuilder();
	       htmlString=htmlString.replaceAll("(?<!^)\\s*(?=<)", "\n");
	       htmlString=htmlString.replaceAll("(?<=>)\\s*(?=\\S*)", "\n");
	       String[] tString=htmlString.split("\n");
	       int n=1;boolean isTag=false;
	       for (int i = 0; i < tString.length; i++) {
	           String tmp=tString[i];
	           if (tmp.indexOf("</")==-1) {
	               if (tmp.indexOf("<")==-1) {
	                   n+=1;
	                   isTag=false;
	               } else {
	                   if (isTag) {
	                       n+=1;
	                   }
	                   if (tmp.indexOf("/>")==-1) {
	                       isTag=true;
	                   }
	               }
	           } else {
	               n-=1;
	           }
	           for (int j = 0; j < n; j++) {
	               returnStringBuilder.append("\t");
	           }
	           returnStringBuilder.append(tmp);
	           returnStringBuilder.append("\n");
	           
	       }
	       return returnStringBuilder.toString();
	   }
	
	public static void TEST6() throws Exception {
	    String abc="{" +
                "Group1:[" +
                "{'coordinate':{'height':'0px','width':'0px','left':'0px','top':'0px'},'loop':'true','auto':'true','classType':'Audio','src':'img/test.mp3'}," +
                "{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'100px'},'classType':'Button','interaction':'play'}"+
                "]"+
                "}";
        System.out.println(abc);
        System.out.println(AutoBuildMagazine.createHtmlText(abc));
    }
	
	public static void TEST5() throws Exception {
	    String abc="{" +
                "Group1:[" +
                "{'imgList':['img/001.jpg','img/002.jpg','img/003.jpg','img/004.jpg'],'coordinate':{'height':'450px','width':'656px','left':'0px','top':'0px'},'classType':'Slice','mode':'r'}," +
                
                "{'duration':0,'imgList':['img/iQI/0.png','img/iQI/1.png','img/iQI/2.png','img/iQI/3.png'],'coordinate':{'height':'718px','width':'72px','left':'770px','top':'100px'},'auto':'false','loop':'false','classType':'PPT','mode':'n'},"+
                "{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'100px'},'classType':'Button','interaction':'0'},"+
                "{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'228px'},'classType':'Button','interaction':'1'},"+
                "{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'371px'},'classType':'Button','interaction':'2'},"+
                "{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'504px'},'classType':'Button','interaction':'3'}"+
                "]"+
                "}";
        System.out.println(abc);
        System.out.println(AutoBuildMagazine.createHtmlText(abc));
    }
	
	public static void TEST4() throws Exception {
	    String abc="{" +
                "Group1:[" +
                "{'imgList':['img/001.jpg','img/002.jpg','img/003.jpg','img/004.jpg','img/005.jpg','img/006.jpg'],'coordinate':{'height':'450px','width':'384px','left':'10px','top':'10px'},'classType':'Flip','mode':'p'}," +
                "{'imgList':['img/001.jpg','img/002.jpg','img/003.jpg','img/004.jpg','img/005.jpg','img/006.jpg'],'coordinate':{'height':'450px','width':'384px','left':'10px','top':'460px'},'classType':'Flip','mode':'c'}," +
                
                "{'duration':0,'imgList':['img/iQI/0.png','img/iQI/1.png','img/iQI/2.png','img/iQI/3.png'],'coordinate':{'height':'718px','width':'72px','left':'770px','top':'100px'},'auto':'false','loop':'false','classType':'PPT','mode':'n'},"+
                "{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'100px'},'classType':'Button','interaction':'0'},"+
                "{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'228px'},'classType':'Button','interaction':'1'},"+
                "{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'371px'},'classType':'Button','interaction':'2'},"+
                "{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'504px'},'classType':'Button','interaction':'3'}"+
                "]"+
                "}";
        System.out.println(abc);
        System.out.println(AutoBuildMagazine.createHtmlText(abc));
    }
	
	public static void TEST3() throws Exception {
	    String abc="{" +
                "Group1:[" +
                "{'imgList':['img/001.jpg','img/002.jpg'],'coordinate':{'height':'450px','width':'656px','left':'0px','top':'0px'},'direction':'x','classType':'ImageContrast'}," +
                "{'imgList':['img/003.jpg','img/004.jpg'],'coordinate':{'height':'450px','width':'656px','left':'0px','top':'450px'},'direction':'y','classType':'ImageContrast'},"+

                "{'duration':0,'imgList':['img/iQI/0.png','img/iQI/1.png','img/iQI/2.png','img/iQI/3.png'],'coordinate':{'height':'718px','width':'72px','left':'756px','top':'100px'},'auto':'false','loop':'false','classType':'PPT','mode':'n'},"+
                "{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'100px'},'classType':'Button','interaction':'0'},"+
                "{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'228px'},'classType':'Button','interaction':'1'},"+
                "{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'371px'},'classType':'Button','interaction':'2'},"+
                "{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'504px'},'classType':'Button','interaction':'3'}"+
                "]"+
                "}";
        System.out.println(abc);
        System.out.println(AutoBuildMagazine.createHtmlText(abc));
    }
	
	public static void TEST2() throws Exception {
	    String abc="{" +
                "Group1:[" +
                "{'duration':0.5,'imgList':['img/iQI/0.png','img/iQI/1.png','img/iQI/2.png','img/iQI/3.png'],'interval':2,'coordinate':{'height':'718px','width':'72px','left':'756px','top':'100px'},'auto':'false','loop':'false','classType':'PPT','mode':'g'},"+
                "{'duration':0.5,'imgList':['img/001.jpg','img/002.jpg','img/003.jpg','img/004.jpg'],'interval':2,'coordinate':{'height':'450px','width':'656px','left':'10px','top':'10px'},'auto':'false','loop':'false','classType':'PPT','mode':'s','interaction':'c'},"+
                "{'duration':0.5,'imgList':['img/001.jpg','img/002.jpg','img/003.jpg','img/004.jpg'],'interval':2,'coordinate':{'height':'450px','width':'656px','left':'10px','top':'460px'},'auto':'false','loop':'false','classType':'PPT','mode':'f','interaction':'t'},"+
                "{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'100px'},'classType':'Button','interaction':'0'},"+
                "{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'228px'},'classType':'Button','interaction':'1'},"+
                "{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'371px'},'classType':'Button','interaction':'2'},"+
                "{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'504px'},'classType':'Button','interaction':'3'}"+
                "]"+
                "}";
        System.out.println(abc);
        System.out.println(AutoBuildMagazine.createHtmlText(abc));
    }
	
	public static void TEST1() throws Exception {
        String abc="{" +
        		"Group1:[" +
        		"{'duration':0.5,'imgList':['img/iQI/0.png','img/iQI/1.png','img/iQI/2.png','img/iQI/3.png'],'interval':2,'coordinate':{'height':'718px','width':'72px','left':'756px','top':'100px'},'auto':'false','loop':'false','classType':'PPT','mode':'g'},"+
        		"{'direction':'x','imgList':['img/lop1.jpg','img/lop2.jpg','img/lop3.jpg'],'coordinate':{'height':'400px','width':'400px','left':'50px','top':'80px'},'auto':'true','classType':'ScrollList','interaction':'t','mode':'r','isReverse':'false'},"+
        		"{'direction':'y','imgList':['img/lop1.jpg','img/lop2.jpg','img/lop3.jpg'],'coordinate':{'height':'400px','width':'400px','left':'50px','top':'480px'},'auto':'true','classType':'ScrollList','interaction':'t','mode':'r','isReverse':'true'},"+
        		"{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'100px'},'classType':'Button','interaction':'0'},"+
                "{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'228px'},'classType':'Button','interaction':'1'},"+
                "{'coordinate':{'height':'36px','width':'72px','left':'756px','top':'371px'},'classType':'Button','interaction':'2'}"+
        		"]"+
        		"}";
        System.out.println(abc);
        System.out.println(AutoBuildMagazine.createHtmlText(abc));
    }

	public static void TESTBtn() throws Exception {
        JSONObject obj=JSONObject.fromObject(new Object());
        List<Button> abc=new ArrayList<Button>();
        Button s1=new Button();
        s1.setCoordinate(new Coordinate("200px", "200px", "0px", "0px"));
        abc.add(s1);
        
        obj.put("G1", JSONArray.fromObject(abc));
        JSONObject tmp=obj.getJSONArray("G1").getJSONObject(0);
        tmp.put("classType", "Button");
        System.out.println(obj.toString());
        
        System.out.println(AutoBuildMagazine.createHtmlText((obj.toString())));
	}   
	
public static void TESTWebView() throws Exception {
    JSONObject obj=JSONObject.fromObject(new Object());
    List<WebView> abc=new ArrayList<WebView>();
    WebView s1=new WebView();
    s1.setCoordinate(new Coordinate("200px", "200px", "0px", "0px"));
    s1.setImg("img/1.jpg");
    abc.add(s1);
    
    obj.put("G1", JSONArray.fromObject(abc));
    JSONObject tmp=obj.getJSONArray("G1").getJSONObject(0);
    tmp.put("classType", "WebView");
    System.out.println(obj.toString());
    
    System.out.println(AutoBuildMagazine.createHtmlText((obj.toString())));
    }
	
	public static void TESTAudio() throws Exception {
	    JSONObject obj=JSONObject.fromObject(new Object());
        List<Audio> abc=new ArrayList<Audio>();
        Audio s1=new Audio();
        s1.setCoordinate(new Coordinate("0px", "0px", "0px", "0px"));
        s1.setAuto("true");
        s1.setSrc("img/test.mp3");
        abc.add(s1);
        obj.put("G1", JSONArray.fromObject(abc));
        JSONObject tmp=obj.getJSONArray("G1").getJSONObject(0);
        tmp.put("classType", "Audio");
        System.out.println(AutoBuildMagazine.createHtmlText((obj.toString())));
    }  
	
	public static void TESTVideo() throws Exception {
	    JSONObject obj=JSONObject.fromObject(new Object());
        List<Video> abc=new ArrayList<Video>();
        Video s1=new Video();
        s1.setCoordinate(new Coordinate("0px", "0px", "0px", "0px"));
        s1.setSrc("img/xiayu.mp4");
        abc.add(s1);
        obj.put("G1", JSONArray.fromObject(abc));
        JSONObject tmp=obj.getJSONArray("G1").getJSONObject(0);
        tmp.put("classType", "Video");
        System.out.println(tmp.toString());
        
        System.out.println(AutoBuildMagazine.createHtmlText((obj.toString())));
    }  
	
//    public static void TESTBtnList() throws Exception {
//            List<List<ButtonList>> sArrayLists=new ArrayList<List<ButtonList>>();
//            List<ButtonList> abc=new ArrayList<ButtonList>();
//            ButtonList s1=new ButtonList();
//            s1.setCoordinate(new Coordinate("72px", "718px", "756px", "100px"));
//            List<String> l1=new ArrayList<String>();
//            l1.add("img/iQI/0.png");
//            l1.add("img/iQI/1.png");
//            l1.add("img/iQI/2.png");
//            s1.setBgImgList(l1);
//            List<Coordinate> c1=new ArrayList<Coordinate>();
//            c1.add(new Coordinate("72px", "36px", "756px", "100px"));
//            c1.add(new Coordinate("72px", "36px", "756px", "228px"));
//            c1.add(new Coordinate("72px", "36px", "756px", "371px"));
//            s1.setTapCoordinates(c1);
//            abc.add(s1);
//            sArrayLists.add(abc);
//            
//            JSONArray tmp=JSONArray.fromObject(sArrayLists);
//            System.out.println(tmp.toString());
//            JSONArray tArray=tmp.getJSONArray(0);
//            tmp.put("classType", "ButtonList");
//            System.out.println(AutoBuildMagazine.createHtmlText((obj.toString())));
//    }
    
    public static void TESTHyperlinkList() throws Exception {
        JSONObject obj=JSONObject.fromObject(new Object());
        List<HyperlinkList> abc=new ArrayList<HyperlinkList>();
        HyperlinkList s1=new HyperlinkList();
        List<List<HyperLink>> hList=new ArrayList<List<HyperLink>>();
        
        List<HyperLink> l1=new ArrayList<HyperLink>();
        HyperLink h11=new HyperLink();
        h11.setCoordinate(new Coordinate("1", "1", "756px", "100px"));
        h11.setUrl("http://www.163.com");
        HyperLink h12=new HyperLink();
        h12.setCoordinate(new Coordinate("1", "2", "756px", "100px"));
        h12.setUrl("http://www.163.com");
        l1.add(h11);
        l1.add(h12);
        
        List<HyperLink> l2=new ArrayList<HyperLink>();
        HyperLink h21=new HyperLink();
        h21.setCoordinate(new Coordinate("2", "1", "756px", "100px"));
        h21.setUrl("http://www.163.com");
        HyperLink h22=new HyperLink();
        h22.setCoordinate(new Coordinate("2", "2", "756px", "100px"));
        h22.setUrl("http://www.163.com");
        l2.add(h21);
        l2.add(h22);
        
        List<HyperLink> l3=new ArrayList<HyperLink>();
        
        List<HyperLink> l4=new ArrayList<HyperLink>();
        HyperLink h41=new HyperLink();
        h41.setCoordinate(new Coordinate("4", "1", "756px", "100px"));
        h41.setUrl("http://www.163.com");
        l4.add(h41);
        
        hList.add(l1);
        hList.add(l2);
        hList.add(l3);
        hList.add(l4);
        s1.sethList(hList);
        abc.add(s1);
        obj.put("G1", JSONArray.fromObject(abc));
        JSONObject tmp=obj.getJSONArray("G1").getJSONObject(0);
        tmp.put("classType", "HyperlinkList");
        System.out.println(AutoBuildMagazine.createHtmlText((obj.toString())));
        
}
public static void TESTFrameSequence() throws Exception {
    JSONObject obj=JSONObject.fromObject(new Object());
    List<FrameSequence> abc=new ArrayList<FrameSequence>();
    FrameSequence s1=new FrameSequence();
    s1.setCoordinate(new Coordinate("656px", "450px", "100px", "100px"));
    List<String> l1=new ArrayList<String>();
    l1.add("img/XZ_1.jpg");
    l1.add("img/XZ_2.jpg");
    l1.add("img/XZ_3.jpg");
    l1.add("img/XZ_4.jpg");
    l1.add("img/XZ_5.jpg");
    l1.add("img/XZ_6.jpg");
    l1.add("img/XZ_7.jpg");
    l1.add("img/XZ_8.jpg");
    l1.add("img/XZ_9.jpg");
    l1.add("img/XZ_10.jpg");
    l1.add("img/XZ_11.jpg");
    l1.add("img/XZ_12.jpg");
    s1.setImgList(l1);
    abc.add(s1);
    obj.put("G1", JSONArray.fromObject(abc));
    JSONObject tmp=obj.getJSONArray("G1").getJSONObject(0);
    tmp.put("classType", "FrameSequence");
    System.out.println(tmp.toString());
    System.out.println(AutoBuildMagazine.createHtmlText((obj.toString())));
}

    public static void TESTSlice() throws Exception {
        JSONObject obj=JSONObject.fromObject(new Object());
        List<Slice> abc=new ArrayList<Slice>();
        Slice s1=new Slice();
        s1.setCoordinate(new Coordinate("656px", "450px", "100px", "100px"));
        List<String> l1=new ArrayList<String>();
        l1.add("img/001.jpg");
        l1.add("img/002.jpg");
        l1.add("img/003.jpg");
        l1.add("img/004.jpg");
        s1.setImgList(l1);
        s1.setInteraction("t");
        s1.setMode("r");
        s1.setAuto("t");
        abc.add(s1);
        obj.put("G1", JSONArray.fromObject(abc));
        JSONObject tmp=obj.getJSONArray("G1").getJSONObject(0);
        tmp.put("classType", "Slice");
        System.out.println(obj.toString());
        System.out.println(AutoBuildMagazine.createHtmlText((obj.toString())));
}

    public static void TESTScrollList() throws Exception {
        JSONObject obj=JSONObject.fromObject(new Object());
            List<ScrollList> abc=new ArrayList<ScrollList>();
            ScrollList s1=new ScrollList();
            s1.setCoordinate(new Coordinate("400px", "400px", "50px", "80px"));
            List<String> l1=new ArrayList<String>();
            l1.add("img/lop1.jpg");
            l1.add("img/lop2.jpg");
            l1.add("img/lop3.jpg");
            s1.setImgList(l1);
            s1.setOrientation("x");
            s1.setAuto("false");
            s1.setInteraction("t");
            s1.setMode("r");
            s1.setIsReverse("t");
            abc.add(s1);
            obj.put("G1", JSONArray.fromObject(abc));
            JSONObject tmp=obj.getJSONArray("G1").getJSONObject(0);
            tmp.put("classType", "ScrollList");
            System.out.println(tmp.toString());
            System.out.println(AutoBuildMagazine.createHtmlText((obj.toString())));
    }

    public static void TestPPT() throws Exception {
        JSONObject obj=JSONObject.fromObject(new Object());
        List<PPT> abc=new ArrayList<PPT>();
        PPT p1=new PPT();
        p1.setCoordinate(new Coordinate("656px", "450px", "10px", "10px"));
        p1.setLoop("false");
        p1.setMode("s");
        List<String> imgs1=new ArrayList<String>();
        String img11="img/001.jpg",img12="img/002.jpg",img13="img/003.jpg",img14="img/004.jpg",img15="img/005.jpg",img16="img/006.jpg";
        imgs1.add(img11);
        imgs1.add(img12);
        imgs1.add(img13);
        imgs1.add(img14);
        imgs1.add(img15);
        imgs1.add(img16);
        p1.setImgList(imgs1);
        abc.add(p1);
        obj.put("G1", JSONArray.fromObject(abc));
        JSONObject tmp=obj.getJSONArray("G1").getJSONObject(0);
        tmp.put("classType", "PPT");
        System.out.println(AutoBuildMagazine.createHtmlText((obj.toString())));
    }
    
    public static void TESTToggleDetail() throws Exception {
        JSONObject obj=JSONObject.fromObject(new Object());
        List<ToggleDetail> abc=new ArrayList<ToggleDetail>();
        ToggleDetail p1=new ToggleDetail();
        p1.setCoordinate(new Coordinate("768px", "1024px", "0px", "0px"));
        List<String> imgs1=new ArrayList<String>();
        String img11="img/view.jpg",img12="img/bg2.jpg";
        imgs1.add(img11);
        imgs1.add(img12);
        p1.setImgList(imgs1);
        abc.add(p1);
        obj.put("G1", JSONArray.fromObject(abc));
        JSONObject tmp=obj.getJSONArray("G1").getJSONObject(0);
        tmp.put("classType", "ToggleDetail");
        System.out.println(tmp.toString());
        System.out.println(AutoBuildMagazine.createHtmlText((obj.toString())));
    }
    
public static void TESTImageContrast() throws Exception {
    JSONObject obj=JSONObject.fromObject(new Object());
        List<ImageContrast> abc=new ArrayList<ImageContrast>();
        ImageContrast i1=new ImageContrast();
        i1.setCoordinate(new Coordinate("656px","450px", "0px", "0px"));
        List<String> l1=new ArrayList<String>();
        l1.add("img/001.jpg");
        l1.add("img/002.jpg");
        i1.setImgList(l1);
        abc.add(i1);
        obj.put("G1", JSONArray.fromObject(abc));
        JSONObject tmp=obj.getJSONArray("G1").getJSONObject(0);
        tmp.put("classType", "ImageContrast");
        System.out.println(AutoBuildMagazine.createHtmlText((obj.toString())));
    }

    public static void TestFlip() throws Exception {
        JSONObject obj=JSONObject.fromObject(new Object());
        List<Flip> abc=new ArrayList<Flip>();
        Flip f1=new Flip();
        f1.setCoordinate(new Coordinate( "768px", "450px","40px", "20px"));
        f1.setMode("p");
        List<String> l1=new ArrayList<String>();
        l1.add("img/001.jpg");
        l1.add("img/002.jpg");
        l1.add("img/003.jpg");
        l1.add("img/004.jpg");
        l1.add("img/005.jpg");
        l1.add("img/006.jpg");
        f1.setImgList(l1);
        abc.add(f1);
        
        obj.put("G1", JSONArray.fromObject(abc));
        JSONObject tmp=obj.getJSONArray("G1").getJSONObject(0);
        tmp.put("classType", "Flip");
        System.out.println(AutoBuildMagazine.createHtmlText((obj.toString())));
    }
    
    public static void TESTCanvasParticle() throws Exception{
        JSONObject obj=JSONObject.fromObject(new Object());
        List<CanvasParticle> abc=new ArrayList<CanvasParticle>();
        CanvasParticle h1=new CanvasParticle();
        h1.setCoordinate(new Coordinate("400px","400px","100px","100px"));
        h1.setImgSrc("img/w.png");
        h1.setMode("g");
        abc.add(h1);
        obj.put("G1", JSONArray.fromObject(abc));
        JSONObject tmp=obj.getJSONArray("G1").getJSONObject(0);
        tmp.put("classType", "CanvasParticle");
        System.out.println(AutoBuildMagazine.createHtmlText((obj.toString())));
    }
    
    public static void TESTCanvasDoodle() throws Exception {
        JSONObject obj=JSONObject.fromObject(new Object());
        List<CanvasDoodle> abc=new ArrayList<CanvasDoodle>();
        CanvasDoodle h1=new CanvasDoodle();
        h1.setCoordinate(new Coordinate("656px","450px","100px","100px"));
        h1.setImgSrc("img/001.jpg");
        h1.setTextureSrc("img/002.jpg");
        abc.add(h1);
        obj.put("G1", JSONArray.fromObject(abc));
        JSONObject tmp=obj.getJSONArray("G1").getJSONObject(0);
        tmp.put("classType", "CanvasDoodle");
        System.out.println(AutoBuildMagazine.createHtmlText((obj.toString())));
    }
    
    public static void TESTTBox() throws Exception {
        JSONObject obj=JSONObject.fromObject(new Object());
        List<TDBox> abc=new ArrayList<TDBox>();
        TDBox s1=new TDBox();
        s1.setCoordinate(new Coordinate("768px", "1024px", "0px", "0px"));
        s1.setFullScreen("true");
        s1.setImgWidth(768);
        List<String> l1=new ArrayList<String>();
        l1.add("img/box1.jpg");
        l1.add("img/box2.jpg");
        l1.add("img/box3.jpg");
        l1.add("img/box4.jpg");
        l1.add("img/box5.jpg");
        l1.add("img/box6.jpg");
        s1.setImgList(l1);
        abc.add(s1);
        obj.put("G1", JSONArray.fromObject(abc));
        JSONObject tmp=obj.getJSONArray("G1").getJSONObject(0);
        tmp.put("classType", "TDBox");
        System.out.println(AutoBuildMagazine.createHtmlText((obj.toString())));
    }
    public static void TESTLinkageiScroll() throws Exception {
        JSONObject obj=JSONObject.fromObject(new Object());
        List<LinkageiScroll> abc=new ArrayList<LinkageiScroll>();
        LinkageiScroll i1=new LinkageiScroll();
        List<Coordinate> c1=new ArrayList<Coordinate>();
        c1.add(new Coordinate("100px", "300px", "10px", "10px"));
        c1.add(new Coordinate("100px", "300px", "110px", "10px"));
        c1.add(new Coordinate("100px", "300px", "210px", "10px"));
        i1.setCoordinateList(c1);
        List<String> l1=new ArrayList<String>();
        l1.add("img/l2.jpg");
        l1.add("img/l1.jpg");
        l1.add("img/nrb2.jpg");
        i1.setImgList(l1);
        abc.add(i1);
        
        obj.put("G1", JSONArray.fromObject(abc));
        JSONObject tmp=obj.getJSONArray("G1").getJSONObject(0);
        tmp.put("classType", "LinkageiScroll");
        System.out.println(AutoBuildMagazine.createHtmlText((obj.toString())));
    }
//	
//	public static void TESTReverseScroll() {
//        List<ReverseScroll> abc=new ArrayList<ReverseScroll>();
//        ReverseScroll r1=new ReverseScroll();
//        List<Coordinate> l1=new ArrayList<Coordinate>();
//        l1.add(new Coordinate("200px","200px","0px","100px"));
//        l1.add(new Coordinate("200px","200px","200px","100px"));
//        l1.add(new Coordinate("200px","200px","400px","100px"));
//        r1.setCoordinateList(l1);
//        List<String> imgs1=new ArrayList<String>();
//        String img11="img/1.jpg",img12="img/2.jpg",img13="img/3.jpg";
//        imgs1.add(img11);
//        imgs1.add(img12);
//        imgs1.add(img13);
//        r1.setImgList(imgs1);
//        r1.setDirection("y");
//        r1.setMax(1600);
//        abc.add(r1);
//        
//        ReverseScroll r2=new ReverseScroll();
//        List<Coordinate> l2=new ArrayList<Coordinate>();
//        l2.add(new Coordinate("200px","200px","200px","100px"));
//        l2.add(new Coordinate("200px","200px","200px","300px"));
//        l2.add(new Coordinate("200px","200px","200px","500px"));
//        r2.setCoordinateList(l2);
//        List<String> imgs2=new ArrayList<String>();
//        imgs2.add(img11);
//        imgs2.add(img12);
//        imgs2.add(img13);
//        r2.setImgList(imgs2);
//        r2.setDirection("x");
//        r2.setMax(1600);
//        abc.add(r2);
//        
//        System.out.println(JSONArray.fromObject(abc).toString());
//        System.out.println(ant_newMode.handleReverseScroll(((JSONArray.fromObject(abc).toString()))));
//    }
//	
	
//	
	
//	
//	public static void TESTDazzleImg() {
//        
//        List<DazzleImg> abc=new ArrayList<DazzleImg>();
//        DazzleImg s1=new DazzleImg();
//        s1.setC_start(new Coordinate("1px", "2px", "3px", "4px"));
//        s1.setC_end(new Coordinate("10px", "20px", "30px", "40px"));
//        s1.setImg("img/1.jpg");
//        abc.add(s1);
//        
//        DazzleImg s2=new DazzleImg();
//        s2.setC_start(new Coordinate("12px", "22px", "32px", "24px"));
//        s2.setC_end(new Coordinate("120px", "220px", "320px", "420px"));
//        s2.setImg("img/22.jpg");
//        abc.add(s2);
//        
//        System.out.println(JSONArray.fromObject(abc).toString());
//        System.out.println(ant_newMode.handleDazzleImg((JSONArray.fromObject(abc).toString())));
//    }
//	
//	public static void TESTHyperlink() {
//        List<Hyperlink> abc=new ArrayList<Hyperlink>();
//        Hyperlink h1=new Hyperlink();
//        h1.setCoordinate(new Coordinate("10px","20px","30px","40px"));
//        h1.setUrl("http://www.163.com");
//        abc.add(h1);
//        
//        Hyperlink h2=new Hyperlink();
//        h2.setCoordinate(new Coordinate("1px","2px","3px","4px"));
//        h2.setUrl("http://www.baidu.com");
//        abc.add(h2);
//        
//        System.out.println(JSONArray.fromObject(abc).toString());
//        System.out.println(ant_newMode.handleHyperlink(((JSONArray.fromObject(abc).toString()))));
//    }
//	
//public static void TESTLinkageiScroll() {
//        
//        List<LinkageiScroll> abc=new ArrayList<LinkageiScroll>();
//        LinkageiScroll i1=new LinkageiScroll();
//        List<Coordinate> c1=new ArrayList<Coordinate>();
//        c1.add(new Coordinate("200px", "600px", "0px", "0px"));
//        c1.add(new Coordinate("200px", "600px", "200px", "0px"));
//        c1.add(new Coordinate("200px", "600px", "400px", "0px"));
//        i1.setCoordinateList(c1);
//        List<String> l1=new ArrayList<String>();
//        l1.add("img/l2.jpg");
//        l1.add("img/l1.jpg");
//        l1.add("img/nrb2.jpg");
//        i1.setImgList(l1);
//        abc.add(i1);
//        
//        LinkageiScroll i2=new LinkageiScroll();
//        i2.setOrientation("x");
//        List<Coordinate> c2=new ArrayList<Coordinate>();
//        c2.add(new Coordinate("600px", "200px", "0px", "610px"));
//        c2.add(new Coordinate("600px", "200px", "0px", "810px"));
//        c2.add(new Coordinate("600px", "200px", "0px", "1010px"));
//        i2.setCoordinateList(c2);
//        List<String> l2=new ArrayList<String>();
//        l2.add("img/l2r.jpg");
//        l2.add("img/l1r.jpg");
//        l2.add("img/nrb2r.jpg");
//        i2.setImgList(l2);
//        abc.add(i2);
//        
//        System.out.println(JSONArray.fromObject(abc).toString());
//        System.out.println(ant_newMode.handleLinkageiScroll(((JSONArray.fromObject(abc).toString()))));
//    }
//	
	
//	
    
//	
//public static void TESTCST() {
//        
//        List<CScrollTarget> abc=new ArrayList<CScrollTarget>();
//        CScrollTarget s1=new CScrollTarget();
//        s1.setImgCoordinate(new Coordinate("400px", "400px", "50px", "80px"));
//        List<String> l1=new ArrayList<String>();
//        l1.add("img/p8MCNVEO0/i8MCNVEPQ/0.png");
//        l1.add("img/p8MCNVEO0/i8MCNVEPQ/1.png");
//        l1.add("img/p8MCNVEO0/i8MCNVEPQ/2.png");
//        s1.setTapList(l1);
//        s1.setMax(1600);
//        s1.setOrientation("x");
//        s1.setTapImgCoordinate(new Coordinate("400px", "20px", "50px", "480px"));
//        List<Coordinate> c1=new ArrayList<Coordinate>();
//        c1.add(new Coordinate("20px", "20px", "50px", "480px"));
//        c1.add(new Coordinate("20px", "20px", "100px", "480px"));
//        c1.add(new Coordinate("20px", "20px", "150px", "480px"));
//        s1.setTapCoordinates(c1);
//        s1.setImg("img/ls-1.JPG");
//        abc.add(s1);
//        
//        System.out.println(JSONArray.fromObject(abc).toString());
//        System.out.println(ant_newMode.handleCScrollTarget((JSONArray.fromObject(abc).toString())));
//    }
//	
//	public static void TESTWebView() {
//	    
//	    List<WebView> abc=new ArrayList<WebView>();
//        WebView w1=new WebView();
//        w1.setCoordinate(new Coordinate("1px", "2px", "3px", "4px"));
//        w1.setImg("img/1.jpg");
//        abc.add(w1);
//        
//        WebView w2=new WebView();
//        w2.setCoordinate(new Coordinate("11px", "12px", "13px", "14px"));
//        w2.setImg("img/2.jpg");
//        abc.add(w2);
//        
//        System.out.println(JSONArray.fromObject(abc).toString());
//        System.out.println(ant_newMode.handleWebView((JSONArray.fromObject(abc).toString())));
//    }
//	
//	public static void TESTNextSlide() {
//        List<NextSlide> abc=new ArrayList<NextSlide>();
//        NextSlide n1=new NextSlide();
//        n1.setCoordinate(new Coordinate("1px", "2px", "3px", "4px"));
//        NextSlideButton b1=new NextSlideButton();
//        b1.setCoordinate(new Coordinate("3px", "4px", "5px", "6px"));
//        b1.setTarget("img/1.jpg");
//        n1.setButton(b1);
//        abc.add(n1);
//        
//        NextSlide n2=new NextSlide();
//        n2.setCoordinate(new Coordinate("11px", "12px", "13px", "14px"));
//        NextSlideButton b2=new NextSlideButton();
//        b2.setCoordinate(new Coordinate("13px", "14px", "15px", "16px"));
//        b2.setTarget("img/11.jpg");
//        n2.setButton(b2);
//        abc.add(n2);
//        
//        System.out.println(JSONArray.fromObject(abc).toString());
//        System.out.println(ant_newMode.handleNextSlide((JSONArray.fromObject(abc).toString())));
//    }
//	
	
//	
//	public static void TestTS() {
//	    List<TargetSlide> abc = new ArrayList<TargetSlide>();
//        TargetSlide targetslide = new TargetSlide();
//        targetslide.setCoordinate(new Coordinate("1px", "2px", "3px", "4px"));
//        targetslide.setMode("g");
//        
//        List<TargetButtonXML> buttons = new ArrayList<TargetButtonXML>();
//        TargetButtonXML b1 = new TargetButtonXML();
//        b1.setCoordinate(new Coordinate("5px", "6px", "7px", "8px"));
//        b1.setTarget("/img/rw.jpg");
//        List<Hyperlink> hyperlinks1 = new ArrayList<Hyperlink>();
//        Hyperlink h11 = new Hyperlink();
//        h11.setCoordinate(new Coordinate("10px", "10px", "10px", "10px"));
//        h11.setUrl("baidu");
//        hyperlinks1.add(h11);
//        
//        Hyperlink h12 = new Hyperlink();
//        h12.setCoordinate(new Coordinate("20px", "20px", "30px", "20px"));
//        h12.setUrl("sina");
//        hyperlinks1.add(h12);
//        
//        b1.setHyperlinks(hyperlinks1);
//        buttons.add(b1);
//        targetslide.setButtons(buttons);
//        
//        TargetButtonXML b2 = new TargetButtonXML();
//        b2.setCoordinate(new Coordinate("50px", "60px", "70px", "80px"));
//        b2.setTarget("/img/xz.jpg");
//        List<Hyperlink> hyperlinks2 = new ArrayList<Hyperlink>();
//        Hyperlink h21 = new Hyperlink();
//        h21.setCoordinate(new Coordinate("10px", "10px", "10px", "10px"));
//        h21.setUrl("163");
//        hyperlinks2.add(h21);
//        b2.setHyperlinks(hyperlinks2);
//        buttons.add(b2);
//        
//        TargetButtonXML b3 = new TargetButtonXML();
//        b3.setCoordinate(new Coordinate("1px", "20px", "1px", "1px"));
//        b3.setTarget("/img/nrb.jpg");
//        buttons.add(b3);
//        
//        targetslide.setButtons(buttons);
//        
//        TargetSlide targetslide1 = new TargetSlide();
//        targetslide1.setCoordinate(new Coordinate("1px", "2px", "3px", "4px"));
//        targetslide1.setMode("n");
//        
//        List<TargetButtonXML> buttons1 = new ArrayList<TargetButtonXML>();
//        TargetButtonXML b11 = new TargetButtonXML();
//        b11.setCoordinate(new Coordinate("5px", "6px", "7px", "8px"));
//        b11.setTarget("/img/qg.jpg");
//        List<Hyperlink> hyperlinks11 = new ArrayList<Hyperlink>();
//        Hyperlink h111 = new Hyperlink();
//        h111.setCoordinate(new Coordinate("10px", "10px", "10px", "10px"));
//        h111.setUrl("ssss");
//        hyperlinks11.add(h111);
//        
//        Hyperlink h112 = new Hyperlink();
//        h112.setCoordinate(new Coordinate("20px", "20px", "30px", "20px"));
//        h112.setUrl("ddd");
//        hyperlinks11.add(h112);
//        
//        b11.setHyperlinks(hyperlinks11);
//        buttons1.add(b11);
//        targetslide1.setButtons(buttons1);
//        
//        TargetButtonXML b12 = new TargetButtonXML();
//        b12.setCoordinate(new Coordinate("50px", "60px", "70px", "80px"));
//        b12.setTarget("/img/bc.jpg");
//        List<Hyperlink> hyperlinks12 = new ArrayList<Hyperlink>();
//        Hyperlink h121 = new Hyperlink();
//        h121.setCoordinate(new Coordinate("10px", "10px", "10px", "10px"));
//        h121.setUrl("eeeeeee");
//        hyperlinks12.add(h121);
//        b12.setHyperlinks(hyperlinks12);
//        buttons1.add(b12);
//        
//        TargetButtonXML b13 = new TargetButtonXML();
//        b13.setCoordinate(new Coordinate("1px", "20px", "1px", "1px"));
//        b13.setTarget("/img/fm.jpg");
//        buttons1.add(b13);
//        
//        targetslide1.setButtons(buttons1);
//        
//        try {
//            abc.add(targetslide);
//            abc.add(targetslide1);
//            System.out.println(JSONArray.fromObject(abc).toString());
////            System.out.println(ant_newMode.handleTargetSlide(JSONArray.fromObject(abc).toString()));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

}
