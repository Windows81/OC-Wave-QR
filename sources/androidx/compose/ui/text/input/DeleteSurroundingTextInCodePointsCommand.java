package androidx.compose.ui.text.input;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;

@Metadata
public final class DeleteSurroundingTextInCodePointsCommand implements EditCommand {

    /* renamed from: a  reason: collision with root package name */
    public final int f18804a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18805b;

    public DeleteSurroundingTextInCodePointsCommand(int i2, int i3) {
        this.f18804a = i2;
        this.f18805b = i3;
        if (!(i2 >= 0 && i3 >= 0)) {
            InlineClassHelperKt.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i2 + " and " + i3 + " respectively.");
        }
    }

    public void a(EditingBuffer editingBuffer) {
        int i2 = this.f18804a;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 < i2) {
                int i6 = i5 + 1;
                if (editingBuffer.k() <= i6) {
                    i5 = editingBuffer.k();
                    break;
                } else {
                    i5 = EditCommandKt.a(editingBuffer.c((editingBuffer.k() - i6) + -1), editingBuffer.c(editingBuffer.k() - i6)) ? i5 + 2 : i6;
                    i4++;
                }
            } else {
                break;
            }
        }
        int i7 = this.f18805b;
        int i8 = 0;
        while (true) {
            if (i3 >= i7) {
                break;
            }
            int i9 = i8 + 1;
            if (editingBuffer.j() + i9 >= editingBuffer.h()) {
                i8 = editingBuffer.h() - editingBuffer.j();
                break;
            } else {
                i8 = EditCommandKt.a(editingBuffer.c((editingBuffer.j() + i9) + -1), editingBuffer.c(editingBuffer.j() + i9)) ? i8 + 2 : i9;
                i3++;
            }
        }
        editingBuffer.b(editingBuffer.j(), editingBuffer.j() + i8);
        editingBuffer.b(editingBuffer.k() - i5, editingBuffer.k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextInCodePointsCommand)) {
            return false;
        }
        DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (DeleteSurroundingTextInCodePointsCommand) obj;
        return this.f18804a == deleteSurroundingTextInCodePointsCommand.f18804a && this.f18805b == deleteSurroundingTextInCodePointsCommand.f18805b;
    }

    public int hashCode() {
        return (this.f18804a * 31) + this.f18805b;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f18804a + ", lengthAfterCursor=" + this.f18805b + ')';
    }
}
