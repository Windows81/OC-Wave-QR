package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$AnnotatedStringSaver$1 extends Lambda implements Function2<SaverScope, AnnotatedString, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$AnnotatedStringSaver$1 f18372z = new SaversKt$AnnotatedStringSaver$1();

    public SaversKt$AnnotatedStringSaver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Object m(SaverScope saverScope, AnnotatedString annotatedString) {
        return CollectionsKt.g(SaversKt.y(annotatedString.k()), SaversKt.z(annotatedString.c(), SaversKt.f18350b, saverScope));
    }
}
