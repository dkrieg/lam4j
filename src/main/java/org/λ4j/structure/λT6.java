package org.λ4j.structure;

import org.λ4j.λ0;

import java.util.Objects;

class λT6<A, B, C, D, E, F> extends λT5<A, B, C, D, E> implements P6<A, B, C, D, E, F> {

  private final λ0<F> _λ6;
  private volatile F _6;
  private volatile boolean loaded;

  λT6(A _1, B _2, C _3, D _4, E _5, F _6) {
    super(_1, _2, _3, _4, _5);
    this._λ6 = () -> _6;
    this._6 = _6;
  }

  λT6(λ0<A> _λ1, λ0<B> _λ2, λ0<C> _λ3, λ0<D> _λ4, λ0<E> _λ5, λ0<F> _λ6) {
    super(_λ1, _λ2, _λ3, _λ4, _λ5);
    this._λ6 = _λ6;
  }

  @Override
  public final F _6() {
    if (lazy && !loaded) {
      synchronized (lock) {
        if (!loaded) {
          _6 = _λ6.x();
          loaded = true;
        }
      }
    }
    return _6;
  }


  @Override
  @SuppressWarnings("unchecked")
  public <T> T _n(int index) {
    switch (index) {
      case 6:
        return (T) _6();
      default:
        return super._n(index);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof λT6)) return false;
    if (!super.equals(o)) return false;
    λT6<?, ?, ?, ?, ?, ?> tuple6 = (λT6<?, ?, ?, ?, ?, ?>) o;
    return super.equals(tuple6) && Objects.equals(_6(), tuple6._6());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), _6());
  }
}
