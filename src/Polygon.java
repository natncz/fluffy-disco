


import java.io.StringReader;
public class Polygon extends Shape {
    private Point[] points;
    public Polygon(Point[] points, Style style) {
        super(style);
        this.points = points;
    }
    public Polygon(Point[] points) {
        super(new Style("none","black", 1.0));
        this.points = points;

    }
    public String toSvg() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<polygon points=\"");
        for (Point point : points) {
            stringBuilder.append(point.x).append(",").append(point.y).append(" ");
        }
        stringBuilder.append(style.toSvg()).append("/>");
        return stringBuilder.toString();
    }
    public Polygon(Polygon src) {
        super(new Style(src.style.fillColor, src.style.strokeColor, src.style.strokeWidth));
        this.points = new Point[src.points.length];
        for (int i = 0; i < points.length; ++i) {
            points[i] = new Point(src.points[i].x, src.points[i].y);
        }
    }
}
