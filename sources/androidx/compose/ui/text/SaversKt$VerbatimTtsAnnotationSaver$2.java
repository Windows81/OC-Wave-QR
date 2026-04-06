package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$VerbatimTtsAnnotationSaver$2 extends Lambda implements Function1<Object, VerbatimTtsAnnotation> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$VerbatimTtsAnnotationSaver$2 f18421z = new SaversKt$VerbatimTtsAnnotationSaver$2();

    public SaversKt$VerbatimTtsAnnotationSaver$2() {
        super(1);
    }

    /* renamed from: b */
    public final VerbatimTtsAnnotation invoke(Object obj) {
        String str = obj != null ? (String) obj : null;
        Intrinsics.f(str);
        return new VerbatimTtsAnnotation(str);
    }
}
