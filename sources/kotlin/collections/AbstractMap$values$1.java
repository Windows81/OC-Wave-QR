package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata
public final class AbstractMap$values$1 extends AbstractCollection<V> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AbstractMap f40575z;

    public AbstractMap$values$1(AbstractMap abstractMap) {
        this.f40575z = abstractMap;
    }

    public boolean contains(Object obj) {
        return this.f40575z.containsValue(obj);
    }

    public int g() {
        return this.f40575z.size();
    }

    public Iterator iterator() {
        return new AbstractMap$values$1$iterator$1(this.f40575z.entrySet().iterator());
    }
}
