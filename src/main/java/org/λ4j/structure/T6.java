package org.λ4j.structure;

import java.util.Objects;

public class T6<A, B, C, D, E, F> extends T5<A, B, C, D, E> implements P6<A, B, C, D, E, F> {

  public final F _6;

  T6(A _1, B _2, C _3, D _4, E _5, F _6) {
    super(_1, _2, _3, _4, _5);
    this._6 = _6;
  }

  @Override
  public final F _6() {
    return _6;
  }


  @Override
  @SuppressWarnings("unchecked")
  public <T> T _n(int index) {
    switch (index) {
      case 6:
        return (T) _6;
      default:
        return super._n(index);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof T6)) return false;
    if (!super.equals(o)) return false;
    T6<?, ?, ?, ?, ?, ?> tuple6 = (T6<?, ?, ?, ?, ?, ?>) o;
    return super.equals(tuple6) && Objects.equals(_6, tuple6._6);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), _6);
  }
}
