package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

public class LazyField extends LazyFieldLite {

    /* renamed from: e  reason: collision with root package name */
    public final MessageLite f21036e;

    public static class LazyEntry<K> implements Map.Entry<K, Object> {

        /* renamed from: z  reason: collision with root package name */
        public Map.Entry f21037z;

        public LazyField a() {
            return (LazyField) this.f21037z.getValue();
        }

        public Object getKey() {
            return this.f21037z.getKey();
        }

        public Object getValue() {
            LazyField lazyField = (LazyField) this.f21037z.getValue();
            if (lazyField == null) {
                return null;
            }
            return lazyField.f();
        }

        public Object setValue(Object obj) {
            if (obj instanceof MessageLite) {
                return ((LazyField) this.f21037z.getValue()).d((MessageLite) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public LazyEntry(Map.Entry entry) {
            this.f21037z = entry;
        }
    }

    public static class LazyIterator<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: z  reason: collision with root package name */
        public Iterator f21038z;

        public LazyIterator(Iterator it) {
            this.f21038z = it;
        }

        /* renamed from: b */
        public Map.Entry next() {
            Map.Entry entry = (Map.Entry) this.f21038z.next();
            return entry.getValue() instanceof LazyField ? new LazyEntry(entry) : entry;
        }

        public boolean hasNext() {
            return this.f21038z.hasNext();
        }

        public void remove() {
            this.f21038z.remove();
        }
    }

    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public MessageLite f() {
        return c(this.f21036e);
    }

    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
