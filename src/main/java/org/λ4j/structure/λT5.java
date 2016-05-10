package org.λ4j.structure;

import org.λ4j.λ0;

import java.util.Objects;

class λT5<A, B, C, D, E> extends λT4<A, B, C, D> implements P5<A, B, C, D, E> {

  private final λ0<E> _λ5;
  private volatile E _5;
  private volatile boolean loaded;

  λT5(A _1, B _2, C _3, D _4, E _5) {
    super(_1, _2, _3, _4);
    this._λ5 = () -> _5;
    this._5 = _5;
  }

  λT5(λ0<A> _λ1, λ0<B> _λ2, λ0<C> _λ3, λ0<D> _λ4, λ0<E> _λ5) {
    super(_λ1, _λ2, _λ3, _λ4);
    this._λ5 = _λ5;
  }

  @Override
  public final E _5() {
    if (lazy && !loaded) {
      synchronized (lock) {
        if (!loaded) {
          _5 = _λ5.x();
          loaded = true;
        }
      }
    }
    return _5;
  }


  @Override
  @SuppressWarnings("unchecked")
  public <T> T _n(int index) {
    switch (index) {
      case 5:
        return (T) _5();
      default:
        return super._n(index);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof λT5)) return false;
    if (!super.equals(o)) return false;
    λT5<?, ?, ?, ?, ?> tuple5 = (λT5<?, ?, ?, ?, ?>) o;
    return super.equals(tuple5) && Objects.equals(_5(), tuple5._5());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), _5());
  }
}
