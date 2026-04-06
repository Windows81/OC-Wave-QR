package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$TextIndentSaver$1 extends Lambda implements Function2<SaverScope, TextIndent, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$TextIndentSaver$1 f18410z = new SaversKt$TextIndentSaver$1();

    public SaversKt$TextIndentSaver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Object m(SaverScope saverScope, TextIndent textIndent) {
        TextUnit b2 = TextUnit.b(textIndent.b());
        TextUnit.Companion companion = TextUnit.f19177b;
        return CollectionsKt.g(SaversKt.z(b2, SaversKt.v(companion), saverScope), SaversKt.z(TextUnit.b(textIndent.c()), SaversKt.v(companion), saverScope));
    }
}
