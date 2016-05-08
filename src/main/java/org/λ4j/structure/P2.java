package org.λ4j.structure;

public interface P2<A, B> extends P1<A> {
  @Override
  default Integer arity() {
    return 2;
  }

  B _2();
}
