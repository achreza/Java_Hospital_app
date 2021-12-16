
package Heaps;
public class DataArray {
    private Node[] mhs;

    private int nElemen;
    int max;
    public DataArray(int max){
        mhs = new Node[max];

        this.max = max;
        nElemen = 0;
    }
    public Node find(String searchNim){
        int i;
        for (i = 0; i < nElemen; i++) {
            if (mhs[i].getNama() ==  searchNim) {
                break;
            }
        }
        if (i == nElemen) {
            return null;
        }else{
            return mhs[i];
        }
    }
    public void insert(int NIK,String nama, int umur, String jk, String telpon, String alamat){
        mhs[nElemen] = new Node(NIK,nama,umur,jk,telpon,alamat);
      
        nElemen++;
    }
    
    
    
   
   
    
     //ascending
//    public void BubbleSort() {
//        int batas, i;
//        for (batas = nElemen - 1; batas > 0; batas--) {
//            for (i = 0; i < batas; i++) {
//                if (mhs[i].getNim() > mhs[i + 1].getNim()) {
//                    swap(i, i + 1);
//                }
//            }
//        }
//    }
    public void InsertionSort() {
        int i, curIn;
        for (curIn = 1; curIn < nElemen; curIn++) {
            Node temp = mhs[curIn];
            i = curIn;
            while (i > 0 && mhs[i - 1].getNama().compareToIgnoreCase(temp.getNama()) >= 0) {
                mhs[i] = mhs[i - 1];
                i--;
            }
            mhs[i] = temp;
        }
    }
    public void SelectionSort() {
        int awal, i, min;
        for (awal = 0; awal < nElemen - 1; awal++) {
            min = awal;
            for (i = awal + 1; i < nElemen; i++) {
                if (mhs[i].getNama().compareToIgnoreCase(mhs[min].getNama()) < 0) {
                    min = i;
                }
            }
            swap(awal, min);
           
        }
    }
    
    public Node binarySearch(int key) {
        int batasAtas = nElemen - 1;
        int batasBawah = 0;
        
       

        boolean belumKetemu = true;

        while (belumKetemu) {
            int posisiSekarang = (batasAtas + batasBawah) / 2;

            if (mhs[posisiSekarang].getNIK() == key) {
                belumKetemu = false;

                return mhs[posisiSekarang];

            } else if (batasBawah > batasAtas) {
                break;
            } else {
                if (mhs[posisiSekarang].getNIK() < 0) {
                    batasBawah = posisiSekarang + 1;
                } else {
                    batasAtas = posisiSekarang - 1;
                }
            }
        }
        return null;
    }
     public void swap(int one, int two) {
        Node temp = mhs[one];
        mhs[one] = mhs[two];
        mhs[two] = temp;
    }
//     
//     public Node getData(){
//        Node newNode = null;
//        for (int i = 0; i < ++max; i++) {
//            newNode = new Node(mhs[i].getId(),mhs[i].getNama(),mhs[i].getEmail(),mhs[i].getTelpon(),mhs[i].getTipe(),mhs[i].getTotal(),mhs[i].getPayment());
//        }
//        return newNode;
//    }
     
    
}
