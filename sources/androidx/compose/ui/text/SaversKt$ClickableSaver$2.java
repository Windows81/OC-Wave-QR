package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.LinkAnnotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$ClickableSaver$2 extends Lambda implements Function1<Object, LinkAnnotation.Clickable> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$ClickableSaver$2 f18383z = new SaversKt$ClickableSaver$2();

    public SaversKt$ClickableSaver$2() {
        super(1);
    }

    /* renamed from: b */
    public final LinkAnnotation.Clickable invoke(Object obj) {
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        String str = obj2 != null ? (String) obj2 : null;
        Intrinsics.f(str);
        Object obj3 = list.get(1);
        Saver x2 = SaversKt.x();
        return new LinkAnnotation.Clickable(str, ((!Intrinsics.d(obj3, Boolean.FALSE) || (x2 instanceof NonNullValueClassSaver)) && obj3 != null) ? (TextLinkStyles) x2.a(obj3) : null, (LinkInteractionListener) null);
    }
}
