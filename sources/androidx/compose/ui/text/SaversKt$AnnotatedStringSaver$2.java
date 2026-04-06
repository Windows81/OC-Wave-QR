package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$AnnotatedStringSaver$2 extends Lambda implements Function1<Object, AnnotatedString> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$AnnotatedStringSaver$2 f18373z = new SaversKt$AnnotatedStringSaver$2();

    public SaversKt$AnnotatedStringSaver$2() {
        super(1);
    }

    /* renamed from: b */
    public final AnnotatedString invoke(Object obj) {
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(1);
        Saver b2 = SaversKt.f18350b;
        String str = null;
        List list2 = ((!Intrinsics.d(obj2, Boolean.FALSE) || (b2 instanceof NonNullValueClassSaver)) && obj2 != null) ? (List) b2.a(obj2) : null;
        Object obj3 = list.get(0);
        if (obj3 != null) {
            str = (String) obj3;
        }
        Intrinsics.f(str);
        return new AnnotatedString(list2, str);
    }
}
