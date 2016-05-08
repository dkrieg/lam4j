package org.λ4j.structure;

import java.util.Objects;

public class T3<A, B, C> extends T2<A, B> implements P3<A, B, C> {

  public final C _3;

  T3(A _1, B _2, C _3) {
    super(_1, _2);
    this._3 = _3;
  }

  @Override
  public final C _3() {
    return _3;
  }


  @Override
  @SuppressWarnings("unchecked")
  public <T> T _n(int index) {
    switch (index) {
      case 3:
        return (T) _3;
      default:
        return super._n(index);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof T3)) return false;
    if (!super.equals(o)) return false;
    T3<?, ?, ?> tuple3 = (T3<?, ?, ?>) o;
    return super.equals(tuple3) && Objects.equals(_3, tuple3._3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), _3);
  }
}
