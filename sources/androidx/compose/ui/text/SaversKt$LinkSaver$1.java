package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.LinkAnnotation;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$LinkSaver$1 extends Lambda implements Function2<SaverScope, LinkAnnotation.Url, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$LinkSaver$1 f18390z = new SaversKt$LinkSaver$1();

    public SaversKt$LinkSaver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Object m(SaverScope saverScope, LinkAnnotation.Url url) {
        return CollectionsKt.g(SaversKt.y(url.e()), SaversKt.z(url.b(), SaversKt.x(), saverScope));
    }
}
