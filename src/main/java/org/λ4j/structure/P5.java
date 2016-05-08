package org.λ4j.structure;

public interface P5<A, B, C, D, E> extends P4<A, B, C, D> {
  @Override
  default Integer arity() {
    return 5;
  }

  E _5();
}
