package org.λ4j.structure;

public interface P4<A, B, C, D> extends P3<A, B, C> {
  @Override
  default Integer arity() {
    return 4;
  }

  D _4();
}
