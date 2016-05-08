package org.λ4j.structure;

import java.util.Objects;

public class T5<A, B, C, D, E> extends T4<A, B, C, D> implements P5<A, B, C, D, E> {

  public final E _5;

  T5(A _1, B _2, C _3, D _4, E _5) {
    super(_1, _2, _3, _4);
    this._5 = _5;
  }

  @Override
  public final E _5() {
    return _5;
  }


  @Override
  @SuppressWarnings("unchecked")
  public <T> T _n(int index) {
    switch (index) {
      case 5:
        return (T) _5;
      default:
        return super._n(index);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof T5)) return false;
    if (!super.equals(o)) return false;
    T5<?, ?, ?, ?, ?> tuple5 = (T5<?, ?, ?, ?, ?>) o;
    return super.equals(tuple5) && Objects.equals(_5, tuple5._5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), _5);
  }
}
