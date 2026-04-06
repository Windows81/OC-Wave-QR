package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class MutableVectorWithMutationTracking<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final int f17372c = MutableVector.C;

    /* renamed from: a  reason: collision with root package name */
    public final MutableVector f17373a;

    /* renamed from: b  reason: collision with root package name */
    public final Function0 f17374b;

    public MutableVectorWithMutationTracking(MutableVector mutableVector, Function0 function0) {
        this.f17373a = mutableVector;
        this.f17374b = function0;
    }

    public final void a(int i2, Object obj) {
        this.f17373a.a(i2, obj);
        this.f17374b.invoke();
    }

    public final void b() {
        this.f17373a.l();
        this.f17374b.invoke();
    }

    public final MutableVector c() {
        return this.f17373a;
    }

    public final Object d(int i2) {
        Object y2 = this.f17373a.y(i2);
        this.f17374b.invoke();
        return y2;
    }
}
