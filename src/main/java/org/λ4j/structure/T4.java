package org.λ4j.structure;

import java.util.Objects;

public class T4<A, B, C, D> extends T3<A, B, C> implements P4<A, B, C, D> {

  public final D _4;

  T4(A _1, B _2, C _3, D _4) {
    super(_1, _2, _3);
    this._4 = _4;
  }

  @Override
  public final D _4() {
    return _4;
  }


  @Override
  @SuppressWarnings("unchecked")
  public <T> T _n(int index) {
    switch (index) {
      case 4:
        return (T) _4;
      default:
        return super._n(index);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof T4)) return false;
    if (!super.equals(o)) return false;
    T4<?, ?, ?, ?> tuple4 = (T4<?, ?, ?, ?>) o;
    return super.equals(tuple4) && Objects.equals(_4, tuple4._4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), _4);
  }
}
