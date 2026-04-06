package com.hansecom.abt.util;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LazyListExtKt$itemsWithSpacing$4 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f39024A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f39025B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function4 f39026z;

    public final void b(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
        int i4;
        Intrinsics.i(lazyItemScope, "$this$items");
        if ((i3 & 6) == 0) {
            i4 = (composer.W(lazyItemScope) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composer.i(i2) ? 32 : 16;
        }
        if ((i4 & 147) != 146 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1395388335, i4, -1, "com.hansecom.abt.util.itemsWithSpacing.<anonymous> (LazyListExt.kt:22)");
            }
            this.f39026z.j(lazyItemScope, this.f39024A.get(i2), composer, Integer.valueOf(i4 & 14));
            if (i2 < CollectionsKt.o(this.f39024A)) {
                SpacerKt.a(SizeKt.t(Modifier.f15489d, this.f39025B), composer, 0);
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
