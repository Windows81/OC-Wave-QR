package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.GroupSourceInformation;
import androidx.compose.runtime.SlotWriter;
import kotlin.Metadata;

@Metadata
public final class WriterTraceBuilder extends ComposeStackTraceBuilder {

    /* renamed from: b  reason: collision with root package name */
    public final SlotWriter f15419b;

    public WriterTraceBuilder(SlotWriter slotWriter) {
        this.f15419b = slotWriter;
    }

    public int d(Anchor anchor) {
        SlotWriter slotWriter = this.f15419b;
        return slotWriter.i0(slotWriter.C(anchor));
    }

    public GroupSourceInformation g(Anchor anchor) {
        SlotWriter slotWriter = this.f15419b;
        return slotWriter.g1(slotWriter.C(anchor));
    }
}
