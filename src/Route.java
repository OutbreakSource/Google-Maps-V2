public class Route {

    // TODO: implement instance/class variables
    private static final int MAX_JUMP = 5; // in kilometers
    private Node start;
    private int nRead = 0;                // index counter


    // TODO: implement the parameter-less constructor
    public Route() {
        start = null;
    }

    // TODO: return the number of waypoints in the route
    public int size() {
        Node current = start;
        while (current != null) {
            nRead++;
            current = current.getNext();
        }
        return nRead;
    }

    // TODO: a route should not accept jumps from one waypoint to another greater than MAX_JUMP; return true/false depending whether the waypoint was successfully added or not
    public boolean add(final Waypoint waypoint) {
        if(waypoint.equals(start)){
            Waypoint newWay = new Waypoint(waypoint.getLatitude(), waypoint.getLongitude());



        }

    }

    // TODO: return the waypoint at the specified index location
    public Waypoint get(int index) {
        return null;
    }

    // TODO: return a string representation of a route from its start to its end
    @Override
    public String toString() {
        return "";
    }