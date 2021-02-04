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
    Job job5;

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

        job5 = new Job("Product tester",
                new Employer(""),
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
    assertFalse(job3.equals(job4));
}
@Test
public void testJobtostringForBlanklines(){
        assertEquals(true,job3.toString().startsWith("\n"));
        assertEquals(true,job3.toString().endsWith("\n"));
}
@Test
public void testjobtostringForEmptyField(){
        assertEquals(true,job5.toString().contains(job5.getEmployer().getValue()));
      assertEquals("Data not available",job5.getEmployer().getValue());
//    System.out.println(job5.toString());
}
@Test
public void testJobtoStringForDataContainsEachField(){
        assertEquals("\n" +
                "id:" + job3.getId() + "\n" +
                "name:" + job3.getName()+ '\'' + "\n" +
                "employer:" + job3.getEmployer() + "\n" +
                "location:" + job3.getLocation() + "\n" +
                "positionType:" + job3.getPositionType()+ "\n" +
                "coreCompetency:" + job3.getCoreCompetency()+
                "\n",job3.toString());
//    System.out.println(job3.toString());
}
}