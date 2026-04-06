package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;

@Metadata
public final class LazySaveableStateHolderKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(kotlin.jvm.functions.Function3 r9, androidx.compose.runtime.Composer r10, int r11) {
        /*
            r0 = 674185128(0x282f3fa8, float:9.728255E-15)
            androidx.compose.runtime.Composer r10 = r10.q(r0)
            r1 = r11 & 6
            r2 = 2
            if (r1 != 0) goto L_0x0017
            boolean r1 = r10.l(r9)
            if (r1 == 0) goto L_0x0014
            r1 = 4
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r1 = r1 | r11
            goto L_0x0018
        L_0x0017:
            r1 = r11
        L_0x0018:
            r3 = r1 & 3
            r4 = 0
            r8 = 1
            if (r3 == r2) goto L_0x0020
            r2 = r8
            goto L_0x0021
        L_0x0020:
            r2 = r4
        L_0x0021:
            r3 = r1 & 1
            boolean r2 = r10.E(r2, r3)
            if (r2 == 0) goto L_0x00a3
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0035
            r2 = -1
            java.lang.String r3 = "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:39)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r2, r3)
        L_0x0035:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.runtime.saveable.SaveableStateRegistryKt.g()
            java.lang.Object r0 = r10.C(r0)
            androidx.compose.runtime.saveable.SaveableStateRegistry r0 = (androidx.compose.runtime.saveable.SaveableStateRegistry) r0
            androidx.compose.runtime.saveable.SaveableStateHolder r1 = androidx.compose.runtime.saveable.SaveableStateHolderKt.b(r10, r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$Companion r3 = androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.C
            androidx.compose.runtime.saveable.Saver r3 = r3.a(r0, r1)
            boolean r4 = r10.l(r0)
            boolean r5 = r10.l(r1)
            r4 = r4 | r5
            java.lang.Object r5 = r10.g()
            if (r4 != 0) goto L_0x0064
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x006c
        L_0x0064:
            androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$holder$1$1 r5 = new androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$holder$1$1
            r5.<init>(r0, r1)
            r10.N(r5)
        L_0x006c:
            r4 = r5
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r6 = 0
            r7 = 4
            r0 = 0
            r1 = r2
            r2 = r3
            r3 = r0
            r5 = r10
            java.lang.Object r0 = androidx.compose.runtime.saveable.RememberSaveableKt.h(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.foundation.lazy.layout.LazySaveableStateHolder r0 = (androidx.compose.foundation.lazy.layout.LazySaveableStateHolder) r0
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.runtime.saveable.SaveableStateRegistryKt.g()
            androidx.compose.runtime.ProvidedValue r1 = r1.d(r0)
            androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$1 r2 = new androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$1
            r2.<init>(r9, r0)
            r0 = 54
            r3 = 1863926504(0x6f1942e8, float:4.743209E28)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r3, r8, r2, r10, r0)
            int r2 = androidx.compose.runtime.ProvidedValue.f14769i
            r2 = r2 | 48
            androidx.compose.runtime.CompositionLocalKt.c(r1, r0, r10, r2)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00a6
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x00a6
        L_0x00a3:
            r10.B()
        L_0x00a6:
            androidx.compose.runtime.ScopeUpdateScope r10 = r10.x()
            if (r10 == 0) goto L_0x00b4
            androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$2 r0 = new androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$2
            r0.<init>(r9, r11)
            r10.a(r0)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt.a(kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int):void");
    }
}
