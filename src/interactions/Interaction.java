package interactions;

import publicClass.Coordinate;;

public class Interaction {

    protected Coordinate coordinate;  
    protected String classType="";
    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public Interaction() {
        this.coordinate=new Coordinate();
    }
    
    public String generateInteraction(String group) {
        return "";
    }
    

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
}
