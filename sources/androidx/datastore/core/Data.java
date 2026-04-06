package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class Data<T> extends State<T> {

    /* renamed from: b  reason: collision with root package name */
    public final Object f20544b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20545c;

    public Data(Object obj, int i2, int i3) {
        super(i3, (DefaultConstructorMarker) null);
        this.f20544b = obj;
        this.f20545c = i2;
    }

    public final void b() {
        Object obj = this.f20544b;
        if ((obj != null ? obj.hashCode() : 0) != this.f20545c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final Object c() {
        return this.f20544b;
    }
}
