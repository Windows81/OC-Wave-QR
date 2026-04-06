package androidx.compose.ui.text.input;

import androidx.compose.ui.text.JvmCharHelpers_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;

@Metadata
public final class BackspaceCommand implements EditCommand {
    public void a(EditingBuffer editingBuffer) {
        if (editingBuffer.l()) {
            editingBuffer.b(editingBuffer.f(), editingBuffer.e());
        } else if (editingBuffer.g() == -1) {
            int k2 = editingBuffer.k();
            int j2 = editingBuffer.j();
            editingBuffer.o(editingBuffer.k());
            editingBuffer.b(k2, j2);
        } else if (editingBuffer.g() != 0) {
            editingBuffer.b(JvmCharHelpers_androidKt.b(editingBuffer.toString(), editingBuffer.g()), editingBuffer.g());
        }
    }

    public boolean equals(Object obj) {
        return obj instanceof BackspaceCommand;
    }

    public int hashCode() {
        return Reflection.b(BackspaceCommand.class).hashCode();
    }

    public String toString() {
        return "BackspaceCommand()";
    }
}
