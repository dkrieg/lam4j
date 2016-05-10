package org.λ4j.structure;

import org.λ4j.λ0;

import java.util.Objects;

class λT1<A> implements P1<A>, Comparable<Product> {
  final Object lock = new Object();
  ;
  private final λ0<A> _λ1;
  private volatile A _1;
  private volatile boolean loaded;
  final boolean lazy;

  λT1(A _1) {
    this._λ1 = () -> _1;
    loaded = true;
    lazy = false;
    this._1 = _1;
  }

  λT1(λ0<A> _λ1) {
    this._λ1 = _λ1;
    loaded = false;
    lazy = true;
  }

  @Override
  public final A _1() {
    if (lazy && !loaded) {
      synchronized (lock) {
        if (!loaded) {
          _1 = _λ1.x();
          loaded = true;
        }
      }
    }
    return _1;
  }

  @Override
  @SuppressWarnings("unchecked")
  public <T> T _n(int index) {
    Product.boundedArity(this, index);
    switch (index) {
      case 1:
        return (T) _1();
      default:
        throw new UnknownError();
    }
  }

  @Override
  public final int compareTo(Product that) {
    return Product.compareTo(this, that);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof λT1)) return false;
    λT1<?> tuple1 = (λT1<?>) o;
    return Objects.equals(_1(), tuple1._1());
  }

  @Override
  public int hashCode() {
    return Objects.hash(_1());
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
