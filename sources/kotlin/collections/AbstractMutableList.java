package kotlin.collections;

import java.util.AbstractList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableList;

@Metadata
public abstract class AbstractMutableList<E> extends AbstractList<E> implements List<E>, KMutableList {
    public abstract int e();

    public abstract Object g(int i2);

    public final /* bridge */ Object remove(int i2) {
        return g(i2);
    }

    public final /* bridge */ int size() {
        return e();
    }
}
