package org.λ4j.structure;

import org.λ4j.λ0;

import java.util.Objects;

class λT4<A, B, C, D> extends λT3<A, B, C> implements P4<A, B, C, D> {

  private final λ0<D> _λ4;
  private volatile D _4;
  private volatile boolean loaded;

  λT4(A _1, B _2, C _3, D _4) {
    super(_1, _2, _3);
    this._λ4 = () -> _4;
    this._4 = _4;
  }

  λT4(λ0<A> _λ1, λ0<B> _λ2, λ0<C> _λ3, λ0<D> _λ4) {
    super(_λ1, _λ2, _λ3);
    this._λ4 = _λ4;
  }

  @Override
  public final D _4() {
    if (lazy && !loaded) {
      synchronized (lock) {
        if (!loaded) {
          _4 = _λ4.x();
          loaded = true;
        }
      }
    }
    return _4;
  }


  @Override
  @SuppressWarnings("unchecked")
  public <T> T _n(int index) {
    switch (index) {
      case 4:
        return (T) _4();
      default:
        return super._n(index);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof λT4)) return false;
    if (!super.equals(o)) return false;
    λT4<?, ?, ?, ?> tuple4 = (λT4<?, ?, ?, ?>) o;
    return super.equals(tuple4) && Objects.equals(_4(), tuple4._4());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), _4());
  }
}
