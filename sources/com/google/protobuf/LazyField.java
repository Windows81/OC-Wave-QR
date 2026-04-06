package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

public class LazyField extends LazyFieldLite {

    /* renamed from: f  reason: collision with root package name */
    public final MessageLite f32193f;

    public static class LazyEntry<K> implements Map.Entry<K, Object> {

        /* renamed from: z  reason: collision with root package name */
        public Map.Entry f32194z;

        public LazyField a() {
            return (LazyField) this.f32194z.getValue();
        }

        public Object getKey() {
            return this.f32194z.getKey();
        }

        public Object getValue() {
            LazyField lazyField = (LazyField) this.f32194z.getValue();
            if (lazyField == null) {
                return null;
            }
            return lazyField.f();
        }

        public Object setValue(Object obj) {
            if (obj instanceof MessageLite) {
                return ((LazyField) this.f32194z.getValue()).d((MessageLite) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public LazyEntry(Map.Entry entry) {
            this.f32194z = entry;
        }
    }

    public static class LazyIterator<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: z  reason: collision with root package name */
        public Iterator f32195z;

        public LazyIterator(Iterator it) {
            this.f32195z = it;
        }

        /* renamed from: b */
        public Map.Entry next() {
            Map.Entry entry = (Map.Entry) this.f32195z.next();
            return entry.getValue() instanceof LazyField ? new LazyEntry(entry) : entry;
        }

        public boolean hasNext() {
            return this.f32195z.hasNext();
        }

        public void remove() {
            this.f32195z.remove();
        }
    }

    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public MessageLite f() {
        return c(this.f32193f);
    }

    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
