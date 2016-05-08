package org.λ4j.structure;

public interface P8<A, B, C, D, E, F, G, H> extends P7<A, B, C, D, E, F, G> {
  @Override
  default Integer arity() {
    return 8;
  }

  H _8();
}
