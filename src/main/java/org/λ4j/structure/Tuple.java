package org.λ4j.structure;

import org.λ4j.*;

public final class Tuple {
  private Tuple() {
    throw new UnsupportedOperationException();
  }

  public static <A> P1<A> λ(A a) {
    return new λT1<>(a);
  }

  public static <A, B> P2<A, B> λ(A a, B b) {
    return new λT2<>(a, b);
  }

  public static <A, B, C> P3<A, B, C> λ(A a, B b, C c) {
    return new λT3<>(a, b, c);
  }

  public static <A, B, C, D> P4<A, B, C, D> λ(A a, B b, C c, D d) {
    return new λT4<>(a, b, c, d);
  }

  public static <A, B, C, D, E> P5<A, B, C, D, E> λ(A a, B b, C c, D d, E e) {
    return new λT5<>(a, b, c, d, e);
  }

  public static <A, B, C, D, E, F> P6<A, B, C, D, E, F> λ(A a, B b, C c, D d, E e, F f) {
    return new λT6<>(a, b, c, d, e, f);
  }

  public static <A, B, C, D, E, F, G> P7<A, B, C, D, E, F, G> λ(A a, B b, C c, D d, E e, F f, G g) {
    return new λT7<>(a, b, c, d, e, f, g);
  }

  public static <A, B, C, D, E, F, G, H> P8<A, B, C, D, E, F, G, H> λ(A a, B b, C c, D d, E e, F f, G g, H h) {
    return new λT8<>(a, b, c, d, e, f, g, h);
  }

  public static <A> λ1<A, P1<A>> p1() {
    return (λ1<A, P1<A>>) Tuple::λ;
  }

  public static <A, B> λ2<A, B, P2<A, B>> p2() {
    return (λ2<A, B, P2<A, B>>) Tuple::λ;
  }

  public static <A, B, C> λ3<A, B, C, P3<A, B, C>> p3() {
    return (λ3<A, B, C, P3<A, B, C>>) Tuple::λ;
  }

  public static <A, B, C, D> λ4<A, B, C, D, P4<A, B, C, D>> p4() {
    return (λ4<A, B, C, D, P4<A, B, C, D>>) Tuple::λ;
  }

  public static <A, B, C, D, E> λ5<A, B, C, D, E, P5<A, B, C, D, E>> p5() {
    return (λ5<A, B, C, D, E, P5<A, B, C, D, E>>) Tuple::λ;
  }

  public static <A, B, C, D, E, F> λ6<A, B, C, D, E, F, P6<A, B, C, D, E, F>> p6() {
    return (λ6<A, B, C, D, E, F, P6<A, B, C, D, E, F>>) Tuple::λ;
  }

  public static <A, B, C, D, E, F, G> λ7<A, B, C, D, E, F, G, P7<A, B, C, D, E, F, G>> p7() {
    return (λ7<A, B, C, D, E, F, G, P7<A, B, C, D, E, F, G>>) Tuple::λ;
  }

  public static <A, B, C, D, E, F, G, H> λ8<A, B, C, D, E, F, G, H, P8<A, B, C, D, E, F, G, H>> p8() {
    return (λ8<A, B, C, D, E, F, G, H, P8<A, B, C, D, E, F, G, H>>) Tuple::λ;
  }
}
