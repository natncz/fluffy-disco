public class Main {
    public static void main(String[] args) {

        Point[] pointsArray = {new Point(50, 50), new Point(50, 20), new Point(100, 20),new Point(100, 50)};
        Polygon polygon = new Polygon(pointsArray);
        System.out.println(polygon.toSvg());
        Polygon copypol = new Polygon(polygon);
        System.out.println(copypol.toSvg());
        Style s1 = new Style("red","yellow",3);
        Style s2 = new Style("none","green",2);
        Polygon polygon2 = new Polygon(pointsArray,s1);
        System.out.println(polygon2.toSvg());

        Point[] pointsArray2 = {new Point(100, 100), new Point(100, 40), new Point(200, 40),new Point(200, 100)};
        Polygon p2 = new Polygon(pointsArray2,s1);
        Point[] pointsArray3 = {new Point(100, 100), new Point(100, 150), new Point(135, 165),new Point(150, 200),new Point(200, 200)};
        Polygon p3 = new Polygon(pointsArray3,s2);
        SvgScene scene = new SvgScene();

        Ellipse ellipse = new Ellipse(new Point(10,10), 10, 12);

        scene.add(p2);
        scene.add(ellipse);
        scene.add(p3);
        scene.save("./out.html");
    }
}