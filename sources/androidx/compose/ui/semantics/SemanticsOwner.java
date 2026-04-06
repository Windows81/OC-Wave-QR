package androidx.compose.ui.semantics;

import androidx.collection.IntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;

@Metadata
public final class SemanticsOwner {

    /* renamed from: a  reason: collision with root package name */
    public final LayoutNode f18096a;

    /* renamed from: b  reason: collision with root package name */
    public final EmptySemanticsModifier f18097b;

    /* renamed from: c  reason: collision with root package name */
    public final IntObjectMap f18098c;

    /* renamed from: d  reason: collision with root package name */
    public final MutableObjectList f18099d = new MutableObjectList(2);

    public SemanticsOwner(LayoutNode layoutNode, EmptySemanticsModifier emptySemanticsModifier, IntObjectMap intObjectMap) {
        this.f18096a = layoutNode;
        this.f18097b = emptySemanticsModifier;
        this.f18098c = intObjectMap;
    }

    public final SemanticsInfo a(int i2) {
        return (SemanticsInfo) this.f18098c.b(i2);
    }

    public final MutableObjectList b() {
        return this.f18099d;
    }

    public final SemanticsInfo c() {
        return this.f18096a;
    }

    public final SemanticsNode d() {
        return new SemanticsNode(this.f18097b, false, this.f18096a, new SemanticsConfiguration());
    }

    public final void e(SemanticsInfo semanticsInfo, SemanticsConfiguration semanticsConfiguration) {
        MutableObjectList mutableObjectList = this.f18099d;
        Object[] objArr = mutableObjectList.f1937a;
        int i2 = mutableObjectList.f1938b;
        for (int i3 = 0; i3 < i2; i3++) {
            ((SemanticsListener) objArr[i3]).b(semanticsInfo, semanticsConfiguration);
        }
    }
}
