package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$UrlAnnotationSaver$2 extends Lambda implements Function1<Object, UrlAnnotation> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$UrlAnnotationSaver$2 f18419z = new SaversKt$UrlAnnotationSaver$2();

    public SaversKt$UrlAnnotationSaver$2() {
        super(1);
    }

    /* renamed from: b */
    public final UrlAnnotation invoke(Object obj) {
        String str = obj != null ? (String) obj : null;
        Intrinsics.f(str);
        return new UrlAnnotation(str);
    }
}
