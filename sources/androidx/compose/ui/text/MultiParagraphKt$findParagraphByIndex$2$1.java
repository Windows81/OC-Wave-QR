package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class MultiParagraphKt$findParagraphByIndex$2$1 extends Lambda implements Function1<ParagraphInfo, CharSequence> {

    /* renamed from: z  reason: collision with root package name */
    public static final MultiParagraphKt$findParagraphByIndex$2$1 f18308z = new MultiParagraphKt$findParagraphByIndex$2$1();

    public MultiParagraphKt$findParagraphByIndex$2$1() {
        super(1);
    }

    /* renamed from: b */
    public final CharSequence invoke(ParagraphInfo paragraphInfo) {
        return '[' + paragraphInfo.f() + ", " + paragraphInfo.b() + ')';
    }
}
