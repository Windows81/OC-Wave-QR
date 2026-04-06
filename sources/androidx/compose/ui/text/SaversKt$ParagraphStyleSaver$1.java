package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$ParagraphStyleSaver$1 extends Lambda implements Function2<SaverScope, ParagraphStyle, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$ParagraphStyleSaver$1 f18400z = new SaversKt$ParagraphStyleSaver$1();

    public SaversKt$ParagraphStyleSaver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Object m(SaverScope saverScope, ParagraphStyle paragraphStyle) {
        return CollectionsKt.g(SaversKt.y(TextAlign.h(paragraphStyle.h())), SaversKt.y(TextDirection.g(paragraphStyle.i())), SaversKt.z(TextUnit.b(paragraphStyle.e()), SaversKt.v(TextUnit.f19177b), saverScope), SaversKt.z(paragraphStyle.j(), SaversKt.u(TextIndent.f19111c), saverScope), SaversKt.z(paragraphStyle.g(), Savers_androidKt.a(PlatformParagraphStyle.f18341c), saverScope), SaversKt.z(paragraphStyle.f(), SaversKt.r(LineHeightStyle.f19056d), saverScope), SaversKt.z(LineBreak.c(paragraphStyle.d()), Savers_androidKt.b(LineBreak.f19032b), saverScope), SaversKt.y(Hyphens.d(paragraphStyle.c())), SaversKt.z(paragraphStyle.k(), Savers_androidKt.c(TextMotion.f19115c), saverScope));
    }
}
