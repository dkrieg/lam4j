package org.λ4j.structure;

import org.λ4j.λ2;

import java.io.Serializable;

public interface Product extends Serializable {
  long serialVersionUID = 1L;

  λ2<Product, Product, Integer> compareTo = Product::compareTo;

  static void boundedArity(Product p, int index) throws IndexOutOfBoundsException {
    if (index < 1 || index > p.arity()) {
      throw new IndexOutOfBoundsException();
    }
  }

  static boolean containsComparable(Product... products) {
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
  static <C extends Comparable> int compareTo(Product p1, Product p2) {
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

  Integer arity();

  <T> T _n(int index);
}
