package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata
public final class AbstractMap$keys$1 extends AbstractSet<K> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AbstractMap f40573A;

    public AbstractMap$keys$1(AbstractMap abstractMap) {
        this.f40573A = abstractMap;
    }

    public boolean contains(Object obj) {
        return this.f40573A.containsKey(obj);
    }

    public int g() {
        return this.f40573A.size();
    }

    public Iterator iterator() {
        return new AbstractMap$keys$1$iterator$1(this.f40573A.entrySet().iterator());
    }
}
