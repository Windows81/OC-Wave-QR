package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class UpdatableAnimationState$animateToZero$5 extends Lambda implements Function1<Long, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f3642A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ UpdatableAnimationState f3643z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatableAnimationState$animateToZero$5(UpdatableAnimationState updatableAnimationState, Function1 function1) {
        super(1);
        this.f3643z = updatableAnimationState;
        this.f3642A = function1;
    }

    public final void b(long j2) {
        float i2 = this.f3643z.i();
        this.f3643z.j(0.0f);
        this.f3642A.invoke(Float.valueOf(i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Number) obj).longValue());
        return Unit.f40552a;
    }
}
