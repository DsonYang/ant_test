//import java.io.BufferedReader;
import interactions.Interaction;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

import publicClass.Coordinate;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


 public class AutoBuildMagazine {
     static ArrayList<String> libs=new ArrayList<String>();
     static Boolean isLibIn=false;
	public static void main(String[] args) {
		//args[]:TargetSlide,NextSlide,PPT,WebView,HyperLink...
		try{
		    
		    StringBuilder html_temp=new StringBuilder();
		    html_temp.append(" ");
		    if(!args[1].equals("{}"))
		    {
		        html_temp.append(createHtmlText(args[1]));
		    }
	        
        	String tmpdir=args[0].toString()+"/temp.txt";
        	
	        File nf = new File(tmpdir);
	        FileWriter fw=new FileWriter(nf);
	        fw.write(html_temp.toString());
	        fw.close();
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			  }
	}
	
	public static String createHtmlText(String arg) throws Exception {
	    StringBuilder HtmlText=new StringBuilder();
	    StringBuilder interSpan=new StringBuilder();
	    interSpan.append("<span id='interactions' interArr='");
	    JSONObject HtmlTextObject = JSONObject.fromObject(arg.toString());
	    Iterator<String> keys=(Iterator<String>)HtmlTextObject.keys();
	    String keyString="";
	    while (keys.hasNext()) {
            keyString =  keys.next();
            JSONArray interactionArray=HtmlTextObject.getJSONArray(keyString);
            String group=keyString;
            for (int j = 0; j < interactionArray.size(); j++) {
                JSONObject interaction=interactionArray.getJSONObject(j);
                String classType=interaction.getString("classType");
                String newCTString="interactions."+classType;
                Class interClass=Class.forName(newCTString);
                StringBuilder interStrBuilder=new StringBuilder();
                Interaction bl = (Interaction) JSONObject.toBean(JSONObject.fromObject(interaction.toString()), interClass);
                interStrBuilder.append(bl.generateInteraction(group));
                String str=interStrBuilder.toString();
                
                HtmlText.append(str);
                
                if (classType.equals("Flip")) {
                    if (interaction.getString("mode").equals("p")) {
                        HtmlText.append(addJSlib("FlipPage"));
                    } else {
                        HtmlText.append(addJSlib("FlipCard"));
                    }
                }
                else if (classType.equals("CanvasParticle")) {
                    if (interaction.getString("mode").equals("g")) {
                        HtmlText.append(addJSlib("CanvasParticleG"));
                    } else {
                        HtmlText.append(addJSlib("CanvasParticleV"));
                    }
                }
                else {
                    HtmlText.append(addJSlib(classType));
                }
                
            }
        }
//	    for (int i = 0; i < fields.length; i++) {
//	        System.out.println(fields[i].getName());
//            JSONArray interactionArray=HtmlTextArray.getJSONArray(i);
//            String group="G"+i;
//            for (int j = 0; j < interactionArray.size(); j++) {
//                JSONObject interaction=interactionArray.getJSONObject(j);
//                String classType=interaction.getString("classType");
//                
//                String newCTString="interactions."+classType;
//                Class interClass=Class.forName(newCTString);
//                StringBuilder interStrBuilder=new StringBuilder();
//                Interaction bl = (Interaction) JSONObject.toBean(JSONObject.fromObject(interaction.toString()), interClass);
//                interStrBuilder.append(bl.generateInteraction(group));
//                String str=interStrBuilder.toString();
//                
//                HtmlText.append(str);
//                
//                if (classType.equals("Flip")) {
//                    if (interaction.getString("mode").equals("p")) {
//                        HtmlText.append(addJSlib("FlipPage"));
//                    } else {
//                        HtmlText.append(addJSlib("FlipCard"));
//                    }
//                }
//                else if (classType.equals("CanvasParticle")) {
//                    if (interaction.getString("mode").equals("g")) {
//                        HtmlText.append(addJSlib("CanvasParticleG"));
//                    } else {
//                        HtmlText.append(addJSlib("CanvasParticleV"));
//                    }
//                }
//                else {
//                    HtmlText.append(addJSlib(classType));
//                }
//                
//            }
//        }
	    String inters="";
	    Iterator<String> it=(Iterator<String>) libs.iterator();
        while(it.hasNext())
        {
            inters+=it.next().toString()+",";
        }
        inters=inters.substring(0,inters.length()-1);
        interSpan.append(inters);
        interSpan.append("'></span>");
        HtmlText.append(interSpan);
	    return HtmlText.toString();
	}
	
	
//	public static Object invokeMethod(Object owner, String methodName, Object[] args) throws Exception {
//	    
//	     Class ownerClass = owner.getClass();
//	 
//	     Class[] argsClass = new Class[args.length];
//	 
//	     for (int i = 0, j = args.length; i < j; i++) {
//	         argsClass[i] = args[i].getClass();
//	     }
//
//	     java.lang.reflect.Method method = ownerClass.getMethod(methodName,argsClass);
//	 
//	     return method.invoke(owner, args);
//	}
	
	public static String addJSlib(String name){
        Iterator<String> ite=(Iterator<String>) libs.iterator();
        while(ite.hasNext())
        {
            if(ite.next().toString().equals(name))
            {
                isLibIn=true;
                break;
                }
        }
        if(!isLibIn)
        {
            libs.add(name);
            ite=null;
            isLibIn=false;
            return "<script type='text/javascript' src='js/"+name+".js'></script>";
        }
        isLibIn=false;
        return "";
    }
}
