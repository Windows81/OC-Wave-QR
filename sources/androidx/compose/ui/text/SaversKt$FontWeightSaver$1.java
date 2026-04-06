package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.font.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$FontWeightSaver$1 extends Lambda implements Function2<SaverScope, FontWeight, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$FontWeightSaver$1 f18386z = new SaversKt$FontWeightSaver$1();

    public SaversKt$FontWeightSaver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Object m(SaverScope saverScope, FontWeight fontWeight) {
        return Integer.valueOf(fontWeight.y());
    }
}
