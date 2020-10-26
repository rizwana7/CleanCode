package org.solid.singleresponsibility.solution;

class OutputAreas {
    double areas=0;
    public OutputAreas(double a){
        this.areas = a;
    }
    public void console() {
        System.out.println("Total of all areas = " + areas);
    }

    public void HTML() {
        System.out.println("<HTML>");
        System.out.println("Total of all areas = " + areas);
        System.out.println("</HTML>");
    }
}