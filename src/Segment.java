import java.lang.Math;
public class Segment {
    private Vec2 start;
    private Vec2 endV;
    public Segment(Vec2 start, Vec2 endV) {
        this.start = start;
        this.endV = endV;
    }
    public Vec2 getStartPoint() {
        return start;
    }
    public Vec2 getEndPoint() {
        return endV;
    }
    public double length() {
        return Math.sqrt(Math.pow(endV.x - start.x, 2) + Math.pow(endV.y - start.y, 2));

    }
    public String toSvg() {
        return "<line x1='" + this.start.x + "' y1='" + this.start.y +
                "' x2='" + this.endV.x + "' y2='" + this.endV.y +"' stroke='black' />";
    }
    @Override
    public String toString() {
        return this.toSvg();
    }
    public static Segment[] perpendicularSegments(Segment segment, Vec2 point) {
        double dx = segment.getEndPoint().x - segment.getStartPoint().x;
        double dy = segment.getEndPoint().y - segment.getStartPoint().y;
    
        return new Segment[] {
                new Segment(point, new Vec2(
                        point.x - dy, point.y + dx
                )),
                new Segment(point, new Vec2(
                        point.x + dy, point.y - dx
                )),
        };
    }


    public static Segment[] perpendicularSegments(Segment segment, Vec2 center, double length) {

        double dx = ((segment.getEndPoint().getX() - segment.getStartPoint().getX())/segment.length())*length ;
        double dy = ((segment.getEndPoint().getY() - segment.getStartPoint().getY())/segment.length())*length  ;
        return new Segment[] {
                new Segment(center, new Vec2(
                        center.x - dy, center.y + dx
                )),
                new Segment(center, new Vec2(
                        center.x + dy, center.y - dx
                )),
        };
    }