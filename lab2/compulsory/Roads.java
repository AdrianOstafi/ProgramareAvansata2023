package lab2.compulsory;

public class Roads {
    private Enum_Road type;
    private float lenght, speed;
    Locations a;
    Locations b;

public Roads( Enum_Road type, Locations a, Locations b )  {
    this.a = a;
    this.b = b;
    this.lenght = (float) Math.sqrt(((b.getX()-a.getX()) * (b.getX()-a.getX())) + ((b.getY()-a.getY())*(b.getY()-a.getY())));
    this.type = type;
    if( type.toString() == "HIGHWAY" ){
        speed = 130;
    }
    if( type.toString() == "EXPRESS" ){
        speed = 120;
    }
    if( type.toString() == "COUNTRY" ){
        speed = 50;
    }
}
    float getLenght(){ return this.lenght; }
    float getSpeed(){ return this.speed; }
    Enum_Road getType(){ return this.type; }

    @Override
    public String toString(){
    return getType().toString() + " road between " + a.getName() + " " + b.getName() + " with speed limit of: " + getSpeed() +"/h " + "lenght " + getLenght();
    }

}
