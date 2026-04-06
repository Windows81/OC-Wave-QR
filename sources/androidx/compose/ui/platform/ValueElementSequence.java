package androidx.compose.ui.platform;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

@Metadata
public final class ValueElementSequence implements Sequence<ValueElement> {

    /* renamed from: a  reason: collision with root package name */
    public final List f17888a;

    public final void b(String str, Object obj) {
        this.f17888a.add(new ValueElement(str, obj));
    }

    public Iterator iterator() {
        return this.f17888a.iterator();
    }
}
