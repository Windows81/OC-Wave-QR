package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.BaselineShift;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$BaselineShiftSaver$1 extends Lambda implements Function2<SaverScope, BaselineShift, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$BaselineShiftSaver$1 f18380z = new SaversKt$BaselineShiftSaver$1();

    public SaversKt$BaselineShiftSaver$1() {
        super(2);
    }

    public final Object b(SaverScope saverScope, float f2) {
        return Float.valueOf(f2);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((SaverScope) obj, ((BaselineShift) obj2).j());
    }
}
