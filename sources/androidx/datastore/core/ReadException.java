package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ReadException<T> extends State<T> {

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f20623b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReadException(Throwable th, int i2) {
        super(i2, (DefaultConstructorMarker) null);
        Intrinsics.i(th, "readException");
        this.f20623b = th;
    }

    public final Throwable b() {
        return this.f20623b;
    }
}
