package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.LineBreak;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Savers_androidKt$LineBreakSaver$1 extends Lambda implements Function2<SaverScope, LineBreak, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final Savers_androidKt$LineBreakSaver$1 f18425z = new Savers_androidKt$LineBreakSaver$1();

    public Savers_androidKt$LineBreakSaver$1() {
        super(2);
    }

    public final Object b(SaverScope saverScope, int i2) {
        return Integer.valueOf(i2);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((SaverScope) obj, ((LineBreak) obj2).l());
    }
}
