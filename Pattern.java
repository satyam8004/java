// PATTERS

public class Pattern{
  public static void main(String[] args) {
//left bottom
    for(int i = 0; i < 5; i++){
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }


System.out.println();
System.out.println();

// left top
    for (int i = 0; i < 5; i++) {
      for (int j = 5; j > i; j--) {
      // for (int j = i; j < 5; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }


System.out.println();
System.out.println();


//right bottom
    for (int i = 0; i < 5; i++) {
      for (int j = 4; j > i; j--) {
        System.out.print("  ");
      }
      for (int k = 0; k <= i; k++) {
        System.out.print(" *");
      }
      System.out.println();
    }


System.out.println();
System.out.println();


// right top
    for (int i = 0; i < 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("  ");
      }
      for (int k = 5; k > i; k--) {
        System.out.print(" *");
      }
      System.out.println();
    }


System.out.println();
System.out.println();

// oblique line
  // top left to right bottom
      for (int i = 0; i < 5; i++) {
        for (int j = 1; j <= i; j++) {
          System.out.print("  ");
        }
        System.out.println("* ");
      }

System.out.println();
System.out.println();


  // top right to bottom left
    for (int i = 0; i < 5; i++){
      for (int j = 4; j > i; j--) {
        System.out.print("  ");
      }
      System.out.println(" *");
    }

System.out.println();
System.out.println();


// triangle
    System.out.println("*");
    for (int i = 0; i < 3; i++) {
      // agar 5 line ka triangle bnana h to 3 likhna padega
      System.out.print("* ");
      for (int k = 0; k < i; k++) {
        System.out.print("  ");
      }
      System.out.println(" *");
    }
    for (int i = 0; i < 5; i++) {
      System.out.print("* ");
    }

  }
}
