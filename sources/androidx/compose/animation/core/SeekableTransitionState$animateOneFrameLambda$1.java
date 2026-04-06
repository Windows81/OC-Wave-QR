package androidx.compose.animation.core;

import androidx.collection.MutableObjectList;
import androidx.compose.animation.core.SeekableTransitionState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata
public final class SeekableTransitionState$animateOneFrameLambda$1 extends Lambda implements Function1<Long, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SeekableTransitionState f2667z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$animateOneFrameLambda$1(SeekableTransitionState seekableTransitionState) {
        super(1);
        this.f2667z = seekableTransitionState;
    }

    public final void b(long j2) {
        this.f2667z.f2653l = j2;
        long e2 = MathKt.e(((double) (j2 - this.f2667z.f2653l)) / ((double) this.f2667z.f2657p));
        if (this.f2667z.f2654m.h()) {
            MutableObjectList m2 = this.f2667z.f2654m;
            SeekableTransitionState seekableTransitionState = this.f2667z;
            Object[] objArr = m2.f1937a;
            int i2 = m2.f1938b;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                SeekableTransitionState.SeekingAnimationState seekingAnimationState = (SeekableTransitionState.SeekingAnimationState) objArr[i4];
                seekableTransitionState.N(seekingAnimationState, e2);
                seekingAnimationState.k(true);
            }
            Transition p2 = this.f2667z.f2646e;
            if (p2 != null) {
                p2.Q();
            }
            MutableObjectList m3 = this.f2667z.f2654m;
            int i5 = m3.f1938b;
            Object[] objArr2 = m3.f1937a;
            IntRange v2 = RangesKt.v(0, i5);
            int n2 = v2.n();
            int o2 = v2.o();
            if (n2 <= o2) {
                while (true) {
                    objArr2[n2 - i3] = objArr2[n2];
                    if (((SeekableTransitionState.SeekingAnimationState) objArr2[n2]).h()) {
                        i3++;
                    }
                    if (n2 == o2) {
                        break;
                    }
                    n2++;
                }
            }
            ArraysKt.w(objArr2, (Object) null, i5 - i3, i5);
            m3.f1938b -= i3;
        }
        SeekableTransitionState.SeekingAnimationState k2 = this.f2667z.f2655n;
        if (k2 != null) {
            k2.l(this.f2667z.J());
            this.f2667z.N(k2, e2);
            this.f2667z.U(k2.g());
            if (k2.g() == 1.0f) {
                this.f2667z.f2655n = null;
            }
            this.f2667z.R();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Number) obj).longValue());
        return Unit.f40552a;
    }
}
