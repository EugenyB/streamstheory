package demo;

public interface Mapper<U,T> {
    T map(U u);
}
