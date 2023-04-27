package DA;

import java.util.NoSuchElementException;

public class JOBS {
    private listnode front;
    private listnode rear;
    private int length;
    public JOBS(){
        this.front=null;
        this.rear=null;
        this.length=0;
    }
    private class listnode{
        private String job_title;
        private listnode next;
        public listnode(String job_title){
            this.job_title=job_title;
            this.next=null;

        }
    }
    public int length(){
        return length;
    }
    public boolean isempty(){
        return length==0;
    }
    public void add_job(String job_title){
        listnode temp=new listnode(job_title);
        if(isempty()){
            front=temp;
        }
        else {
            rear.next=temp;

        }
        rear=temp;
        length++;
    }
    public String cancel_job(){
        if(isempty()){
            throw new NoSuchElementException("QUEUE is empty");

        }
        String result=front.job_title;
        front=front.next;
        if(front==null){
            rear=null;
        }
        length--;
        return result;

    }
    public void display(){
        if(isempty()){
            return;
        }
        listnode current=front;
        int i=0;
        while (current!=null){

            System.out.println((++i)+": "+current.job_title);
            current=current.next;

        }

    }

    public static void main(String[] args) {
        JOBS obj=new JOBS();
        obj.add_job("TEACHER");
        obj.add_job("WORKER");
        obj.add_job("ENGINEER");
        obj.add_job("DOCTOR");
        obj.cancel_job();
        obj.display();
    }
}
