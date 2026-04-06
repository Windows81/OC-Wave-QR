package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

@Metadata
final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.runtime.State b(kotlinx.coroutines.flow.Flow r6, java.lang.Object r7, kotlin.coroutines.CoroutineContext r8, androidx.compose.runtime.Composer r9, int r10, int r11) {
        /*
            r11 = r11 & 2
            if (r11 == 0) goto L_0x0006
            kotlin.coroutines.EmptyCoroutineContext r8 = kotlin.coroutines.EmptyCoroutineContext.f40721z
        L_0x0006:
            r2 = r8
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x0016
            r8 = -1
            java.lang.String r11 = "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:65)"
            r0 = -606625098(0xffffffffdbd7a2b6, float:-1.21392045E17)
            androidx.compose.runtime.ComposerKt.Y(r0, r10, r8, r11)
        L_0x0016:
            boolean r8 = r9.l(r2)
            boolean r11 = r9.l(r6)
            r8 = r8 | r11
            java.lang.Object r11 = r9.g()
            if (r8 != 0) goto L_0x002d
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r11 != r8) goto L_0x0036
        L_0x002d:
            androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1 r11 = new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1
            r8 = 0
            r11.<init>(r2, r6, r8)
            r9.N(r11)
        L_0x0036:
            r3 = r11
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            int r8 = r10 >> 3
            r8 = r8 & 14
            int r11 = r10 << 3
            r11 = r11 & 112(0x70, float:1.57E-43)
            r8 = r8 | r11
            r10 = r10 & 896(0x380, float:1.256E-42)
            r5 = r8 | r10
            r0 = r7
            r1 = r6
            r4 = r9
            androidx.compose.runtime.State r6 = androidx.compose.runtime.SnapshotStateKt.m(r0, r1, r2, r3, r4, r5)
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x0056
            androidx.compose.runtime.ComposerKt.X()
        L_0x0056:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.b(kotlinx.coroutines.flow.Flow, java.lang.Object, kotlin.coroutines.CoroutineContext, androidx.compose.runtime.Composer, int, int):androidx.compose.runtime.State");
    }

    public static final State c(StateFlow stateFlow, CoroutineContext coroutineContext, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f40721z;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.P()) {
            ComposerKt.Y(-1439883919, i2, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:49)");
        }
        State a2 = SnapshotStateKt.a(stateFlow, stateFlow.getValue(), coroutineContext2, composer, (i2 & 14) | ((i2 << 3) & 896), 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return a2;
    }

    public static final boolean d(MutableScatterSet mutableScatterSet, Set set) {
        Object[] objArr = mutableScatterSet.f1967b;
        long[] jArr = mutableScatterSet.f1966a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128 && set.contains(objArr[(i2 << 3) + i4])) {
                        return true;
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return false;
                }
            }
            if (i2 == length) {
                return false;
            }
            i2++;
        }
    }

    public static final Flow e(Function0 function0) {
        return FlowKt.I(new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(function0, (Continuation) null));
    }
}
