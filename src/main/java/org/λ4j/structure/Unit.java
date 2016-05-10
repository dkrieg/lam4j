package org.λ4j.structure;

public final class Unit {
  private static final Unit u = new Unit();

  private Unit() {

  }

  public static Unit unit() {
    return u;
  }

  @Override
  public String toString() {
    return "unit";
  }
}
