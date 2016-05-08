package org.λ4j.structure;

import java.util.Objects;

public class T1<A> implements P1<A>, Comparable<Product> {

  public final A _1;

  T1(A _1) {
    this._1 = _1;
  }

  @Override
  public final A _1() {
    return _1;
  }

  @Override
  @SuppressWarnings("unchecked")
  public <T> T _n(int index) {
    Product.boundedArity(this, index);
    switch (index) {
      case 1:
        return (T) _1;
      default:
        throw new UnknownError();
    }
  }

  @Override
  public final int compareTo(Product that) {
    return Products.compareTo(this, that);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof T1)) return false;
    T1<?> tuple1 = (T1<?>) o;
    return Objects.equals(_1, tuple1._1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_1);
  }

  @Override
  public final String toString() {
    StringBuilder b = new StringBuilder("(");
    for (int i = 1, j = arity(); i <= arity(); i++, j--) {
      b.append(_n(i).toString());
      if (j > 1) {
        b.append(", ");
      }
    }
    b.append(")");
    return b.toString();
  }
}
