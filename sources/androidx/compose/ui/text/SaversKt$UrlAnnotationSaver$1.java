package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$UrlAnnotationSaver$1 extends Lambda implements Function2<SaverScope, UrlAnnotation, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$UrlAnnotationSaver$1 f18418z = new SaversKt$UrlAnnotationSaver$1();

    public SaversKt$UrlAnnotationSaver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Object m(SaverScope saverScope, UrlAnnotation urlAnnotation) {
        return SaversKt.y(urlAnnotation.a());
    }
}
