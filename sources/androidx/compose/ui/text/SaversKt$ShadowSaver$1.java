package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$ShadowSaver$1 extends Lambda implements Function2<SaverScope, Shadow, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$ShadowSaver$1 f18402z = new SaversKt$ShadowSaver$1();

    public SaversKt$ShadowSaver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Object m(SaverScope saverScope, Shadow shadow) {
        return CollectionsKt.g(SaversKt.z(Color.h(shadow.c()), SaversKt.k(Color.f15975b), saverScope), SaversKt.z(Offset.d(shadow.d()), SaversKt.j(Offset.f15855b), saverScope), SaversKt.y(Float.valueOf(shadow.b())));
    }
}
