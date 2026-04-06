package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
public final class SetComposingRegionCommand implements EditCommand {

    /* renamed from: a  reason: collision with root package name */
    public final int f18886a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18887b;

    public SetComposingRegionCommand(int i2, int i3) {
        this.f18886a = i2;
        this.f18887b = i3;
    }

    public void a(EditingBuffer editingBuffer) {
        if (editingBuffer.l()) {
            editingBuffer.a();
        }
        int o2 = RangesKt.o(this.f18886a, 0, editingBuffer.h());
        int o3 = RangesKt.o(this.f18887b, 0, editingBuffer.h());
        if (o2 == o3) {
            return;
        }
        if (o2 < o3) {
            editingBuffer.n(o2, o3);
        } else {
            editingBuffer.n(o3, o2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetComposingRegionCommand)) {
            return false;
        }
        SetComposingRegionCommand setComposingRegionCommand = (SetComposingRegionCommand) obj;
        return this.f18886a == setComposingRegionCommand.f18886a && this.f18887b == setComposingRegionCommand.f18887b;
    }

    public int hashCode() {
        return (this.f18886a * 31) + this.f18887b;
    }

    public String toString() {
        return "SetComposingRegionCommand(start=" + this.f18886a + ", end=" + this.f18887b + ')';
    }
}
