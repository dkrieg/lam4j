package org.λ4j.structure;

public interface P7<A, B, C, D, E, F, G> extends P6<A, B, C, D, E, F> {
  @Override
  default Integer arity() {
    return 7;
  }

  G _7();
}
