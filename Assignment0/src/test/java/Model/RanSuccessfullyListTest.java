package Model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michaelhilton on 1/5/16.
 */
public class RanSuccessfullyListTest {

    @Test
    public void testEmptyList(){
        RanSuccessfullyList rsl = new RanSuccessfullyList();
        assertEquals(0,rsl.getPersons().size());
    }

    @Test
    public void testSizeOneList(){
        RanSuccessfullyList rsl = new RanSuccessfullyList();
        Person p = new Person("Michael Hilton","MichaelHilton","Mac");
        rsl.addPerson(p);
        p = new Person("Taylor Kirkpatrick","kirkpatt","Windows");
        rsl.addPerson(p);
        p = new Person ("Yipeng Song", "songyip", "Windows");
        rsl.addPerson(p);

        p = new Person("Oleksii Zadniprianyi","alexzdn","Windows");
        rsl.addPerson(p);
        p = new Person("Nic Desilets", "ndesilets", "Linux");
        rsl.addPerson(p);
        p = new Person("Yichen Duan", "wjduand", "Mac");
        rsl.addPerson(p);
        p = new Person("Jin Hoong", "jinshin9", "Windows");
        rsl.addPerson(p);
        p = new Person("Cameron McDonnell", "mcdoncam", "Windows");
        rsl.addPerson(p);
        assertEquals(8,rsl.getPersons().size());

    }
}
