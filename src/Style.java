public class Style {
    final public String fillColor, strokeColor;
    final public double strokeWidth;

    public Style(String fillColor, String strokeColor, double strokeWidth)
    {
        this.fillColor=fillColor;
        this.strokeColor=strokeColor;
        this.strokeWidth=strokeWidth;
    }

    public String toSvg() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" style=\"fill:").append(fillColor).append(";stroke:").append(strokeColor).append(";stroke-width:").append(strokeWidth).append("\"/>\n");
        return stringBuilder.toString();
    }
}

