package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Savers_androidKt$PlatformParagraphStyleSaver$1 extends Lambda implements Function2<SaverScope, PlatformParagraphStyle, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final Savers_androidKt$PlatformParagraphStyleSaver$1 f18427z = new Savers_androidKt$PlatformParagraphStyleSaver$1();

    public Savers_androidKt$PlatformParagraphStyleSaver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Object m(SaverScope saverScope, PlatformParagraphStyle platformParagraphStyle) {
        return CollectionsKt.g(SaversKt.y(Boolean.valueOf(platformParagraphStyle.c())), SaversKt.y(EmojiSupportMatch.d(platformParagraphStyle.b())));
    }
}
