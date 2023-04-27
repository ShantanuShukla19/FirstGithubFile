package Stack;

public class stackimplementation {
    private String [] booktitle;
    private int pages[];
    private String [] author;
    private int [] year;
    private int top;
    private int length;
    int fullLength;
    stackimplementation(int capacity){
        length=0;
        top=0;
        fullLength=capacity;
        booktitle=new String[capacity];
        author=new String[capacity];
        pages=new int[capacity];
        year=new int[capacity];
    }
    public void push(String book_title,String Author,int PAGES,int YEAR){
        if(isfull()){
            System.out.println("STACK OVERFLOW");
            System.exit(1);
        }
        booktitle[top]=book_title;
        author[top]=Author;
        pages[top]=PAGES;
        year[top]=YEAR;
        top++;
        length++;

    }
    public void pop(){
        if(isempty()){
            System.out.println("EMPTY STACK");
            System.exit(1);
        }
        top--;
        length--;

    }
    public void traverse(){
        for (int i = length-1; i >=0 ; i--) {
            System.out.println(booktitle[i]+" "+author[i]+" "+pages[i]+" "+year[i]);
        }
    }
    public boolean isempty(){
        return length==0;
    }
    public boolean isfull(){
        return length==fullLength-1;
    }
    public int getLength(){
        return length;
    }
    public boolean search(String Bookname){
        for (int i = 0; i <length ; i++) {
            if (booktitle[i]==Bookname){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        stackimplementation obj=new stackimplementation(5);
        obj.push("BJD","jdf",77,2002);
        obj.push("BGD","jdfD",773,2008);
        obj.push("BJDS","GDJD",62343,2018);
        obj.pop();
        obj.traverse();
        System.out.println(obj.search("BJDGJ"));
    }
}
