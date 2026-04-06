package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata
public final class EditProcessor {

    /* renamed from: a  reason: collision with root package name */
    public TextFieldValue f18806a = new TextFieldValue(AnnotatedStringKt.e(), TextRange.f18496b.a(), (TextRange) null, (DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public EditingBuffer f18807b = new EditingBuffer(this.f18806a.f(), this.f18806a.h(), (DefaultConstructorMarker) null);

    public final TextFieldValue b(List list) {
        EditCommand editCommand;
        Exception e2;
        TextRange textRange = null;
        try {
            int size = list.size();
            int i2 = 0;
            editCommand = null;
            while (i2 < size) {
                try {
                    EditCommand editCommand2 = (EditCommand) list.get(i2);
                    try {
                        editCommand2.a(this.f18807b);
                        i2++;
                        editCommand = editCommand2;
                    } catch (Exception e3) {
                        e2 = e3;
                        editCommand = editCommand2;
                        throw new RuntimeException(c(list, editCommand), e2);
                    }
                } catch (Exception e4) {
                    e2 = e4;
                    throw new RuntimeException(c(list, editCommand), e2);
                }
            }
            AnnotatedString s2 = this.f18807b.s();
            long i3 = this.f18807b.i();
            TextRange b2 = TextRange.b(i3);
            b2.r();
            if (!TextRange.m(this.f18806a.h())) {
                textRange = b2;
            }
            TextFieldValue textFieldValue = new TextFieldValue(s2, textRange != null ? textRange.r() : TextRangeKt.b(TextRange.k(i3), TextRange.l(i3)), this.f18807b.d(), (DefaultConstructorMarker) null);
            this.f18806a = textFieldValue;
            return textFieldValue;
        } catch (Exception e5) {
            editCommand = null;
            e2 = e5;
            throw new RuntimeException(c(list, editCommand), e2);
        }
    }

    public final String c(List list, EditCommand editCommand) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error while applying EditCommand batch to buffer (length=" + this.f18807b.h() + ", composition=" + this.f18807b.d() + ", selection=" + TextRange.q(this.f18807b.i()) + "):");
        Intrinsics.h(sb, "append(...)");
        sb.append(10);
        Intrinsics.h(sb, "append(...)");
        CollectionsKt.l0(list, sb, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new EditProcessor$generateBatchErrorMessage$1$1(editCommand, this), 60, (Object) null);
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }

    public final void d(TextFieldValue textFieldValue, TextInputSession textInputSession) {
        boolean d2 = Intrinsics.d(textFieldValue.g(), this.f18807b.d());
        boolean z2 = true;
        boolean z3 = false;
        if (!Intrinsics.d(this.f18806a.f().k(), textFieldValue.f().k())) {
            this.f18807b = new EditingBuffer(textFieldValue.f(), textFieldValue.h(), (DefaultConstructorMarker) null);
        } else if (!TextRange.g(this.f18806a.h(), textFieldValue.h())) {
            this.f18807b.p(TextRange.l(textFieldValue.h()), TextRange.k(textFieldValue.h()));
            z3 = true;
            z2 = false;
        } else {
            z2 = false;
        }
        if (textFieldValue.g() == null) {
            this.f18807b.a();
        } else if (!TextRange.h(textFieldValue.g().r())) {
            this.f18807b.n(TextRange.l(textFieldValue.g().r()), TextRange.k(textFieldValue.g().r()));
        }
        if (z2 || (!z3 && !d2)) {
            this.f18807b.a();
            textFieldValue = TextFieldValue.d(textFieldValue, (AnnotatedString) null, 0, (TextRange) null, 3, (Object) null);
        }
        TextFieldValue textFieldValue2 = this.f18806a;
        this.f18806a = textFieldValue;
        if (textInputSession != null) {
            textInputSession.d(textFieldValue2, textFieldValue);
        }
    }

    public final String e(EditCommand editCommand) {
        if (editCommand instanceof CommitTextCommand) {
            StringBuilder sb = new StringBuilder();
            sb.append("CommitTextCommand(text.length=");
            CommitTextCommand commitTextCommand = (CommitTextCommand) editCommand;
            sb.append(commitTextCommand.c().length());
            sb.append(", newCursorPosition=");
            sb.append(commitTextCommand.b());
            sb.append(')');
            return sb.toString();
        } else if (editCommand instanceof SetComposingTextCommand) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SetComposingTextCommand(text.length=");
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) editCommand;
            sb2.append(setComposingTextCommand.c().length());
            sb2.append(", newCursorPosition=");
            sb2.append(setComposingTextCommand.b());
            sb2.append(')');
            return sb2.toString();
        } else if (editCommand instanceof SetComposingRegionCommand) {
            return editCommand.toString();
        } else {
            if (editCommand instanceof DeleteSurroundingTextCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof DeleteSurroundingTextInCodePointsCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof SetSelectionCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof FinishComposingTextCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof BackspaceCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof MoveCursorCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof DeleteAllCommand) {
                return editCommand.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unknown EditCommand: ");
            String e2 = Reflection.b(editCommand.getClass()).e();
            if (e2 == null) {
                e2 = "{anonymous EditCommand}";
            }
            sb3.append(e2);
            return sb3.toString();
        }
    }

    public final TextFieldValue f() {
        return this.f18806a;
    }
}
