import java.util.ArrayList;
public class hash {
    ArrayList<Integer> arr;
    public hash(){
        arr = new ArrayList<>();
    }
    public void insert(int key) throws RuntimeException{ // Throws an exception
        // returns nothing however will print try with different int if the the key is in the array
        // takes an integer key and adds to array
        if(arr.size()>15000) throw new RuntimeException();
        if(search(key) == -1) {
            arr.add(key);
        }
        else{
            System.out.println("Try with different int");
            return;
        }

    }
    public int search(int key){
        // searchs through arraylist
        // returns -1 if not in the arraylist
        // will return the position of the element
        for(int i = 0; i<arr.size(); ++i){
            if(arr.get(i) == key) return i;
        }
        return -1;
    }
    public int delete(int key){
        // returns -1 if not in the arraylist
        // will return the position of the element that has been removed
        for(int i = 0; i<arr.size(); ++i){
            if(arr.get(i) == key){
                arr.remove(i);
                return i;
            }

        }
        return -1;
        }

}
