package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LookaheadPassDelegate$performMeasure$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f17343A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LookaheadPassDelegate f17344z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LookaheadPassDelegate$performMeasure$1(LookaheadPassDelegate lookaheadPassDelegate, long j2) {
        super(0);
        this.f17344z = lookaheadPassDelegate;
        this.f17343A = j2;
    }

    public final void invoke() {
        LookaheadDelegate Q2 = this.f17344z.x1().Q2();
        Intrinsics.f(Q2);
        Q2.c0(this.f17343A);
    }
}
