package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.UndoManagerKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.undo.TextDeleteType;
import androidx.compose.foundation.text.input.internal.undo.TextEditType;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextUndoManagerKt {
    public static final boolean a(TextUndoOperation textUndoOperation) {
        return Intrinsics.d(textUndoOperation.f(), "\n") || Intrinsics.d(textUndoOperation.f(), "\r\n");
    }

    public static final TextUndoOperation b(TextUndoOperation textUndoOperation, TextUndoOperation textUndoOperation2) {
        if (!textUndoOperation.b() || !textUndoOperation2.b() || textUndoOperation2.j() < textUndoOperation.j() || textUndoOperation2.j() - textUndoOperation.j() >= ((long) UndoManagerKt.a()) || a(textUndoOperation) || a(textUndoOperation2) || textUndoOperation.i() != textUndoOperation2.i()) {
            return null;
        }
        if (textUndoOperation.i() == TextEditType.Insert && textUndoOperation.d() + textUndoOperation.f().length() == textUndoOperation2.d()) {
            int d2 = textUndoOperation.d();
            return new TextUndoOperation(d2, "", textUndoOperation.f() + textUndoOperation2.f(), textUndoOperation.g(), textUndoOperation2.e(), textUndoOperation.j(), false, 64, (DefaultConstructorMarker) null);
        }
        if (textUndoOperation.i() == TextEditType.Delete && textUndoOperation.c() == textUndoOperation2.c() && (textUndoOperation.c() == TextDeleteType.Start || textUndoOperation.c() == TextDeleteType.End)) {
            if (textUndoOperation.d() == textUndoOperation2.d() + textUndoOperation2.h().length()) {
                int d3 = textUndoOperation2.d();
                return new TextUndoOperation(d3, textUndoOperation2.h() + textUndoOperation.h(), "", textUndoOperation.g(), textUndoOperation2.e(), textUndoOperation.j(), false, 64, (DefaultConstructorMarker) null);
            } else if (textUndoOperation.d() == textUndoOperation2.d()) {
                int d4 = textUndoOperation.d();
                return new TextUndoOperation(d4, textUndoOperation.h() + textUndoOperation2.h(), "", textUndoOperation.g(), textUndoOperation2.e(), textUndoOperation.j(), false, 64, (DefaultConstructorMarker) null);
            }
        }
        return null;
    }

    public static final void c(TextUndoManager textUndoManager, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, TextFieldBuffer.ChangeList changeList, boolean z2) {
        TextUndoManager textUndoManager2 = textUndoManager;
        TextFieldBuffer.ChangeList changeList2 = changeList;
        if (changeList.a() > 1) {
            textUndoManager2.h(new TextUndoOperation(0, textFieldCharSequence.toString(), textFieldCharSequence2.toString(), textFieldCharSequence.g(), textFieldCharSequence2.g(), 0, false, 32, (DefaultConstructorMarker) null));
        } else if (changeList.a() == 1) {
            long b2 = changeList2.b(0);
            long c2 = changeList2.c(0);
            if (!TextRange.h(b2) || !TextRange.h(c2)) {
                textUndoManager2.h(new TextUndoOperation(TextRange.l(b2), TextRangeKt.e(textFieldCharSequence, b2), TextRangeKt.e(textFieldCharSequence2, c2), textFieldCharSequence.g(), textFieldCharSequence2.g(), 0, z2, 32, (DefaultConstructorMarker) null));
            }
        }
    }
}
