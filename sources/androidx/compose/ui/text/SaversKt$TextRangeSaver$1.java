package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$TextRangeSaver$1 extends Lambda implements Function2<SaverScope, TextRange, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$TextRangeSaver$1 f18414z = new SaversKt$TextRangeSaver$1();

    public SaversKt$TextRangeSaver$1() {
        super(2);
    }

    public final Object b(SaverScope saverScope, long j2) {
        return CollectionsKt.g(SaversKt.y(Integer.valueOf(TextRange.n(j2))), SaversKt.y(Integer.valueOf(TextRange.i(j2))));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((SaverScope) obj, ((TextRange) obj2).r());
    }
}
