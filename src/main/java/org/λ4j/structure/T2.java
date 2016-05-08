package org.λ4j.structure;

import java.util.Objects;

public class T2<A, B> extends T1<A> implements P2<A, B> {

  public final B _2;

  T2(A _1, B _2) {
    super(_1);
    this._2 = _2;
  }

  @Override
  public final B _2() {
    return _2;
  }


  @Override
  @SuppressWarnings("unchecked")
  public <T> T _n(int index) {
    switch (index) {
      case 2:
        return (T) _2;
      default:
        return super._n(index);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof T2)) return false;
    if (!super.equals(o)) return false;
    T2<?, ?> tuple2 = (T2<?, ?>) o;
    return super.equals(tuple2) && Objects.equals(_2, tuple2._2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), _2);
  }
}
