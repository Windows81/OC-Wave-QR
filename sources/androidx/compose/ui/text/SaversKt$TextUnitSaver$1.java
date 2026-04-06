package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$TextUnitSaver$1 extends Lambda implements Function2<SaverScope, TextUnit, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$TextUnitSaver$1 f18416z = new SaversKt$TextUnitSaver$1();

    public SaversKt$TextUnitSaver$1() {
        super(2);
    }

    public final Object b(SaverScope saverScope, long j2) {
        return TextUnit.e(j2, TextUnit.f19177b.a()) ? Boolean.FALSE : CollectionsKt.g(SaversKt.y(Float.valueOf(TextUnit.h(j2))), SaversKt.y(TextUnitType.d(TextUnit.g(j2))));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((SaverScope) obj, ((TextUnit) obj2).m());
    }
}
