package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class CommitTextCommand implements EditCommand {

    /* renamed from: a  reason: collision with root package name */
    public final AnnotatedString f18778a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18779b;

    public CommitTextCommand(AnnotatedString annotatedString, int i2) {
        this.f18778a = annotatedString;
        this.f18779b = i2;
    }

    public void a(EditingBuffer editingBuffer) {
        if (editingBuffer.l()) {
            editingBuffer.m(editingBuffer.f(), editingBuffer.e(), c());
        } else {
            editingBuffer.m(editingBuffer.k(), editingBuffer.j(), c());
        }
        int g2 = editingBuffer.g();
        int i2 = this.f18779b;
        editingBuffer.o(RangesKt.o(i2 > 0 ? (g2 + i2) - 1 : (g2 + i2) - c().length(), 0, editingBuffer.h()));
    }

    public final int b() {
        return this.f18779b;
    }

    public final String c() {
        return this.f18778a.k();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommitTextCommand)) {
            return false;
        }
        CommitTextCommand commitTextCommand = (CommitTextCommand) obj;
        return Intrinsics.d(c(), commitTextCommand.c()) && this.f18779b == commitTextCommand.f18779b;
    }

    public int hashCode() {
        return (c().hashCode() * 31) + this.f18779b;
    }

    public String toString() {
        return "CommitTextCommand(text='" + c() + "', newCursorPosition=" + this.f18779b + ')';
    }

    public CommitTextCommand(String str, int i2) {
        this(new AnnotatedString(str, (List) null, 2, (DefaultConstructorMarker) null), i2);
    }
}
