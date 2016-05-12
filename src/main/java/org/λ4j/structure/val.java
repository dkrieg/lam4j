package org.λ4j.structure;

import org.λ4j.λ0;

public interface Val<A> extends λ0<A> {

  static <A> Val<A> val(A a) {
    return Tuple.λ(a)::_1;
  }

  static <A> Val<A> lazyVal(λ0<A> a) {
    return Lazy.λ(a)::_1;
  }
}
