package RecordPatterns;

public class RecordPatternExample {
    public record GpsCoordinates(double latitude, double longitude) {}
    public record Location (String name, GpsCoordinates gpsPoint) {}

   public static void main(String[] args) {

        Location o=new Location("Chennai",new GpsCoordinates(13.0843, 80.2705));

        //Without Record patterns

        if (o instanceof Location location) {
           //System.out.println("Location"+location.name());
           // System.out.println(location.getGpsPoint().getLatitude());
        }
       if (o instanceof Location(String name,GpsCoordinates gps)) {
           System.out.println("Location"+name);
           // System.out.println(location.getGpsPoint().getLatitude());
       }

       if (o instanceof Location (var name, var gpsPoint)) {
           System.out.println("Location:"+name);
       }
       if (o instanceof Location (var name, GpsCoordinates(var latitude, var longitude))) {
           System.out.println("lat: " + latitude + ", lng: " + longitude);
       }



    }
}
