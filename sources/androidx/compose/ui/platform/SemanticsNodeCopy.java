package androidx.compose.ui.platform;

import androidx.collection.IntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class SemanticsNodeCopy {

    /* renamed from: a  reason: collision with root package name */
    public final SemanticsConfiguration f17875a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableIntSet f17876b;

    public SemanticsNodeCopy(SemanticsNode semanticsNode, IntObjectMap intObjectMap) {
        this.f17875a = semanticsNode.w();
        this.f17876b = new MutableIntSet(semanticsNode.t().size());
        List t2 = semanticsNode.t();
        int size = t2.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode2 = (SemanticsNode) t2.get(i2);
            if (intObjectMap.a(semanticsNode2.o())) {
                this.f17876b.g(semanticsNode2.o());
            }
        }
    }

    public final MutableIntSet a() {
        return this.f17876b;
    }

    public final SemanticsConfiguration b() {
        return this.f17875a;
    }
}
