package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata
public final class CoreTextFieldSemanticsModifierNode$applySemantics$4 extends Lambda implements Function1<AnnotatedString, Boolean> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SemanticsPropertyReceiver f6150A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoreTextFieldSemanticsModifierNode f6151z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldSemanticsModifierNode$applySemantics$4(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        super(1);
        this.f6151z = coreTextFieldSemanticsModifierNode;
        this.f6150A = semanticsPropertyReceiver;
    }

    /* renamed from: b */
    public final Boolean invoke(AnnotatedString annotatedString) {
        Unit unit;
        if (this.f6151z.k3() || !this.f6151z.g3()) {
            return Boolean.FALSE;
        }
        TextInputSession h2 = this.f6151z.l3().h();
        if (h2 != null) {
            CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.f6151z;
            TextFieldDelegate.f5899a.g(CollectionsKt.p(new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)), coreTextFieldSemanticsModifierNode.l3().p(), coreTextFieldSemanticsModifierNode.l3().o(), h2);
            unit = Unit.f40552a;
        } else {
            unit = null;
        }
        if (unit == null) {
            CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode2 = this.f6151z;
            coreTextFieldSemanticsModifierNode2.l3().o().invoke(new TextFieldValue(StringsKt.H0(coreTextFieldSemanticsModifierNode2.m3().i(), TextRange.n(coreTextFieldSemanticsModifierNode2.m3().h()), TextRange.i(coreTextFieldSemanticsModifierNode2.m3().h()), annotatedString).toString(), TextRangeKt.a(TextRange.n(coreTextFieldSemanticsModifierNode2.m3().h()) + annotatedString.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
        }
        return Boolean.TRUE;
    }
}
