/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heaps;

/**
 *
 * @author 62852
 */
public class Heap {
    private int maxSize;
    private int currentSize;
    private Node[] heapArray;
    private int last;
    
    public Heap(int size){
        maxSize=size;
        heapArray= new Node[size];
        currentSize=0;
        last=0;
    }
    public boolean insert(int NIK,String nama, int umur, String jk, String telpon, String alamat){
        Node newNode=new Node(NIK,nama,umur,jk,telpon,alamat);
        heapArray[currentSize]=newNode;
        trickleUp(currentSize++);
        return true;
    }
//    public boolean insertAt(int index,String nama, String umur, String jk, String telpon, String alamat){
//        
//        Node newNode=new Node(nama,umur,jk,telpon,alamat);
//        heapArray[index]=newNode;
//        trickleUp(currentSize++);
//        last++;
//        return true;
//    }
     public void trickleUp(int index){
        int parent=(index-1)/2;
        Node bottom=heapArray[index];
        
        while(index>0 && heapArray[parent].getNIK() > bottom.getNIK()){

            heapArray[index]=heapArray[parent];
            index=parent;
            parent=(parent-1)/2;
        }
        heapArray[index]=bottom;
    }
    public void trickleDown(int index){
        int lowerChild;
        Node top=heapArray[index];
        while(index<currentSize/2){
            int leftChild=2*index+1;
            int rightChild=leftChild+1;
            
            if (rightChild > currentSize && heapArray[leftChild].getNama().compareToIgnoreCase(heapArray[rightChild].getNama()) > 0) {
                lowerChild=rightChild;
            }else{
                lowerChild=leftChild;
            }
            if (top.getNama().compareToIgnoreCase(heapArray[lowerChild].getNama()) <= 0 ) {
                break;
            }
            heapArray[index]=heapArray[lowerChild];
            index=lowerChild;
        }
        heapArray[index]=top;
    }
    public void displayHeap(){
        System.out.println("Heap Array: ");
        for (int i = 0; i < currentSize; i++) {
            if (heapArray[i] != null) {
                System.out.print("Nama : "+heapArray[i].getNama()+", Umur : "+heapArray[i].getUmur()+", Jenis Kelamin : "+heapArray[i].getJk()+", Nomor Telepon : "+heapArray[i].getTelpon()+"\n");
            }else{
                System.out.println("--");
            }
        }
    }
    
    public void displayHeapDua(){
        System.out.println("Heap Array: ");
        for (int i = 0; i < currentSize; i++) {
            if (heapArray[i] != null) {
                System.out.print(heapArray[i].getNIK()+" ");
            }else{
                System.out.println("--");
            }
        }
        System.out.println("");
        int nBlank=32;
        int itemsPerRow=1;
        int column=0;
        int j=0;
        String dots="..........................................................";
        System.out.println(dots+dots);
        while(currentSize > 0){
            if (column==0) {
                for (int k = 0; k < nBlank; k++) {
                    System.out.print(' ');
                }
            }
            System.out.print(heapArray[j].getNIK());
            if (++j == currentSize) {
                break;
            }
            if (++column == itemsPerRow) {
                nBlank /=2;
                itemsPerRow *=2;
                column=0;
                System.out.println();
            }else{
                for (int k = 0; k < nBlank*2-2; k++) {
                    System.out.print(' ');
                }
            }
        }
        System.out.println("\n"+dots+dots);
    }
    
    public Node getData(){
        Node newNode = null;
        for (int i = 0; i < maxSize; i++) {
            newNode = new Node(heapArray[i].getNIK(),heapArray[i].getNama(),heapArray[i].getUmur(),heapArray[i].getJk(),heapArray[i].getTelpon(),heapArray[i].getAlamat());
        }
        return newNode;
    }
   
    
    public void HeapSortDescending(){
        System.out.println(".............................................");
        for (int i =last-1; i >= 0; i--) { //mengahapus data dari heap dan menampungnya pada array yang terakhir
            for (int j = last/2-1; j >= 0; j--) { //membuat array tersebut random di dalam tumpukan
                trickleDown(j); //memposisikan value sesuai dengan posisi nodenya
            }
            Node remove=this.remove();
            heapArray[i]=remove;     
        } 
        
    }
    public void HeapSortAscending(){
        System.out.println(".............................................");
        for (int i =last-1; i >= 0; i--) { //mengahapus data dari heap dan menampungnya pada array yang terakhir
            for (int j = 0; j <= last/2-1; j++) { //membuat array tersebut random di dalam tumpukan
                trickleDown(j); //memposisikan value sesuai dengan posisi nodenya
            }
            Node remove=this.remove();
            heapArray[i]=remove;     
        } 
        
    }
    public Node remove(){
        Node root=heapArray[0];
        heapArray[0]=heapArray[--currentSize];
        trickleDown(0);
        return root;
    }
    
}
