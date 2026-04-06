package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearch;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class InstitutionsSearchScreenKt$ScreenImpl$1$invoke$lambda$7$lambda$6$lambda$5$$inlined$itemsIndexed$default$3 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ InstitutionsSearch.State f36870A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f36871B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f36872z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstitutionsSearchScreenKt$ScreenImpl$1$invoke$lambda$7$lambda$6$lambda$5$$inlined$itemsIndexed$default$3(List list, InstitutionsSearch.State state, Function1 function1) {
        super(4);
        this.f36872z = list;
        this.f36870A = state;
        this.f36871B = function1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.compose.foundation.lazy.LazyItemScope r11, int r12, androidx.compose.runtime.Composer r13, int r14) {
        /*
            r10 = this;
            r0 = r14 & 6
            if (r0 != 0) goto L_0x000f
            boolean r11 = r13.W(r11)
            if (r11 == 0) goto L_0x000c
            r11 = 4
            goto L_0x000d
        L_0x000c:
            r11 = 2
        L_0x000d:
            r11 = r11 | r14
            goto L_0x0010
        L_0x000f:
            r11 = r14
        L_0x0010:
            r14 = r14 & 48
            if (r14 != 0) goto L_0x0020
            boolean r14 = r13.i(r12)
            if (r14 == 0) goto L_0x001d
            r14 = 32
            goto L_0x001f
        L_0x001d:
            r14 = 16
        L_0x001f:
            r11 = r11 | r14
        L_0x0020:
            r14 = r11 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            r1 = 0
            r2 = 1
            if (r14 == r0) goto L_0x002a
            r14 = r2
            goto L_0x002b
        L_0x002a:
            r14 = r1
        L_0x002b:
            r0 = r11 & 1
            boolean r14 = r13.E(r14, r0)
            if (r14 == 0) goto L_0x00a7
            boolean r14 = androidx.compose.runtime.ComposerKt.P()
            if (r14 == 0) goto L_0x0042
            r14 = -1
            java.lang.String r0 = "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)"
            r3 = -1091073711(0xffffffffbef78951, float:-0.48346952)
            androidx.compose.runtime.ComposerKt.Y(r3, r11, r14, r0)
        L_0x0042:
            java.util.List r11 = r10.f36872z
            java.lang.Object r11 = r11.get(r12)
            com.hansecom.abt.presentation.model.InstitutionState r11 = (com.hansecom.abt.presentation.model.InstitutionState) r11
            r14 = -285233106(0xffffffffeeffb02e, float:-3.9565833E28)
            r13.X(r14)
            java.lang.String r3 = r11.d()
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearch$State r14 = r10.f36870A
            kotlinx.collections.immutable.PersistentList r14 = r14.d()
            int r14 = r14.size()
            int r14 = r14 - r2
            if (r12 == r14) goto L_0x0063
            r6 = r2
            goto L_0x0064
        L_0x0063:
            r6 = r1
        L_0x0064:
            r12 = 1099183018(0x418433aa, float:16.525227)
            r13.X(r12)
            kotlin.jvm.functions.Function1 r12 = r10.f36871B
            boolean r12 = r13.W(r12)
            boolean r14 = r13.W(r11)
            r12 = r12 | r14
            java.lang.Object r14 = r13.g()
            if (r12 != 0) goto L_0x0083
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r12.a()
            if (r14 != r12) goto L_0x008d
        L_0x0083:
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchScreenKt$ScreenImpl$1$1$2$1$2$1$1 r14 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchScreenKt$ScreenImpl$1$1$2$1$2$1$1
            kotlin.jvm.functions.Function1 r12 = r10.f36871B
            r14.<init>(r12, r11)
            r13.N(r14)
        L_0x008d:
            r4 = r14
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r13.M()
            r8 = 0
            r9 = 4
            r5 = 0
            r7 = r13
            com.hansecom.abt.ui.components.listItem.OptionItemKt.b(r3, r4, r5, r6, r7, r8, r9)
            r13.M()
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x00aa
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x00aa
        L_0x00a7:
            r13.B()
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchScreenKt$ScreenImpl$1$invoke$lambda$7$lambda$6$lambda$5$$inlined$itemsIndexed$default$3.b(androidx.compose.foundation.lazy.LazyItemScope, int, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
