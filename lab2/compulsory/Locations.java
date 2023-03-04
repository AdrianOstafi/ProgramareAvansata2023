package lab2.compulsory;

public class Locations {
    private
    String name;
    private float x,y;
    private Enum_Location type;

    Locations( String name, float x, float y, Enum_Location type ){
        this.name = name;
        this.x = x;
        this.y = y;
        this.type = type;
    }

    float getX() { return this.x; }
    float getY() { return this.y; }
    String getName() { return this.name; }
    void setName(String name)  { this.name = name; }

    Enum_Location getType() { return this.type; }
    void setType(Enum_Location type) { this.type = type; }

    @Override
    public String toString() {
        return "Location:" + getName() + " " + "Type:" + getType() + ";" + "coordinates: x=" + getX() + ";" + "y=" + getY();
    }


}
