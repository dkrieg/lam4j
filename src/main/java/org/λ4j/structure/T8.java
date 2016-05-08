package org.λ4j.structure;

import java.util.Objects;

public class T8<A, B, C, D, E, F, G, H> extends T7<A, B, C, D, E, F, G> implements P8<A, B, C, D, E, F, G, H> {

  public final H _8;

  T8(A _1, B _2, C _3, D _4, E _5, F _6, G _7, H _8) {
    super(_1, _2, _3, _4, _5, _6, _7);
    this._8 = _8;
  }

  @Override
  public final H _8() {
    return _8;
  }


  @Override
  @SuppressWarnings("unchecked")
  public <T> T _n(int index) {
    switch (index) {
      case 8:
        return (T) _8;
      default:
        return super._n(index);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof T8)) return false;
    if (!super.equals(o)) return false;
    T8<?, ?, ?, ?, ?, ?, ?, ?> tuple8 = (T8<?, ?, ?, ?, ?, ?, ?, ?>) o;
    return super.equals(tuple8) && Objects.equals(_8, tuple8._8);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), _8);
  }
}
