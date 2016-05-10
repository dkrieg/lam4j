package org.λ4j.structure;

import org.λ4j.λ0;

import java.util.Objects;

class λT8<A, B, C, D, E, F, G, H> extends λT7<A, B, C, D, E, F, G> implements P8<A, B, C, D, E, F, G, H> {

  private final λ0<H> _λ8;
  private volatile H _8;
  private volatile boolean loaded;

  λT8(A _1, B _2, C _3, D _4, E _5, F _6, G _7, H _8) {
    super(_1, _2, _3, _4, _5, _6, _7);
    this._λ8 = () -> _8;
    this._8 = _8;
  }

  λT8(λ0<A> _λ1, λ0<B> _λ2, λ0<C> _λ3, λ0<D> _λ4, λ0<E> _λ5, λ0<F> _λ6, λ0<G> _λ7, λ0<H> _λ8) {
    super(_λ1, _λ2, _λ3, _λ4, _λ5, _λ6, _λ7);
    this._λ8 = _λ8;
  }

  @Override
  public final H _8() {
    if (lazy && !loaded) {
      synchronized (lock) {
        if (!loaded) {
          _8 = _λ8.x();
          loaded = true;
        }
      }
    }
    return _8;
  }

  @Override
  @SuppressWarnings("unchecked")
  public <T> T _n(int index) {
    switch (index) {
      case 8:
        return (T) _8();
      default:
        return super._n(index);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof λT8)) return false;
    if (!super.equals(o)) return false;
    λT8<?, ?, ?, ?, ?, ?, ?, ?> tuple8 = (λT8<?, ?, ?, ?, ?, ?, ?, ?>) o;
    return super.equals(tuple8) && Objects.equals(_8(), tuple8._8());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), _8());
  }
}
