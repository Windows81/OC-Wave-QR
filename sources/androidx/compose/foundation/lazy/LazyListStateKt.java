package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.DensityKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata
public final class LazyListStateKt {

    /* renamed from: a  reason: collision with root package name */
    public static final LazyListMeasureResult f4497a;

    static {
        LazyListStateKt$EmptyLazyListMeasureResult$1 lazyListStateKt$EmptyLazyListMeasureResult$1 = r0;
        LazyListStateKt$EmptyLazyListMeasureResult$1 lazyListStateKt$EmptyLazyListMeasureResult$12 = new LazyListStateKt$EmptyLazyListMeasureResult$1();
        f4497a = new LazyListMeasureResult((LazyListMeasuredItem) null, 0, false, 0.0f, lazyListStateKt$EmptyLazyListMeasureResult$1, 0.0f, false, CoroutineScopeKt.a(EmptyCoroutineContext.f40721z), DensityKt.b(1.0f, 0.0f, 2, (Object) null), ConstraintsKt.b(0, 0, 0, 0, 15, (Object) null), CollectionsKt.m(), 0, 0, 0, false, Orientation.Vertical, 0, 0, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.lazy.LazyListState b(int r10, int r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            r0 = r14 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0006
            r10 = r1
        L_0x0006:
            r14 = r14 & 2
            if (r14 == 0) goto L_0x000b
            r11 = r1
        L_0x000b:
            boolean r14 = androidx.compose.runtime.ComposerKt.P()
            if (r14 == 0) goto L_0x001a
            r14 = -1
            java.lang.String r0 = "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:74)"
            r2 = 1470655220(0x57a86af4, float:3.70354627E14)
            androidx.compose.runtime.ComposerKt.Y(r2, r13, r14, r0)
        L_0x001a:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            androidx.compose.foundation.lazy.LazyListState$Companion r14 = androidx.compose.foundation.lazy.LazyListState.f4463x
            androidx.compose.runtime.saveable.Saver r4 = r14.a()
            r14 = r13 & 14
            r14 = r14 ^ 6
            r0 = 4
            r2 = 1
            if (r14 <= r0) goto L_0x0030
            boolean r14 = r12.i(r10)
            if (r14 != 0) goto L_0x0034
        L_0x0030:
            r14 = r13 & 6
            if (r14 != r0) goto L_0x0036
        L_0x0034:
            r14 = r2
            goto L_0x0037
        L_0x0036:
            r14 = r1
        L_0x0037:
            r0 = r13 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r5 = 32
            if (r0 <= r5) goto L_0x0045
            boolean r0 = r12.i(r11)
            if (r0 != 0) goto L_0x0049
        L_0x0045:
            r13 = r13 & 48
            if (r13 != r5) goto L_0x004a
        L_0x0049:
            r1 = r2
        L_0x004a:
            r13 = r14 | r1
            java.lang.Object r14 = r12.g()
            if (r13 != 0) goto L_0x005a
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r13.a()
            if (r14 != r13) goto L_0x0062
        L_0x005a:
            androidx.compose.foundation.lazy.LazyListStateKt$rememberLazyListState$1$1 r14 = new androidx.compose.foundation.lazy.LazyListStateKt$rememberLazyListState$1$1
            r14.<init>(r10, r11)
            r12.N(r14)
        L_0x0062:
            r6 = r14
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r8 = 0
            r9 = 4
            r5 = 0
            r7 = r12
            java.lang.Object r10 = androidx.compose.runtime.saveable.RememberSaveableKt.h(r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.foundation.lazy.LazyListState r10 = (androidx.compose.foundation.lazy.LazyListState) r10
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x0078
            androidx.compose.runtime.ComposerKt.X()
        L_0x0078:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListStateKt.b(int, int, androidx.compose.runtime.Composer, int, int):androidx.compose.foundation.lazy.LazyListState");
    }
}
