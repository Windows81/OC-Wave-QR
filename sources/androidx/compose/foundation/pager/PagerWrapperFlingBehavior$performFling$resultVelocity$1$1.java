package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

@Metadata
public final class PagerWrapperFlingBehavior$performFling$resultVelocity$1$1 extends Lambda implements Function1<Float, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ScrollScope f5401A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PagerWrapperFlingBehavior f5402z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerWrapperFlingBehavior$performFling$resultVelocity$1$1(PagerWrapperFlingBehavior pagerWrapperFlingBehavior, ScrollScope scrollScope) {
        super(1);
        this.f5402z = pagerWrapperFlingBehavior;
        this.f5401A = scrollScope;
    }

    public final void b(float f2) {
        this.f5402z.d().o0(this.f5401A, MathKt.d(this.f5402z.d().J() != 0 ? f2 / ((float) this.f5402z.d().J()) : 0.0f) + this.f5402z.d().v());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Number) obj).floatValue());
        return Unit.f40552a;
    }
}
