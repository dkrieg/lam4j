package org.λ4j.structure;

import org.λ4j.λ0;

import java.util.Objects;

class λT3<A, B, C> extends λT2<A, B> implements P3<A, B, C> {

  private final λ0<C> _λ3;
  private volatile C _3;
  private volatile boolean loaded;

  λT3(A _1, B _2, C _3) {
    super(_1, _2);
    this._λ3 = () -> _3;
    this._3 = _3;
  }

  λT3(λ0<A> _λ1, λ0<B> _λ2, λ0<C> _λ3) {
    super(_λ1, _λ2);
    this._λ3 = _λ3;
  }

  @Override
  public final C _3() {
    if (lazy && !loaded) {
      synchronized (lock) {
        if (!loaded) {
          _3 = _λ3.x();
          loaded = true;
        }
      }
    }
    return _3;
  }


  @Override
  @SuppressWarnings("unchecked")
  public <T> T _n(int index) {
    switch (index) {
      case 3:
        return (T) _3();
      default:
        return super._n(index);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof λT3)) return false;
    if (!super.equals(o)) return false;
    λT3<?, ?, ?> tuple3 = (λT3<?, ?, ?>) o;
    return super.equals(tuple3) && Objects.equals(_3(), tuple3._3());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), _3());
  }
}
