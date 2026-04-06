package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$TextLinkStylesSaver$1 extends Lambda implements Function2<SaverScope, TextLinkStyles, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$TextLinkStylesSaver$1 f18412z = new SaversKt$TextLinkStylesSaver$1();

    public SaversKt$TextLinkStylesSaver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Object m(SaverScope saverScope, TextLinkStyles textLinkStyles) {
        return CollectionsKt.g(SaversKt.z(textLinkStyles.d(), SaversKt.w(), saverScope), SaversKt.z(textLinkStyles.a(), SaversKt.w(), saverScope), SaversKt.z(textLinkStyles.b(), SaversKt.w(), saverScope), SaversKt.z(textLinkStyles.c(), SaversKt.w(), saverScope));
    }
}
