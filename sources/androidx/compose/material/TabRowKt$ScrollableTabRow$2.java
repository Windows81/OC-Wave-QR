package androidx.compose.material;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TabRowKt$ScrollableTabRow$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f8698A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f8699B;
    public final /* synthetic */ Function3 C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f8700z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowKt$ScrollableTabRow$2(float f2, Function2 function2, Function2 function22, Function3 function3, int i2) {
        super(2);
        this.f8700z = f2;
        this.f8698A = function2;
        this.f8699B = function22;
        this.C = function3;
        this.D = i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: androidx.compose.material.ScrollableTabData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$1} */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c1, code lost:
        if (r9 == r3.a()) goto L_0x00c3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.compose.runtime.Composer r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r2 & 3
            r4 = 1
            r5 = 0
            r6 = 2
            if (r3 == r6) goto L_0x000f
            r3 = r4
            goto L_0x0010
        L_0x000f:
            r3 = r5
        L_0x0010:
            r7 = r2 & 1
            boolean r3 = r1.E(r3, r7)
            if (r3 == 0) goto L_0x00e0
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0027
            r3 = -1
            java.lang.String r7 = "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:238)"
            r8 = 1455860572(0x56c6ab5c, float:1.09219643E14)
            androidx.compose.runtime.ComposerKt.Y(r8, r2, r3, r7)
        L_0x0027:
            androidx.compose.foundation.ScrollState r10 = androidx.compose.foundation.ScrollKt.c(r5, r1, r5, r4)
            java.lang.Object r2 = r19.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r3.a()
            if (r2 != r7) goto L_0x0040
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r2 = androidx.compose.runtime.EffectsKt.j(r2, r1)
            r1.N(r2)
        L_0x0040:
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            boolean r7 = r1.W(r10)
            boolean r8 = r1.W(r2)
            r7 = r7 | r8
            java.lang.Object r8 = r19.g()
            if (r7 != 0) goto L_0x0057
            java.lang.Object r7 = r3.a()
            if (r8 != r7) goto L_0x005f
        L_0x0057:
            androidx.compose.material.ScrollableTabData r8 = new androidx.compose.material.ScrollableTabData
            r8.<init>(r10, r2)
            r1.N(r8)
        L_0x005f:
            r2 = r8
            androidx.compose.material.ScrollableTabData r2 = (androidx.compose.material.ScrollableTabData) r2
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.f15489d
            r8 = 0
            r9 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.h(r7, r8, r4, r9)
            androidx.compose.ui.Alignment$Companion r7 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r7 = r7.h()
            androidx.compose.ui.Modifier r9 = androidx.compose.foundation.layout.SizeKt.E(r4, r7, r5, r6, r9)
            r14 = 14
            r15 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.ScrollKt.b(r9, r10, r11, r12, r13, r14, r15)
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.selection.SelectableGroupKt.a(r4)
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.draw.ClipKt.b(r4)
            float r6 = r0.f8700z
            boolean r6 = r1.h(r6)
            kotlin.jvm.functions.Function2 r7 = r0.f8698A
            boolean r7 = r1.W(r7)
            r6 = r6 | r7
            kotlin.jvm.functions.Function2 r7 = r0.f8699B
            boolean r7 = r1.W(r7)
            r6 = r6 | r7
            kotlin.jvm.functions.Function3 r7 = r0.C
            boolean r7 = r1.W(r7)
            r6 = r6 | r7
            boolean r7 = r1.l(r2)
            r6 = r6 | r7
            int r7 = r0.D
            boolean r7 = r1.i(r7)
            r6 = r6 | r7
            float r12 = r0.f8700z
            kotlin.jvm.functions.Function2 r13 = r0.f8698A
            kotlin.jvm.functions.Function2 r14 = r0.f8699B
            int r7 = r0.D
            kotlin.jvm.functions.Function3 r8 = r0.C
            java.lang.Object r9 = r19.g()
            if (r6 != 0) goto L_0x00c3
            java.lang.Object r3 = r3.a()
            if (r9 != r3) goto L_0x00d1
        L_0x00c3:
            androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$1 r9 = new androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$1
            r11 = r9
            r15 = r2
            r16 = r7
            r17 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r1.N(r9)
        L_0x00d1:
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            androidx.compose.ui.layout.SubcomposeLayoutKt.a(r4, r9, r1, r5, r5)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00e3
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x00e3
        L_0x00e0:
            r19.B()
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowKt$ScrollableTabRow$2.b(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
