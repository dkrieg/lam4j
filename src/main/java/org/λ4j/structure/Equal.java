package org.λ4j.structure;

import org.λ4j.λ1;
import org.λ4j.λ2;

import java.math.BigDecimal;
import java.math.BigInteger;

public final class Equal<A> {
  private final λ1<A, λ1<A, Boolean>> λe;

  private Equal(λ1<A, λ1<A, Boolean>> λe) {
    this.λe = λe;
  }

  public static <A> Equal<A> of(final λ1<A, λ1<A, Boolean>> λe) {
    return new Equal<>(λe);
  }

  public boolean eq(final A a1, final A a2) {
    return λe.x(a1).x(a2);
  }

  public boolean notEq(final A a1, final A a2) {
    return !eq(a1, a2);
  }

  public λ2<A, A, Boolean> eq() {
    return this::eq;
  }

  public λ1<A, Boolean> eq(A a) {
    return b -> eq(a, b);
  }

  public <B> Equal<B> contramap(final λ1<B, A> f) {
    λ1<λ1<A, Boolean>, λ1<B, Boolean>> g = f::andThen;
    return of(f.andThen(λe).andThen(g));
  }

  public static <A> Equal<A> anyEqual() {
    return of(a -> a::equals);
  }

  public static final Equal<Boolean> booleanEqual = anyEqual();
  public static final Equal<Byte> byteEqual = anyEqual();
  public static final Equal<Character> charEqual = anyEqual();
  public static final Equal<Double> doubleEqual = anyEqual();
  public static final Equal<Float> floatEqual = anyEqual();
  public static final Equal<Integer> integerEqual = anyEqual();
  public static final Equal<BigInteger> bigIntegerEqual = anyEqual();
  public static final Equal<BigDecimal> bigDecimalEqual = anyEqual();
  public static final Equal<Long> longEqual = anyEqual();
  public static final Equal<Short> shortEqual = anyEqual();
  public static final Equal<String> stringEqual = anyEqual();
  public static final Equal<CharSequence> charSequenceEqual =
    of(sb1 -> sb2 -> {
      if (sb1.length() == sb2.length()) {
        for (int i = 0; i < sb1.length(); i++) {
          if (sb1.charAt(i) != sb2.charAt(i)) {
            return false;
          }
        }
        return true;
      } else
        return false;
    });

  public static <A> Equal<P1<A>> p1Equal(final Equal<A> ea) {
    return of(p1 -> p2 -> ea.eq(p1._1(), p2._1()));
  }

  public static <A, B> Equal<P2<A, B>> p2Equal(final Equal<A> ea, final Equal<B> eb) {
    return of(p1 -> p2 -> ea.eq(p1._1(), p2._1()) && eb.eq(p1._2(), p2._2()));
  }

  public static <A, B, C> Equal<P3<A, B, C>> p3Equal(final Equal<A> ea, final Equal<B> eb, final Equal<C> ec) {
    return of(p1 -> p2 -> ea.eq(p1._1(), p2._1()) && eb.eq(p1._2(), p2._2()) && ec.eq(p1._3(), p2._3()));
  }

  public static <A, B, C, D> Equal<P4<A, B, C, D>> p4Equal(
    final Equal<A> ea, final Equal<B> eb, final Equal<C> ec, final Equal<D> ed) {
    return of(p1 -> p2 -> ea.eq(p1._1(), p2._1()) && eb.eq(p1._2(), p2._2()) && ec.eq(p1._3(), p2._3()) &&
      ed.eq(p1._4(), p2._4()));
  }

  public static <A, B, C, D, E> Equal<P5<A, B, C, D, E>> p5Equal(
    final Equal<A> ea, final Equal<B> eb, final Equal<C> ec, final Equal<D> ed, final Equal<E> ee) {
    return of(p1 -> p2 -> ea.eq(p1._1(), p2._1()) && eb.eq(p1._2(), p2._2()) && ec.eq(p1._3(), p2._3()) &&
      ed.eq(p1._4(), p2._4()) && ee.eq(p1._5(), p2._5()));
  }

  public static <A, B, C, D, E, F> Equal<P6<A, B, C, D, E, F>> p6Equal(
    final Equal<A> ea, final Equal<B> eb, final Equal<C> ec,
    final Equal<D> ed, final Equal<E> ee, final Equal<F> ef) {
    return of(p1 -> p2 -> ea.eq(p1._1(), p2._1()) && eb.eq(p1._2(), p2._2()) && ec.eq(p1._3(), p2._3()) &&
      ed.eq(p1._4(), p2._4()) && ee.eq(p1._5(), p2._5()) && ef.eq(p1._6(), p2._6()));
  }

  public static <A, B, C, D, E, F, G> Equal<P7<A, B, C, D, E, F, G>> p7Equal(
    final Equal<A> ea, final Equal<B> eb, final Equal<C> ec, final Equal<D> ed,
    final Equal<E> ee, final Equal<F> ef, final Equal<G> eg) {
    return of(p1 -> p2 -> ea.eq(p1._1(), p2._1()) && eb.eq(p1._2(), p2._2()) && ec.eq(p1._3(), p2._3()) &&
      ed.eq(p1._4(), p2._4()) && ee.eq(p1._5(), p2._5()) && ef.eq(p1._6(), p2._6()) &&
      eg.eq(p1._7(), p2._7()));
  }

  public static <A, B, C, D, E, F, G, H> Equal<P8<A, B, C, D, E, F, G, H>> p8Equal(
    final Equal<A> ea, final Equal<B> eb, final Equal<C> ec, final Equal<D> ed,
    final Equal<E> ee, final Equal<F> ef, final Equal<G> eg, final Equal<H> eh) {
    return of(
      p1 -> p2 -> ea.eq(p1._1(), p2._1()) && eb.eq(p1._2(), p2._2()) && ec.eq(p1._3(), p2._3()) &&
        ed.eq(p1._4(), p2._4()) && ee.eq(p1._5(), p2._5()) && ef.eq(p1._6(), p2._6()) &&
        eg.eq(p1._7(), p2._7()) && eh.eq(p1._8(), p2._8()));
  }
}
