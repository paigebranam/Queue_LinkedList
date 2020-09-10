public class Queue<S> {
    private LinkedList<S> linkedList;

    public Queue(){
        linkedList = new LinkedList<S>();
    }

    //Queue = add method. (Add to back of the line)
    public void queue(S value){
        linkedList.addLast(value);
    }

    //Dequeue = remove method. (remove from the front of the line)
    public void dequeue(S value){
        linkedList.removeFirst();
    }


}
