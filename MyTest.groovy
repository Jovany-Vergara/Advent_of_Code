import groovy.util.GroovyTestCase

class DayThreeTest extends GroovyTestCase {
  void testDeliveryTwoHouse() {
    //Given:
    String directions = ">"
    //When:
    Integer houses = DayThree.HousesDelivery(directions)
    //then:
    assert houses == 2
  }
  void testDayThreeTestTwo() {
    //Given:
    String directions = "^>v<"
    //when:
    Integer housesDelivery = DayThree.HousesDelivery(directions)
    //then:
    assert housesDelivery == 4
  }
  void testDayThreeTestThree() {
    //Given:
    String directions = "^v^v^v^v^v"
    //when:
    Integer housesDeliveryThree = DayThree.HousesDelivery(directions)
    //then:
    assert housesDeliveryThree == 2
  }
  void testDayThreeFromFile() {
    //Given:
    File file = new File("./ejercicioSanta.txt")
    List<String> lines = file.readLines()
    String directions = lines.join()
    //when:
    def directoriesDeliveryHose = DayThree.HousesDelivery(directions)
    //then:
    assert directoriesDeliveryHose == 2592

  }
}
