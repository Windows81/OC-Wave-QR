package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public final class AnchoredDraggableKt {
    public static final DraggableAnchors a(Function1 function1) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        function1.invoke(draggableAnchorsConfig);
        return new MapDraggableAnchors(draggableAnchorsConfig.b());
    }

    public static final Modifier d(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z2, boolean z3, MutableInteractionSource mutableInteractionSource) {
        AnchoredDraggableState anchoredDraggableState2 = anchoredDraggableState;
        return DraggableKt.h(modifier, anchoredDraggableState.v(), orientation, z2, mutableInteractionSource, anchoredDraggableState.z(), (Function3) null, new AnchoredDraggableKt$anchoredDraggable$1(anchoredDraggableState, (Continuation) null), z3, 32, (Object) null);
    }

    public static /* synthetic */ Modifier e(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z2, boolean z3, MutableInteractionSource mutableInteractionSource, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        boolean z4 = z2;
        if ((i2 & 8) != 0) {
            z3 = false;
        }
        boolean z5 = z3;
        if ((i2 & 16) != 0) {
            mutableInteractionSource = null;
        }
        return d(modifier, anchoredDraggableState, orientation, z4, z5, mutableInteractionSource);
    }

    public static final Object f(AnchoredDraggableState anchoredDraggableState, Object obj, float f2, Continuation continuation) {
        Object k2 = AnchoredDraggableState.k(anchoredDraggableState, obj, (MutatePriority) null, new AnchoredDraggableKt$animateTo$2(anchoredDraggableState, f2, (Continuation) null), continuation, 2, (Object) null);
        return k2 == IntrinsicsKt.f() ? k2 : Unit.f40552a;
    }

    public static final Modifier g(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, Function2 function2) {
        return modifier.o0(new DraggableAnchorsElement(anchoredDraggableState, function2, orientation));
    }

    public static final MapDraggableAnchors h() {
        return new MapDraggableAnchors(MapsKt.h());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object i(kotlin.jvm.functions.Function0 r4, kotlin.jvm.functions.Function2 r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.D = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.D
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r6)     // Catch:{ AnchoredDragFinishedSignal -> 0x0043 }
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            kotlin.ResultKt.b(r6)
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2     // Catch:{ AnchoredDragFinishedSignal -> 0x0043 }
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch:{ AnchoredDragFinishedSignal -> 0x0043 }
            r0.D = r3     // Catch:{ AnchoredDragFinishedSignal -> 0x0043 }
            java.lang.Object r4 = kotlinx.coroutines.CoroutineScopeKt.f(r6, r0)     // Catch:{ AnchoredDragFinishedSignal -> 0x0043 }
            if (r4 != r1) goto L_0x0043
            return r1
        L_0x0043:
            kotlin.Unit r4 = kotlin.Unit.f40552a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableKt.i(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
