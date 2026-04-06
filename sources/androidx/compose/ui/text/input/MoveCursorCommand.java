package androidx.compose.ui.text.input;

import androidx.compose.ui.text.JvmCharHelpers_androidKt;
import kotlin.Metadata;

@Metadata
public final class MoveCursorCommand implements EditCommand {

    /* renamed from: a  reason: collision with root package name */
    public final int f18864a;

    public void a(EditingBuffer editingBuffer) {
        if (editingBuffer.g() == -1) {
            editingBuffer.o(editingBuffer.k());
        }
        int k2 = editingBuffer.k();
        String editingBuffer2 = editingBuffer.toString();
        int i2 = this.f18864a;
        int i3 = 0;
        if (i2 <= 0) {
            int i4 = -i2;
            while (i3 < i4) {
                int b2 = JvmCharHelpers_androidKt.b(editingBuffer2, k2);
                if (b2 == -1) {
                    break;
                }
                i3++;
                k2 = b2;
            }
        } else {
            while (i3 < i2) {
                int a2 = JvmCharHelpers_androidKt.a(editingBuffer2, k2);
                if (a2 == -1) {
                    break;
                }
                i3++;
                k2 = a2;
            }
        }
        editingBuffer.o(k2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoveCursorCommand) && this.f18864a == ((MoveCursorCommand) obj).f18864a;
    }

    public int hashCode() {
        return this.f18864a;
    }

    public String toString() {
        return "MoveCursorCommand(amount=" + this.f18864a + ')';
    }
}
