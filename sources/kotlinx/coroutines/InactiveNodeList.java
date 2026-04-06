package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata
final class InactiveNodeList implements Incomplete {

    /* renamed from: z  reason: collision with root package name */
    public final NodeList f41413z;

    public InactiveNodeList(NodeList nodeList) {
        this.f41413z = nodeList;
    }

    public NodeList a() {
        return this.f41413z;
    }

    public boolean b() {
        return false;
    }

    public String toString() {
        return super.toString();
    }
}
