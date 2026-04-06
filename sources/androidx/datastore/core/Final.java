package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Final<T> extends State<T> {

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f20592b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Final(Throwable th) {
        super(Integer.MAX_VALUE, (DefaultConstructorMarker) null);
        Intrinsics.i(th, "finalException");
        this.f20592b = th;
    }

    public final Throwable b() {
        return this.f20592b;
    }
}
