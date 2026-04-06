package kotlin;

@Metadata
public interface Lazy<T> {
    boolean b();

    Object getValue();
}
