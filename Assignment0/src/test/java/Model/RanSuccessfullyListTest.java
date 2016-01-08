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
        p = new Person("Wenbo Hou","HouPoc","Windows");
        rsl.addPerson(p);
        p = new Person("Cameron Barrie","barrieca","Windows");
<<<<<<< HEAD
        rsl.addPerson(p);
        p = new Person("Daniel Goh","danielgwj","Mac");
        rsl.addPerson(p);

        assertEquals(5,rsl.getPersons().size());

=======
        rs1.addPerson(p);
        assertEquals(4,rsl.getPersons().size());
>>>>>>> cs361-W16/master
    }
}