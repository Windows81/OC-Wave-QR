package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f41455A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f41456z;

    public /* synthetic */ c(Ref.ObjectRef objectRef, boolean z2) {
        this.f41456z = objectRef;
        this.f41455A = z2;
    }

    public final Object m(Object obj, Object obj2) {
        return CoroutineContextKt.e(this.f41456z, this.f41455A, (CoroutineContext) obj, (CoroutineContext.Element) obj2);
    }
}
