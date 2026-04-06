package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class SetComposingTextCommand implements EditCommand {

    /* renamed from: a  reason: collision with root package name */
    public final AnnotatedString f18888a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18889b;

    public SetComposingTextCommand(AnnotatedString annotatedString, int i2) {
        this.f18888a = annotatedString;
        this.f18889b = i2;
    }

    public void a(EditingBuffer editingBuffer) {
        if (editingBuffer.l()) {
            int f2 = editingBuffer.f();
            editingBuffer.m(editingBuffer.f(), editingBuffer.e(), c());
            if (c().length() > 0) {
                editingBuffer.n(f2, c().length() + f2);
            }
        } else {
            int k2 = editingBuffer.k();
            editingBuffer.m(editingBuffer.k(), editingBuffer.j(), c());
            if (c().length() > 0) {
                editingBuffer.n(k2, c().length() + k2);
            }
        }
        int g2 = editingBuffer.g();
        int i2 = this.f18889b;
        editingBuffer.o(RangesKt.o(i2 > 0 ? (g2 + i2) - 1 : (g2 + i2) - c().length(), 0, editingBuffer.h()));
    }

    public final int b() {
        return this.f18889b;
    }

    public final String c() {
        return this.f18888a.k();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetComposingTextCommand)) {
            return false;
        }
        SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) obj;
        return Intrinsics.d(c(), setComposingTextCommand.c()) && this.f18889b == setComposingTextCommand.f18889b;
    }

    public int hashCode() {
        return (c().hashCode() * 31) + this.f18889b;
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + c() + "', newCursorPosition=" + this.f18889b + ')';
    }

    public SetComposingTextCommand(String str, int i2) {
        this(new AnnotatedString(str, (List) null, 2, (DefaultConstructorMarker) null), i2);
    }
}
