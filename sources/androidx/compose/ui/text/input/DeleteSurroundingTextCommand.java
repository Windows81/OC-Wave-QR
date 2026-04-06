package androidx.compose.ui.text.input;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;

@Metadata
public final class DeleteSurroundingTextCommand implements EditCommand {

    /* renamed from: a  reason: collision with root package name */
    public final int f18802a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18803b;

    public DeleteSurroundingTextCommand(int i2, int i3) {
        this.f18802a = i2;
        this.f18803b = i3;
        if (!(i2 >= 0 && i3 >= 0)) {
            InlineClassHelperKt.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i2 + " and " + i3 + " respectively.");
        }
    }

    public void a(EditingBuffer editingBuffer) {
        int j2 = editingBuffer.j();
        int i2 = this.f18803b;
        int i3 = j2 + i2;
        if (((j2 ^ i3) & (i2 ^ i3)) < 0) {
            i3 = editingBuffer.h();
        }
        editingBuffer.b(editingBuffer.j(), Math.min(i3, editingBuffer.h()));
        int k2 = editingBuffer.k();
        int i4 = this.f18802a;
        int i5 = k2 - i4;
        if (((k2 ^ i5) & (i4 ^ k2)) < 0) {
            i5 = 0;
        }
        editingBuffer.b(Math.max(0, i5), editingBuffer.k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextCommand)) {
            return false;
        }
        DeleteSurroundingTextCommand deleteSurroundingTextCommand = (DeleteSurroundingTextCommand) obj;
        return this.f18802a == deleteSurroundingTextCommand.f18802a && this.f18803b == deleteSurroundingTextCommand.f18803b;
    }

    public int hashCode() {
        return (this.f18802a * 31) + this.f18803b;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f18802a + ", lengthAfterCursor=" + this.f18803b + ')';
    }
}
