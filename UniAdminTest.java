public class UniAdminTest
{
public static void main(String[] args) 
{
  //testCalcGradeEqa();
  //testRoomVolume();
  testUvRating();
}
 
public static void testCalcGradeEqa()
{
 String actual;
  actual = UniAdmin.calcGrade(10); 
  assert "F".equals(actual) : "grade is F";
   actual = UniAdmin.calcGrade(55);
  assert "5".equals(actual);
  actual = UniAdmin.calcGrade(67); 
  assert "6".equals(actual); 
  actual = UniAdmin.calcGrade(77);
  assert "7".equals(actual); 
  actual = UniAdmin.calcGrade(88);
  assert "8".equals(actual);
  actual = UniAdmin.calcGrade(99); 
  assert "9".equals(actual) : "grade is 9";
  actual = UniAdmin.calcGrade(100); 
  assert "10".equals(actual);
}

public static void testRoomVolume()
{
 double actual;
 actual = HouseCalcTest.roomVolume(2.0,1.0,1.0);
 assert 0.0 == actual : "Volume should be zero";
 actual = HouseCalcTest.roomVolume(3.0,1.0,4.0);
  assert 0.0 == actual;
 actual = HouseCalcTest.roomVolume(1.0,3.0,2.0);
 assert 0.0 == actual;
  actual = HouseCalcTest.roomVolume(2.0,3.0,4.0);
  assert 24.0 == actual;
}
public static void testUvRating()
{
  String actual;
  actual = HealthCalc.uvRating(-1.0);
  assert "-".equals(actual);
  actual = HealthCalc.uvRating(3.0);
  assert "low".equals(actual);
  actual = HealthCalc.uvRating(6.0);
  assert "moderate".equals(actual);
  actual = HealthCalc.uvRating(9.0);
  assert "high".equals(actual); 
  actual = HealthCalc.uvRating(11.0);
  assert "very high".equals(actual);
  actual = HealthCalc.uvRating(12.0);
  assert "extreme".equals(actual); 
}
}
