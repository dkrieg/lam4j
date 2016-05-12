package org.λ4j.structure;

import org.λ4j.*;

public final class Lazy {
  private Lazy() {
    throw new UnsupportedOperationException();
  }

  public static <A> P1<A> λ(λ0<A> a) {
    return new λT1<>(a);
  }

  public static <A, B> P2<A, B> λ(λ0<A> a, λ0<B> b) {
    return new λT2<>(a, b);
  }

  public static <A, B, C> P3<A, B, C> λ(λ0<A> a, λ0<B> b, λ0<C> c) {
    return new λT3<>(a, b, c);
  }

  public static <A, B, C, D> P4<A, B, C, D> λ(λ0<A> a, λ0<B> b, λ0<C> c, λ0<D> d) {
    return new λT4<>(a, b, c, d);
  }

  public static <A, B, C, D, E> P5<A, B, C, D, E> λ(λ0<A> a, λ0<B> b, λ0<C> c, λ0<D> d, λ0<E> e) {
    return new λT5<>(a, b, c, d, e);
  }

  public static <A, B, C, D, E, F> P6<A, B, C, D, E, F> λ(λ0<A> a, λ0<B> b, λ0<C> c, λ0<D> d, λ0<E> e, λ0<F> f) {
    return new λT6<>(a, b, c, d, e, f);
  }

  public static <A, B, C, D, E, F, G> P7<A, B, C, D, E, F, G> λ(λ0<A> a, λ0<B> b, λ0<C> c, λ0<D> d, λ0<E> e, λ0<F> f, λ0<G> g) {
    return new λT7<>(a, b, c, d, e, f, g);
  }

  public static <A, B, C, D, E, F, G, H> P8<A, B, C, D, E, F, G, H> λ(λ0<A> a, λ0<B> b, λ0<C> c, λ0<D> d, λ0<E> e, λ0<F> f, λ0<G> g, λ0<H> h) {
    return new λT8<>(a, b, c, d, e, f, g, h);
  }

  public static <A> λ1<λ0<A>, P1<A>> p1() {
    return (λ1<λ0<A>, P1<A>>) Lazy::λ;
  }

  public static <A, B> λ2<λ0<A>, λ0<B>, P2<A, B>> p2() {
    return (λ2<λ0<A>, λ0<B>, P2<A, B>>) Lazy::λ;
  }

  public static <A, B, C> λ3<λ0<A>, λ0<B>, λ0<C>, P3<A, B, C>> p3() {
    return (λ3<λ0<A>, λ0<B>, λ0<C>, P3<A, B, C>>) Lazy::λ;
  }

  public static <A, B, C, D> λ4<λ0<A>, λ0<B>, λ0<C>, λ0<D>, P4<A, B, C, D>> p4() {
    return (λ4<λ0<A>, λ0<B>, λ0<C>, λ0<D>, P4<A, B, C, D>>) Lazy::λ;
  }

  public static <A, B, C, D, E> λ5<λ0<A>, λ0<B>, λ0<C>, λ0<D>, λ0<E>, P5<A, B, C, D, E>> p5() {
    return (λ5<λ0<A>, λ0<B>, λ0<C>, λ0<D>, λ0<E>, P5<A, B, C, D, E>>) Lazy::λ;
  }

  public static <A, B, C, D, E, F> λ6<λ0<A>, λ0<B>, λ0<C>, λ0<D>, λ0<E>, λ0<F>, P6<A, B, C, D, E, F>> p6() {
    return (λ6<λ0<A>, λ0<B>, λ0<C>, λ0<D>, λ0<E>, λ0<F>, P6<A, B, C, D, E, F>>) Lazy::λ;
  }

  public static <A, B, C, D, E, F, G> λ7<λ0<A>, λ0<B>, λ0<C>, λ0<D>, λ0<E>, λ0<F>, λ0<G>, P7<A, B, C, D, E, F, G>> p7() {
    return (λ7<λ0<A>, λ0<B>, λ0<C>, λ0<D>, λ0<E>, λ0<F>, λ0<G>, P7<A, B, C, D, E, F, G>>) Lazy::λ;
  }

  public static <A, B, C, D, E, F, G, H> λ8<λ0<A>, λ0<B>, λ0<C>, λ0<D>, λ0<E>, λ0<F>, λ0<G>, λ0<H>, P8<A, B, C, D, E, F, G, H>> p8() {
    return (λ8<λ0<A>, λ0<B>, λ0<C>, λ0<D>, λ0<E>, λ0<F>, λ0<G>, λ0<H>, P8<A, B, C, D, E, F, G, H>>) Lazy::λ;
  }
}
