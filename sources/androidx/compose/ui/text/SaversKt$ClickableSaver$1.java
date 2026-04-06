package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.LinkAnnotation;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$ClickableSaver$1 extends Lambda implements Function2<SaverScope, LinkAnnotation.Clickable, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$ClickableSaver$1 f18382z = new SaversKt$ClickableSaver$1();

    public SaversKt$ClickableSaver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Object m(SaverScope saverScope, LinkAnnotation.Clickable clickable) {
        return CollectionsKt.g(SaversKt.y(clickable.e()), SaversKt.z(clickable.b(), SaversKt.x(), saverScope));
    }
}
