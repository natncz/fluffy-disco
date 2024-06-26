public class Polygon implements Shape{
    private Vec2[] points;
    private Style style;

    public Polygon(Vec2[] points) {
        this.style = new Style("none","black",1.0);
        this.points = points;
    }
    @Override
    public String toSvg(String parameters) {
        StringBuilder string = new StringBuilder();
        string.append("<polygon points='");
        for (Vec2 vec2 : points) {
            string.append(vec2.x).append(",").append(vec2.y).append(" ");
        }
        string.append("' ").append(parameters).append(" />");
        return string.toString();
    }
    public static Polygon square(Segment diagonal, Style style) {
        double cx = (diagonal.getStartPoint().getX() + diagonal.getEndPoint().getX()) / 2;
        double cy = (diagonal.getStartPoint().getY() + diagonal.getEndPoint().getY()) / 2;
        Vec2 center = new Vec2(cx, cy);
        Segment[] perpendiculars = Segment.perpendicularSegments(diagonal,center,diagonal.length()/2);
        
        Vec2[] vec2s = new Vec2[4];
        vec2s[0] = diagonal.getStartPoint();
        vec2s[1] = perpendiculars[1].getEndPoint(); 
        vec2s[2] = diagonal.getEndPoint();
        vec2s[3] = perpendiculars[0].getEndPoint(); 
    }
}
