import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class hashTest {

    @Test
    void insert() {
        hash test = new hash();
        test.insert(5);
        test.insert(5);
        test.insert(5);
        test.insert(6);
        test.insert(13);

    }
    @Test
    void intenseinsert() throws RuntimeException{
        hash test1 = new hash();
        for(int i=0; i<=15000; ++i){
            test1.insert(i);
        }
        assertThrows(RuntimeException.class, () -> test1.insert(15555));

    }


    @Test
    void search() {
        hash test = new hash();
        test.insert(5);
        test.insert(6);
        test.insert(13);
        assertEquals(0, test.search(5));

        assertEquals(2, test.search(13));


    }
    @Test
    void intensesearch() {
        hash test = new hash();
        for(int i=0; i<=15000; ++i){
            test.insert(i*3);
        }

        assertEquals(9, test.search(27));

        assertEquals(100, test.search(300));

        assertEquals(14999, test.search(44997));

    }


    @Test
    void delete() {
        hash test = new hash();
        test.insert(5);
        assertEquals(0, test.delete(5));
        assertEquals(-1, test.delete(1236871));
        test.insert(5);
        test.insert(7);
        test.insert(9);
        test.insert(11);
        assertEquals(1, test.delete(7));
        assertEquals(2, test.delete(11));

    }
    @Test
    void intensedelete() {
        hash test = new hash();
        for(int i=0; i<=15000; ++i){
            test.insert(i*2);
        }
        assertEquals(0,test.delete(0));
        assertEquals(14500,test.delete(29002));
        assertEquals(500,test.delete(1002));
        assertEquals(300,test.delete(602));
        assertEquals(300,test.delete(604));




    }
}