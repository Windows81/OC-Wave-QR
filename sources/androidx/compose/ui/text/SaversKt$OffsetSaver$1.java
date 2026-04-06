package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$OffsetSaver$1 extends Lambda implements Function2<SaverScope, Offset, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$OffsetSaver$1 f18398z = new SaversKt$OffsetSaver$1();

    public SaversKt$OffsetSaver$1() {
        super(2);
    }

    public final Object b(SaverScope saverScope, long j2) {
        if (Offset.j(j2, Offset.f15855b.b())) {
            return Boolean.FALSE;
        }
        return CollectionsKt.g(SaversKt.y(Float.valueOf(Float.intBitsToFloat((int) (j2 >> 32)))), SaversKt.y(Float.valueOf(Float.intBitsToFloat((int) (j2 & 4294967295L)))));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((SaverScope) obj, ((Offset) obj2).t());
    }
}
