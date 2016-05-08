package org.λ4j.structure;

import java.io.Serializable;

public interface Product extends Serializable {
  long serialVersionUID = 1L;

  static void boundedArity(Product p, int index) throws IndexOutOfBoundsException {
    if (index < 1 || index > p.arity()) {
      throw new IndexOutOfBoundsException();
    }
  }

  Integer arity();

  <T> T _n(int index);
}
