package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$ColorSaver$1 extends Lambda implements Function2<SaverScope, Color, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$ColorSaver$1 f18384z = new SaversKt$ColorSaver$1();

    public SaversKt$ColorSaver$1() {
        super(2);
    }

    public final Object b(SaverScope saverScope, long j2) {
        return j2 == 16 ? Boolean.FALSE : Integer.valueOf(ColorKt.j(j2));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((SaverScope) obj, ((Color) obj2).v());
    }
}
