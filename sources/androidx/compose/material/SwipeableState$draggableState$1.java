package androidx.compose.material;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

@Metadata
public final class SwipeableState$draggableState$1 extends Lambda implements Function1<Float, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SwipeableState f8608z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableState$draggableState$1(SwipeableState swipeableState) {
        super(1);
        this.f8608z = swipeableState;
    }

    public final void b(float f2) {
        float c2 = this.f8608z.f8587g.c() + f2;
        float n2 = RangesKt.n(c2, this.f8608z.s(), this.f8608z.r());
        float f3 = c2 - n2;
        ResistanceConfig u2 = this.f8608z.u();
        this.f8608z.f8585e.j(n2 + (u2 != null ? u2.a(f3) : 0.0f));
        this.f8608z.f8586f.j(f3);
        this.f8608z.f8587g.j(c2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Number) obj).floatValue());
        return Unit.f40552a;
    }
}
