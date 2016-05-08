package org.λ4j.structure;

public interface P3<A, B, C> extends P2<A, B> {
  @Override
  default Integer arity() {
    return 3;
  }

  C _3();
}
