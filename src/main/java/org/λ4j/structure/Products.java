package org.λ4j.structure;

import org.λ4j.λ2;

import java.util.Objects;

public final class Products {
  public static final λ2<Product, Product, Integer> compareProductTo = Products::compareTo;

  private Products() {
    throw new UnsupportedOperationException();
  }

  public static boolean containsComparable(Product... products) {
    Objects.requireNonNull(products, "products is null");
    for (Product p : products) {
      for (int i = 1; i < p.arity(); i++) {
        if (!(p._n(i) instanceof Comparable)) {
          return false;
        }
      }

    }
    return true;
  }

  @SuppressWarnings("unchecked")
  public static <C extends Comparable> int compareTo(Product p1, Product p2) {
    if (containsComparable(p1, p2) && p1.arity() == p2.arity()) {
      for (int i = 1; i < p1.arity(); i++) {
        final int check = ((C) p1._n(i)).compareTo(p2._n(i));
        if (check != 0) {
          return check;
        }
      }
    }
    return p1.arity().compareTo(p2.arity());
  }
}
