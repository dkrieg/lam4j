package org.λ4j.structure;

public interface P6<A, B, C, D, E, F> extends P5<A, B, C, D, E> {
  @Override
  default Integer arity() {
    return 6;
  }

  F _6();
}
