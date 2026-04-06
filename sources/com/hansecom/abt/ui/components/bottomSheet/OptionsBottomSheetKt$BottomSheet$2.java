package com.hansecom.abt.ui.components.bottomSheet;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
public final class OptionsBottomSheetKt$BottomSheet$2 implements Function3<Function0<? extends Unit>, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f38042A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f38043B;
    public final /* synthetic */ Function1 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ImmutableList f38044z;

    public OptionsBottomSheetKt$BottomSheet$2(ImmutableList immutableList, Function1 function1, Function1 function12, Function1 function13) {
        this.f38044z = immutableList;
        this.f38042A = function1;
        this.f38043B = function12;
        this.C = function13;
    }

    public static final Unit f(ImmutableList immutableList, Function1 function1, Function1 function12, Function1 function13, Function0 function0, LazyListScope lazyListScope) {
        Intrinsics.i(lazyListScope, "$this$LazyColumn");
        lazyListScope.d(immutableList.size(), new OptionsBottomSheetKt$BottomSheet$2$invoke$lambda$4$lambda$3$$inlined$itemsIndexed$default$1(new k(function1), immutableList), new OptionsBottomSheetKt$BottomSheet$2$invoke$lambda$4$lambda$3$$inlined$itemsIndexed$default$2(immutableList), ComposableLambdaKt.c(-1091073711, true, new OptionsBottomSheetKt$BottomSheet$2$invoke$lambda$4$lambda$3$$inlined$itemsIndexed$default$3(immutableList, function12, immutableList, function13, function0)));
        return Unit.f40552a;
    }

    public static final Object g(Function1 function1, int i2, Object obj) {
        return function1.invoke(obj);
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        e((Function0) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.hansecom.abt.ui.components.bottomSheet.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: com.hansecom.abt.ui.components.bottomSheet.j} */
    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r7 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x007c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(kotlin.jvm.functions.Function0 r15, androidx.compose.runtime.Composer r16, int r17) {
        /*
            r14 = this;
            r0 = r14
            r6 = r15
            r11 = r16
            java.lang.String r1 = "onClose"
            kotlin.jvm.internal.Intrinsics.i(r15, r1)
            r1 = r17 & 6
            r2 = 4
            if (r1 != 0) goto L_0x001a
            boolean r1 = r11.l(r15)
            if (r1 == 0) goto L_0x0016
            r1 = r2
            goto L_0x0017
        L_0x0016:
            r1 = 2
        L_0x0017:
            r1 = r17 | r1
            goto L_0x001c
        L_0x001a:
            r1 = r17
        L_0x001c:
            r3 = r1 & 19
            r4 = 18
            if (r3 != r4) goto L_0x002e
            boolean r3 = r16.t()
            if (r3 != 0) goto L_0x0029
            goto L_0x002e
        L_0x0029:
            r16.B()
            goto L_0x00a6
        L_0x002e:
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x003d
            r3 = -1
            java.lang.String r4 = "com.hansecom.abt.ui.components.bottomSheet.BottomSheet.<anonymous> (OptionsBottomSheet.kt:92)"
            r5 = 609419332(0x24530044, float:4.5753557E-17)
            androidx.compose.runtime.ComposerKt.Y(r5, r1, r3, r4)
        L_0x003d:
            r3 = 1949041111(0x742c01d7, float:5.4511253E31)
            r11.X(r3)
            kotlinx.collections.immutable.ImmutableList r3 = r0.f38044z
            boolean r3 = r11.l(r3)
            kotlin.jvm.functions.Function1 r4 = r0.f38042A
            boolean r4 = r11.W(r4)
            r3 = r3 | r4
            kotlin.jvm.functions.Function1 r4 = r0.f38043B
            boolean r4 = r11.W(r4)
            r3 = r3 | r4
            kotlin.jvm.functions.Function1 r4 = r0.C
            boolean r4 = r11.W(r4)
            r3 = r3 | r4
            r1 = r1 & 14
            if (r1 != r2) goto L_0x0064
            r1 = 1
            goto L_0x0065
        L_0x0064:
            r1 = 0
        L_0x0065:
            r1 = r1 | r3
            kotlinx.collections.immutable.ImmutableList r2 = r0.f38044z
            kotlin.jvm.functions.Function1 r3 = r0.f38042A
            kotlin.jvm.functions.Function1 r4 = r0.f38043B
            kotlin.jvm.functions.Function1 r5 = r0.C
            java.lang.Object r7 = r16.g()
            if (r1 != 0) goto L_0x007c
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r7 != r1) goto L_0x0086
        L_0x007c:
            com.hansecom.abt.ui.components.bottomSheet.j r7 = new com.hansecom.abt.ui.components.bottomSheet.j
            r1 = r7
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r11.N(r7)
        L_0x0086:
            r10 = r7
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r16.M()
            r12 = 0
            r13 = 511(0x1ff, float:7.16E-43)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = r16
            androidx.compose.foundation.lazy.LazyDslKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00a6
            androidx.compose.runtime.ComposerKt.X()
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.bottomSheet.OptionsBottomSheetKt$BottomSheet$2.e(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }
}
