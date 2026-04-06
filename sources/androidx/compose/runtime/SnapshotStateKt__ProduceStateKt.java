package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@Metadata
final /* synthetic */ class SnapshotStateKt__ProduceStateKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.runtime.State a(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, kotlin.jvm.functions.Function2 r13, androidx.compose.runtime.Composer r14, int r15) {
        /*
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.compose.runtime.produceState (ProduceState.kt:170)"
            r2 = 1807205155(0x6bb7c323, float:4.4430986E26)
            androidx.compose.runtime.ComposerKt.Y(r2, r15, r0, r1)
        L_0x000f:
            java.lang.Object r0 = r14.g()
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r1.a()
            r3 = 0
            if (r0 != r2) goto L_0x0024
            r0 = 2
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r9, r3, r0, r3)
            r14.N(r0)
        L_0x0024:
            androidx.compose.runtime.MutableState r0 = (androidx.compose.runtime.MutableState) r0
            boolean r9 = r14.l(r13)
            java.lang.Object r2 = r14.g()
            if (r9 != 0) goto L_0x0036
            java.lang.Object r9 = r1.a()
            if (r2 != r9) goto L_0x003e
        L_0x0036:
            androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$4$1 r2 = new androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$4$1
            r2.<init>(r13, r0, r3)
            r14.N(r2)
        L_0x003e:
            r6 = r2
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            int r9 = r15 >> 3
            r8 = r9 & 1022(0x3fe, float:1.432E-42)
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r14
            androidx.compose.runtime.EffectsKt.e(r3, r4, r5, r6, r7, r8)
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0055
            androidx.compose.runtime.ComposerKt.X()
        L_0x0055:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__ProduceStateKt.a(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):androidx.compose.runtime.State");
    }

    public static final State b(Object obj, Object obj2, Object obj3, Function2 function2, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1703169085, i2, -1, "androidx.compose.runtime.produceState (ProduceState.kt:138)");
        }
        Object g2 = composer.g();
        Composer.Companion companion = Composer.f14567a;
        if (g2 == companion.a()) {
            g2 = SnapshotStateKt__SnapshotStateKt.e(obj, (SnapshotMutationPolicy) null, 2, (Object) null);
            composer.N(g2);
        }
        MutableState mutableState = (MutableState) g2;
        boolean l2 = composer.l(function2);
        Object g3 = composer.g();
        if (l2 || g3 == companion.a()) {
            g3 = new SnapshotStateKt__ProduceStateKt$produceState$3$1(function2, mutableState, (Continuation) null);
            composer.N(g3);
        }
        EffectsKt.f(obj2, obj3, (Function2) g3, composer, (i2 >> 3) & 126);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return mutableState;
    }

    public static final State c(Object obj, Function2 function2, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(10454275, i2, -1, "androidx.compose.runtime.produceState (ProduceState.kt:77)");
        }
        Object g2 = composer.g();
        Composer.Companion companion = Composer.f14567a;
        if (g2 == companion.a()) {
            g2 = SnapshotStateKt__SnapshotStateKt.e(obj, (SnapshotMutationPolicy) null, 2, (Object) null);
            composer.N(g2);
        }
        MutableState mutableState = (MutableState) g2;
        Unit unit = Unit.f40552a;
        boolean l2 = composer.l(function2);
        Object g3 = composer.g();
        if (l2 || g3 == companion.a()) {
            g3 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(function2, mutableState, (Continuation) null);
            composer.N(g3);
        }
        EffectsKt.g(unit, (Function2) g3, composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return mutableState;
    }
}
