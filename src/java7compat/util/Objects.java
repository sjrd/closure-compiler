package java7compat.util;

import java.util.Arrays;

public class Objects {
  public static boolean equals(Object obj1, Object obj2) {
    if (obj1 == obj2) return true;
    else if (obj1 != null) return obj1.equals(obj2);
    else return false;
  }

  public static int hash(Object... values) {
    return Arrays.hashCode(values);
  }

  public static int hashCode(Object o) {
    if (o == null) return 0;
    else return o.hashCode();
  }
}
