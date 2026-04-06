package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata
public final class TextFieldKeyInput {

    /* renamed from: a  reason: collision with root package name */
    public final LegacyTextFieldState f5907a;

    /* renamed from: b  reason: collision with root package name */
    public final TextFieldSelectionManager f5908b;

    /* renamed from: c  reason: collision with root package name */
    public final TextFieldValue f5909c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5910d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5911e;

    /* renamed from: f  reason: collision with root package name */
    public final TextPreparedSelectionState f5912f;

    /* renamed from: g  reason: collision with root package name */
    public final OffsetMapping f5913g;

    /* renamed from: h  reason: collision with root package name */
    public final UndoManager f5914h;

    /* renamed from: i  reason: collision with root package name */
    public final DeadKeyCombiner f5915i;

    /* renamed from: j  reason: collision with root package name */
    public final KeyMapping f5916j;

    /* renamed from: k  reason: collision with root package name */
    public final Function1 f5917k;

    /* renamed from: l  reason: collision with root package name */
    public final int f5918l;

    public /* synthetic */ TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z2, boolean z3, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(legacyTextFieldState, textFieldSelectionManager, textFieldValue, z2, z3, textPreparedSelectionState, offsetMapping, undoManager, deadKeyCombiner, keyMapping, function1, i2);
    }

    public final void e(EditCommand editCommand) {
        f(CollectionsKt.e(editCommand));
    }

    public final void f(List list) {
        EditProcessor p2 = this.f5907a.p();
        List P0 = CollectionsKt.P0(list);
        P0.add(0, new FinishComposingTextCommand());
        this.f5917k.invoke(p2.b(P0));
    }

    public final void g(Function1 function1) {
        TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(this.f5909c, this.f5913g, this.f5907a.l(), this.f5912f);
        function1.invoke(textFieldPreparedSelection);
        if (!TextRange.g(textFieldPreparedSelection.u(), this.f5909c.h()) || !Intrinsics.d(textFieldPreparedSelection.e(), this.f5909c.f())) {
            this.f5917k.invoke(textFieldPreparedSelection.Z());
        }
    }

    public final TextFieldSelectionManager h() {
        return this.f5908b;
    }

    public final boolean i() {
        return this.f5911e;
    }

    public final LegacyTextFieldState j() {
        return this.f5907a;
    }

    public final UndoManager k() {
        return this.f5914h;
    }

    public final boolean l(KeyEvent keyEvent) {
        KeyCommand a2;
        CommitTextCommand m2 = m(keyEvent);
        if (m2 != null) {
            if (!this.f5910d) {
                return false;
            }
            e(m2);
            this.f5912f.b();
            return true;
        } else if (!KeyEventType.f(KeyEvent_androidKt.b(keyEvent), KeyEventType.f16777b.a()) || (a2 = this.f5916j.a(keyEvent)) == null || (a2.f() && !this.f5910d)) {
            return false;
        } else {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.f40901z = true;
            g(new TextFieldKeyInput$process$2(a2, this, booleanRef));
            UndoManager undoManager = this.f5914h;
            if (undoManager != null) {
                undoManager.a();
            }
            return booleanRef.f40901z;
        }
    }

    public final CommitTextCommand m(KeyEvent keyEvent) {
        Integer a2;
        if (!TextFieldKeyInput_androidKt.a(keyEvent) || (a2 = this.f5915i.a(keyEvent)) == null) {
            return null;
        }
        return new CommitTextCommand(StringHelpers_jvmKt.a(new StringBuilder(), a2.intValue()).toString(), 1);
    }

    public TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z2, boolean z3, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, Function1 function1, int i2) {
        this.f5907a = legacyTextFieldState;
        this.f5908b = textFieldSelectionManager;
        this.f5909c = textFieldValue;
        this.f5910d = z2;
        this.f5911e = z3;
        this.f5912f = textPreparedSelectionState;
        this.f5913g = offsetMapping;
        this.f5914h = undoManager;
        this.f5915i = deadKeyCombiner;
        this.f5916j = keyMapping;
        this.f5917k = function1;
        this.f5918l = i2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextFieldKeyInput(androidx.compose.foundation.text.LegacyTextFieldState r24, androidx.compose.foundation.text.selection.TextFieldSelectionManager r25, androidx.compose.ui.text.input.TextFieldValue r26, boolean r27, boolean r28, androidx.compose.foundation.text.selection.TextPreparedSelectionState r29, androidx.compose.ui.text.input.OffsetMapping r30, androidx.compose.foundation.text.UndoManager r31, androidx.compose.foundation.text.DeadKeyCombiner r32, androidx.compose.foundation.text.KeyMapping r33, kotlin.jvm.functions.Function1 r34, int r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
            r23 = this;
            r0 = r36
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0014
            androidx.compose.ui.text.input.TextFieldValue r1 = new androidx.compose.ui.text.input.TextFieldValue
            r7 = 7
            r8 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r2 = r1
            r2.<init>((java.lang.String) r3, (long) r4, (androidx.compose.ui.text.TextRange) r6, (int) r7, (kotlin.jvm.internal.DefaultConstructorMarker) r8)
            r12 = r1
            goto L_0x0016
        L_0x0014:
            r12 = r26
        L_0x0016:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x001d
            r1 = 1
            r13 = r1
            goto L_0x001f
        L_0x001d:
            r13 = r27
        L_0x001f:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0026
            r1 = 0
            r14 = r1
            goto L_0x0028
        L_0x0026:
            r14 = r28
        L_0x0028:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0035
            androidx.compose.ui.text.input.OffsetMapping$Companion r1 = androidx.compose.ui.text.input.OffsetMapping.f18867a
            androidx.compose.ui.text.input.OffsetMapping r1 = r1.a()
            r16 = r1
            goto L_0x0037
        L_0x0035:
            r16 = r30
        L_0x0037:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003f
            r1 = 0
            r17 = r1
            goto L_0x0041
        L_0x003f:
            r17 = r31
        L_0x0041:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x004c
            androidx.compose.foundation.text.KeyMapping r1 = androidx.compose.foundation.text.KeyMapping_androidKt.a()
            r19 = r1
            goto L_0x004e
        L_0x004c:
            r19 = r33
        L_0x004e:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0057
            androidx.compose.foundation.text.TextFieldKeyInput$1 r0 = androidx.compose.foundation.text.TextFieldKeyInput.AnonymousClass1.f5919z
            r20 = r0
            goto L_0x0059
        L_0x0057:
            r20 = r34
        L_0x0059:
            r22 = 0
            r9 = r23
            r10 = r24
            r11 = r25
            r15 = r29
            r18 = r32
            r21 = r35
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldKeyInput.<init>(androidx.compose.foundation.text.LegacyTextFieldState, androidx.compose.foundation.text.selection.TextFieldSelectionManager, androidx.compose.ui.text.input.TextFieldValue, boolean, boolean, androidx.compose.foundation.text.selection.TextPreparedSelectionState, androidx.compose.ui.text.input.OffsetMapping, androidx.compose.foundation.text.UndoManager, androidx.compose.foundation.text.DeadKeyCombiner, androidx.compose.foundation.text.KeyMapping, kotlin.jvm.functions.Function1, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
