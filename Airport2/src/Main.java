import plane.Plane;
import planeService.PlaneService;

public class Main {
    public static void main(String[] args) {
        PlaneService planeService=new PlaneService();
       Plane p= planeService.createPlane();
        planeService.task1(p);
    }
}