package org.λ4j.structure;

public final class Tuple {
  private Tuple() {
    throw new UnsupportedOperationException();
  }

  public static <A> T1<A> of(A a) {
    return new T1<>(a);
  }

  public static <A, B> T2<A, B> of(A a, B b) {
    return new T2<>(a, b);
  }

  public static <A, B, C> T3<A, B, C> of(A a, B b, C c) {
    return new T3<>(a, b, c);
  }

  public static <A, B, C, D> T4<A, B, C, D> of(A a, B b, C c, D d) {
    return new T4<>(a, b, c, d);
  }

  public static <A, B, C, D, E> T5<A, B, C, D, E> of(A a, B b, C c, D d, E e) {
    return new T5<>(a, b, c, d, e);
  }

  public static <A, B, C, D, E, F> T6<A, B, C, D, E, F> of(A a, B b, C c, D d, E e, F f) {
    return new T6<>(a, b, c, d, e, f);
  }

  public static <A, B, C, D, E, F, G> T7<A, B, C, D, E, F, G> of(A a, B b, C c, D d, E e, F f, G g) {
    return new T7<>(a, b, c, d, e, f, g);
  }

  public static <A, B, C, D, E, F, G, H> T8<A, B, C, D, E, F, G, H> of(A a, B b, C c, D d, E e, F f, G g, H h) {
    return new T8<>(a, b, c, d, e, f, g, h);
  }

}
