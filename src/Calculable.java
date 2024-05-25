public interface Calculable<E> {
    void sum(E a, E b);

    void substract(E a, E b);

    void multiply(E a, E b);

    void division(E a, E b);

    E result();

    void resetResult();
}
