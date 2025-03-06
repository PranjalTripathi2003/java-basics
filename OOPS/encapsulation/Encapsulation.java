package encapsulation;

public class Encapsulation {
  public static void main(String[] args) {

    Laptop l1 = new Laptop();
    l1.setName("Pranjal");
    /*
     * We accessed the private String "name" with the help of getters and setters,
     * in real world applications , we would be having an authentication bypass
     * before making this private data member of a class accessible.
     * 
     * THIS WAS AN EXAMPLE OF ENCAPSULATION and THE USE OF GETTERS AND SETTERS.
     */
    l1.getName();

  }

  /*
   * THIS WAS USED FOR "callingEncapsulation" file, that shows calling from a
   * package inside a folder for a "public" is possible, see that file for more
   * info.
   * public void sumCalc(int i, int i1) {
   * System.out.println(i + i1);
   * }
   */

  public static class Laptop {
    private String name; // DATA HIDING

    public void setName(String userName) {
      name = userName; // "name" is accessible because it belongs to the same class. Hence we can use
                       // this to access "name" out of this class.
    }

    public void getName() {
      System.out.println(name);

      // This is basically Encapsulation, that is to create a getter and setter for a
      // private data member, here we have hidden the data to be accessed directly, in
      // real world we would first authenticate and then "get" the private data member
      // to be accessed.

      // Just like in a medicinal capsule , the medicine is inside of the capsule and
      // not directly accessible , we access the actual method through ingesting the
      // capsule, similarily a Java class with private function and data types could
      // be accessed through getter and setter and not directly, ig that is the
      // analogy. I could be wrong.
    }

  }

}
