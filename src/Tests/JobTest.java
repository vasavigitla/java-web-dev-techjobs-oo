package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    //created a Job object with job class
    Job job1;
    Job job2;
    Job job3;
    Job job4;

    @Before
    public void createJobObject(){
        // Initializing the Job objetcs with empty constructor
        job1 = new Job();
        job2 = new Job();
        // Initializing the job objects with parameterized constructor
        job3 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        job4 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
    }

@Test
public void testSettingJobId(){
        // assert statements for testing
assertEquals(1,job2.getId()-job1.getId());
assertTrue(job2.getId()> job1.getId());

//assertTrue(job1.getId() != job2.getId());
 }
@Test
public void testJobConstructorSetsAllFields(){
//    System.out.println(job3.getName());
        assertEquals("Product tester",job3.getName());
    assertEquals("ACME",job3.getEmployer().getValue());
    assertEquals("Desert",job3.getLocation().getValue());
    assertEquals("Quality control",job3.getPositionType().getValue());
    assertEquals("Persistence",job3.getCoreCompetency().getValue());
    assertTrue(job3.getName().contains("Product tester"));
    assertTrue(job3.getEmployer().getValue().contains("ACME"));
    assertTrue(job3.getLocation().getValue().contains("Desert"));
    assertTrue(job3.getPositionType().getValue().contains("Quality control"));
    assertTrue(job3.getCoreCompetency().getValue().contains("Persistence"));
}
@Test
    public void testJobsForEquality(){
    Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertFalse(job1.equals(job2));
}


}