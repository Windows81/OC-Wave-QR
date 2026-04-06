package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SeekableTransitionState$firstFrameLambda$1 extends Lambda implements Function1<Long, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SeekableTransitionState f2668z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$firstFrameLambda$1(SeekableTransitionState seekableTransitionState) {
        super(1);
        this.f2668z = seekableTransitionState;
    }

    public final void b(long j2) {
        this.f2668z.f2653l = j2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Number) obj).longValue());
        return Unit.f40552a;
    }
}
