package androidx.compose.foundation.gestures.snapping;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class SnapFlingBehavior$fling$result$1$animationState$1 extends Lambda implements Function1<Float, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f3666A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f3667z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$fling$result$1$animationState$1(Ref.FloatRef floatRef, Function1 function1) {
        super(1);
        this.f3667z = floatRef;
        this.f3666A = function1;
    }

    public final void b(float f2) {
        Ref.FloatRef floatRef = this.f3667z;
        float f3 = floatRef.f40905z - f2;
        floatRef.f40905z = f3;
        this.f3666A.invoke(Float.valueOf(f3));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Number) obj).floatValue());
        return Unit.f40552a;
    }
}
