package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;

@Metadata
public final class DeleteAllCommand implements EditCommand {
    public void a(EditingBuffer editingBuffer) {
        editingBuffer.m(0, editingBuffer.h(), "");
    }

    public boolean equals(Object obj) {
        return obj instanceof DeleteAllCommand;
    }

    public int hashCode() {
        return Reflection.b(DeleteAllCommand.class).hashCode();
    }

    public String toString() {
        return "DeleteAllCommand()";
    }
}
