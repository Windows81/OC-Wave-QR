package androidx.activity.contextaware;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ContextAwareKt$withContextAvailable$2$1 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ContextAwareKt$withContextAvailable$2$listener$1 f195A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ContextAware f196z;

    public final void b(Throwable th) {
        this.f196z.l(this.f195A);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return Unit.f40552a;
    }
}
