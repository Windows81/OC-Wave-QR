package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$TextGeometricTransformSaver$1 extends Lambda implements Function2<SaverScope, TextGeometricTransform, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$TextGeometricTransformSaver$1 f18408z = new SaversKt$TextGeometricTransformSaver$1();

    public SaversKt$TextGeometricTransformSaver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Object m(SaverScope saverScope, TextGeometricTransform textGeometricTransform) {
        return CollectionsKt.g(Float.valueOf(textGeometricTransform.b()), Float.valueOf(textGeometricTransform.c()));
    }
}
