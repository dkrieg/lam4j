package org.λ4j.structure;

import org.λ4j.λ0;

import java.util.Objects;

class λT2<A, B> extends λT1<A> implements P2<A, B> {

  private final λ0<B> _λ2;
  private volatile B _2;
  private volatile boolean loaded;

  λT2(A _1, B _2) {
    super(_1);
    this._λ2 = () -> _2;
    this._2 = _2;
  }

  λT2(λ0<A> _λ1, λ0<B> _λ2) {
    super(_λ1);
    this._λ2 = _λ2;
  }

  @Override
  public final B _2() {
    if (lazy && !loaded) {
      synchronized (lock) {
        if (!loaded) {
          _2 = _λ2.x();
          loaded = true;
        }
      }
    }
    return _2;
  }


  @Override
  @SuppressWarnings("unchecked")
  public <T> T _n(int index) {
    switch (index) {
      case 2:
        return (T) _2();
      default:
        return super._n(index);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof λT2)) return false;
    if (!super.equals(o)) return false;
    λT2<?, ?> tuple2 = (λT2<?, ?>) o;
    return super.equals(tuple2) && Objects.equals(_2(), tuple2._2());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), _2());
  }
}
