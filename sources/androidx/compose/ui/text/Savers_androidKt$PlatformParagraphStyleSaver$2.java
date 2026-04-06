package androidx.compose.ui.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Savers_androidKt$PlatformParagraphStyleSaver$2 extends Lambda implements Function1<Object, PlatformParagraphStyle> {

    /* renamed from: z  reason: collision with root package name */
    public static final Savers_androidKt$PlatformParagraphStyleSaver$2 f18428z = new Savers_androidKt$PlatformParagraphStyleSaver$2();

    public Savers_androidKt$PlatformParagraphStyleSaver$2() {
        super(1);
    }

    /* renamed from: b */
    public final PlatformParagraphStyle invoke(Object obj) {
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Boolean bool = obj2 != null ? (Boolean) obj2 : null;
        Intrinsics.f(bool);
        boolean booleanValue = bool.booleanValue();
        Object obj3 = list.get(1);
        EmojiSupportMatch emojiSupportMatch = obj3 != null ? (EmojiSupportMatch) obj3 : null;
        Intrinsics.f(emojiSupportMatch);
        return new PlatformParagraphStyle(emojiSupportMatch.j(), booleanValue, (DefaultConstructorMarker) null);
    }
}
