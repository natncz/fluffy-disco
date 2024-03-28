import java.lang.Math;
public class Segment {

    private Point startPoint;
    private Point endPoint;

    public Segment(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public double length() {
        return Math.sqrt(Math.pow(endPoint.x - startPoint.x, 2) + Math.pow(endPoint.y - startPoint.y, 2));

    }

    public String toSvg() {
        return "<line x1=\"" + startPoint.x + "\" y1=\"" + startPoint.y + "\" x2=\"" + endPoint.x + "\" y2=\"" + endPoint.y + "\" stroke=\"black\" />";
    }

    public static Segment[] perpendicularSegments(Segment segment, Point point){
        double dx = segment.endPoint.x - segment.startPoint.x;
        double dy = segment.endPoint.y - segment.startPoint.y;

        Segment[] s_tab = new Segment[2];

        Point p1 = new Point(point.x-dy,point.y+dx);
        s_tab[0] = new Segment(point,p1);

        Point p2 = new Point(point.x+dy,point.y-dx);
        s_tab[1] = new Segment(point,p2);

        return s_tab;
    }
}