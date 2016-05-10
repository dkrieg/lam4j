package org.λ4j.structure;

import org.λ4j.λ0;

import java.util.Objects;

class λT7<A, B, C, D, E, F, G> extends λT6<A, B, C, D, E, F> implements P7<A, B, C, D, E, F, G> {

  private final λ0<G> _λ7;
  private volatile G _7;
  private volatile boolean loaded;

  λT7(A _1, B _2, C _3, D _4, E _5, F _6, G _7) {
    super(_1, _2, _3, _4, _5, _6);
    this._λ7 = () -> _7;
    this._7 = _7;
  }

  λT7(λ0<A> _λ1, λ0<B> _λ2, λ0<C> _λ3, λ0<D> _λ4, λ0<E> _λ5, λ0<F> _λ6, λ0<G> _λ7) {
    super(_λ1, _λ2, _λ3, _λ4, _λ5, _λ6);
    this._λ7 = _λ7;
  }

  @Override
  public final G _7() {
    if (lazy && !loaded) {
      synchronized (lock) {
        if (!loaded) {
          _7 = _λ7.x();
          loaded = true;
        }
      }
    }
    return _7;
  }


  @Override
  @SuppressWarnings("unchecked")
  public <T> T _n(int index) {
    switch (index) {
      case 7:
        return (T) _7();
      default:
        return super._n(index);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof λT7)) return false;
    if (!super.equals(o)) return false;
    λT7<?, ?, ?, ?, ?, ?, ?> tuple7 = (λT7<?, ?, ?, ?, ?, ?, ?>) o;
    return super.equals(tuple7) && Objects.equals(_7(), tuple7._7());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), _7());
  }
}
