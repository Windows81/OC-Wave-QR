package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.TextMotion;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Savers_androidKt$TextMotionSaver$1 extends Lambda implements Function2<SaverScope, TextMotion, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final Savers_androidKt$TextMotionSaver$1 f18429z = new Savers_androidKt$TextMotionSaver$1();

    public Savers_androidKt$TextMotionSaver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Object m(SaverScope saverScope, TextMotion textMotion) {
        return CollectionsKt.g(SaversKt.y(TextMotion.Linearity.d(textMotion.b())), SaversKt.y(Boolean.valueOf(textMotion.c())));
    }
}
