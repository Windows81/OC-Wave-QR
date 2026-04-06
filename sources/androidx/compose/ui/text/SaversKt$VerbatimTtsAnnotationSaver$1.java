package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$VerbatimTtsAnnotationSaver$1 extends Lambda implements Function2<SaverScope, VerbatimTtsAnnotation, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$VerbatimTtsAnnotationSaver$1 f18420z = new SaversKt$VerbatimTtsAnnotationSaver$1();

    public SaversKt$VerbatimTtsAnnotationSaver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Object m(SaverScope saverScope, VerbatimTtsAnnotation verbatimTtsAnnotation) {
        return SaversKt.y(verbatimTtsAnnotation.a());
    }
}
