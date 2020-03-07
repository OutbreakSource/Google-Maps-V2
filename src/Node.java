/*
 * CS 250 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Prg 01 - Node class
 * Your name(s):
 */

public class Node {

    private Waypoint data; // aka value"
    private Node next;

    public Node(){
        data = null;
        next = null;
    }

    public Node(Waypoint data){
        this.data = data;
        next = null;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public void setData(Waypoint data) {
        this.data = data;
    }

    public Waypoint getData() {
        return data;
    }

    public Node getNext(){
        return next;
    }

    @Override
    public String toString() {
        return " " + data;
    }
}
