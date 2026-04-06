package com.hansecom.abt.presentation.screens.home.faremedia.instituitions;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class InstitutionsScreenKt$ScreenImpl$1$invoke$lambda$6$lambda$5$lambda$4$$inlined$items$default$4 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36772A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f36773z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstitutionsScreenKt$ScreenImpl$1$invoke$lambda$6$lambda$5$lambda$4$$inlined$items$default$4(List list, Function1 function1) {
        super(4);
        this.f36773z = list;
        this.f36772A = function1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.compose.foundation.lazy.LazyItemScope r10, int r11, androidx.compose.runtime.Composer r12, int r13) {
        /*
            r9 = this;
            r0 = r13 & 6
            if (r0 != 0) goto L_0x000f
            boolean r10 = r12.W(r10)
            if (r10 == 0) goto L_0x000c
            r10 = 4
            goto L_0x000d
        L_0x000c:
            r10 = 2
        L_0x000d:
            r10 = r10 | r13
            goto L_0x0010
        L_0x000f:
            r10 = r13
        L_0x0010:
            r13 = r13 & 48
            if (r13 != 0) goto L_0x0020
            boolean r13 = r12.i(r11)
            if (r13 == 0) goto L_0x001d
            r13 = 32
            goto L_0x001f
        L_0x001d:
            r13 = 16
        L_0x001f:
            r10 = r10 | r13
        L_0x0020:
            r13 = r10 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            r1 = 0
            r2 = 1
            if (r13 == r0) goto L_0x0029
            r1 = r2
        L_0x0029:
            r13 = r10 & 1
            boolean r13 = r12.E(r1, r13)
            if (r13 == 0) goto L_0x0099
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x0040
            r13 = -1
            java.lang.String r0 = "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)"
            r1 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
            androidx.compose.runtime.ComposerKt.Y(r1, r10, r13, r0)
        L_0x0040:
            java.util.List r10 = r9.f36773z
            java.lang.Object r10 = r10.get(r11)
            r4 = r10
            com.hansecom.abt.presentation.model.InstitutionState r4 = (com.hansecom.abt.presentation.model.InstitutionState) r4
            r10 = 610268017(0x245ff371, float:4.856162E-17)
            r12.X(r10)
            androidx.compose.ui.Modifier$Companion r10 = androidx.compose.ui.Modifier.f15489d
            r11 = 0
            r13 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.h(r10, r11, r2, r13)
            r10 = 1128069903(0x433cfb0f, float:188.9807)
            r12.X(r10)
            kotlin.jvm.functions.Function1 r10 = r9.f36772A
            boolean r10 = r12.W(r10)
            boolean r11 = r12.W(r4)
            r10 = r10 | r11
            java.lang.Object r11 = r12.g()
            if (r10 != 0) goto L_0x0076
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r10.a()
            if (r11 != r10) goto L_0x0080
        L_0x0076:
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsScreenKt$ScreenImpl$1$1$2$1$2$1$1 r11 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsScreenKt$ScreenImpl$1$1$2$1$2$1$1
            kotlin.jvm.functions.Function1 r10 = r9.f36772A
            r11.<init>(r10, r4)
            r12.N(r11)
        L_0x0080:
            r5 = r11
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r12.M()
            r7 = 6
            r8 = 0
            r6 = r12
            com.hansecom.abt.ui.components.institution.InstitutionCardKt.b(r3, r4, r5, r6, r7, r8)
            r12.M()
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x009c
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x009c
        L_0x0099:
            r12.B()
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsScreenKt$ScreenImpl$1$invoke$lambda$6$lambda$5$lambda$4$$inlined$items$default$4.b(androidx.compose.foundation.lazy.LazyItemScope, int, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
