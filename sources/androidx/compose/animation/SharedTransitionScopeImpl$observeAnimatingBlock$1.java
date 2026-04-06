package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SharedTransitionScopeImpl$observeAnimatingBlock$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SharedTransitionScopeImpl f2349z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeImpl$observeAnimatingBlock$1(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        super(0);
        this.f2349z = sharedTransitionScopeImpl;
    }

    public final void invoke() {
        MutableScatterMap a2 = this.f2349z.I;
        Object[] objArr = a2.f1960b;
        Object[] objArr2 = a2.f1961c;
        long[] jArr = a2.f1959a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            if (((SharedElement) objArr2[i5]).l()) {
                                return;
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }
}
