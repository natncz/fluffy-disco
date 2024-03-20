import Zadanie2.Style;

public class Polygon {

    private final Point[] points;
    private String style="fill:lime;stroke:purple;stroke-width:3";

    public Polygon(Point[] points) {
        this.points = points;
    }
    
    public Polygon(Point[] points, Style style) {
        this.points = points;
        this.style = style.toSvg();
    }

    public String toSvg() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<polygon points=\"");
        for (Point point : points) {
            stringBuilder.append(" "+point.x+","+point.y);
        }
        stringBuilder
            .append("\" style=\"")
            .append(style)
            .append("\" />");

        return stringBuilder.toString();
    }

    public Polygon(Polygon src) {
        this.points = new Point[src.points.length];
        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(src.points[i].x, src.points[i].y);
        }
    }
    
}