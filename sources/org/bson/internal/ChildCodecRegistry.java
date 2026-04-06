package org.bson.internal;

import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecRegistry;

class ChildCodecRegistry<T> implements CodecRegistry {

    /* renamed from: a  reason: collision with root package name */
    public final ChildCodecRegistry f43885a;

    /* renamed from: b  reason: collision with root package name */
    public final CycleDetectingCodecRegistry f43886b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f43887c;

    public ChildCodecRegistry(CycleDetectingCodecRegistry cycleDetectingCodecRegistry, Class cls) {
        this.f43887c = cls;
        this.f43885a = null;
        this.f43886b = cycleDetectingCodecRegistry;
    }

    public Codec a(Class cls) {
        return d(cls).booleanValue() ? new LazyCodec(this.f43886b, cls) : this.f43886b.c(new ChildCodecRegistry(this, cls));
    }

    public Class b() {
        return this.f43887c;
    }

    public final Boolean d(Class cls) {
        for (ChildCodecRegistry childCodecRegistry = this; childCodecRegistry != null; childCodecRegistry = childCodecRegistry.f43885a) {
            if (childCodecRegistry.f43887c.equals(cls)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChildCodecRegistry childCodecRegistry = (ChildCodecRegistry) obj;
        if (!this.f43887c.equals(childCodecRegistry.f43887c)) {
            return false;
        }
        ChildCodecRegistry childCodecRegistry2 = this.f43885a;
        if (childCodecRegistry2 == null ? childCodecRegistry.f43885a == null : childCodecRegistry2.equals(childCodecRegistry.f43885a)) {
            return this.f43886b.equals(childCodecRegistry.f43886b);
        }
        return false;
    }

    public int hashCode() {
        ChildCodecRegistry childCodecRegistry = this.f43885a;
        return ((((childCodecRegistry != null ? childCodecRegistry.hashCode() : 0) * 31) + this.f43886b.hashCode()) * 31) + this.f43887c.hashCode();
    }

    public ChildCodecRegistry(ChildCodecRegistry childCodecRegistry, Class cls) {
        this.f43885a = childCodecRegistry;
        this.f43887c = cls;
        this.f43886b = childCodecRegistry.f43886b;
    }
}
