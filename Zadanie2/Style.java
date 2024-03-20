package Zadanie2;

public class Style {
    public final String fillColor, strokeColor;
    public final double strokeWidth;
    
    public Style(String fillColor, String strokeColor,  double strokeWidth) {
        this.fillColor=fillColor;
        this.strokeColor=strokeColor;
        this.strokeWidth=strokeWidth;
    }

    public String toSvg() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("fill:").append(fillColor)
                     .append(";stroke:").append(strokeColor)
                     .append("stroke-width:").append(strokeWidth);
        return stringBuilder.toString();
    }
}
