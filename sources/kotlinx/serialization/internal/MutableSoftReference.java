package kotlinx.serialization.internal;

import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class MutableSoftReference<T> {

    /* renamed from: a  reason: collision with root package name */
    public volatile SoftReference f42153a = new SoftReference((Object) null);

    public final synchronized Object a(Function0 function0) {
        Intrinsics.i(function0, "factory");
        Object obj = this.f42153a.get();
        if (obj != null) {
            return obj;
        }
        Object invoke = function0.invoke();
        this.f42153a = new SoftReference(invoke);
        return invoke;
    }
}
