package practice.udemy;

public class LinkedList{
    private Node header, lastNode;
    private Integer size;
    public LinkedList(){
        header = new Node(null);
        lastNode = header;
        size = 0;
    }
    public LinkedList(Integer data){
        header = new Node(data);
        lastNode = header;
        size = 1;
    }
    //public LinkedList(array list){}

    public Node getHeader(){
        return header;
    }

    public Node getLastNode(){
        return lastNode;
    }

    public Integer getSize(){
        return this.size;
    }

    public void printList(){
        Node currNode = header;
        if(this.size == 0) {
            System.out.println("List is empty");
            return;
        }
        while(currNode != null){
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    public String toString(){
        String res = "";
        Node currNode = header;
        if(this.size == 0) {
            res += "List is empty";
            return res;
        }
        while(currNode != null){
            res = res + Integer.toString(currNode.data);
            if(currNode.next != null)
                res += "->";
            currNode = currNode.next;
        }
        return res;
    }

    public void prepend(Integer data){
        if(this.size == 0){
            header.data = data;
        }
        else{
            Node temp = new Node(data);
            temp.next = header;
            header = temp;
        }
        this.size ++;
        //System.out.println("List size after prepend = " + this.size);
    }

    public void append(Integer data){
        Node temp = new Node(data);
        this.getLastNode().next = temp;
        this.lastNode = temp;
        this.size++;
        //System.out.println("List size after append = " + this.size);
    }

    public void insertAt(Integer data, Integer pos){
        if(pos <= 1){
            prepend(data);
            return;
        }
        if(pos > this.getSize()){
            append(data);
            return;
        }
        Node prevNode, currNode;
        prevNode = this.getHeader();
        currNode = prevNode.next;
        Node temp = new Node(data);
        for(int i = 2; i < pos; i++){
            prevNode = prevNode.next;
            currNode = currNode.next;
        }
        prevNode.next = temp;
        temp.next = currNode;
        this.size++;
    }

    public Integer removeHead(){
        Node currNode = this.getHeader();
        this.header = currNode.next;
        Integer data = currNode.data;
        currNode.next = null;
        this.size--;
        return data;
    }

    public Integer removeTail(){
        return removeNthElement(this.getSize());
    }

    public Integer removeNthElement(Integer pos){
        if(pos > this.getSize() || pos < 1){
            return null;
        }
        if(pos == 1){
            return removeHead();
        }
        Node prevNode, currNode;
        Integer data;
        prevNode = this.getHeader();
        currNode = prevNode.next;
        for(int i=2; i<pos; i++){
            prevNode = prevNode.next;
            currNode = currNode.next;
        }
        prevNode.next = currNode.next;
        data = currNode.data;
        currNode.next = null;
        this.size--;
        return data;
    }

    public Integer peekHead(){
        return this.getHeader().data;
    }

    public Integer peekTail(){
        return this.getLastNode().data;
    }

    public Integer peekNthElement(Integer pos){
        if(pos > this.getSize() || pos < 1){
            return null;
        }
        Node currNode = this.getHeader();
        Integer data = currNode.data;
        for(int i=1; i<pos; i++){
            currNode = currNode.next;
            data = currNode.data;
        }
        return data;
    }
}
