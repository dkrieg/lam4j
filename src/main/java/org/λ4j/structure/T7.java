package org.λ4j.structure;

import java.util.Objects;

public class T7<A, B, C, D, E, F, G> extends T6<A, B, C, D, E, F> implements P7<A, B, C, D, E, F, G> {

  public final G _7;

  T7(A _1, B _2, C _3, D _4, E _5, F _6, G _7) {
    super(_1, _2, _3, _4, _5, _6);
    this._7 = _7;
  }

  @Override
  public final G _7() {
    return _7;
  }


  @Override
  @SuppressWarnings("unchecked")
  public <T> T _n(int index) {
    switch (index) {
      case 7:
        return (T) _7;
      default:
        return super._n(index);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof T7)) return false;
    if (!super.equals(o)) return false;
    T7<?, ?, ?, ?, ?, ?, ?> tuple7 = (T7<?, ?, ?, ?, ?, ?, ?>) o;
    return super.equals(tuple7) && Objects.equals(_7, tuple7._7);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), _7);
  }
}
