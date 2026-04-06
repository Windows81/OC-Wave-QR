package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata
final class Empty implements Incomplete {

    /* renamed from: z  reason: collision with root package name */
    public final boolean f41402z;

    public Empty(boolean z2) {
        this.f41402z = z2;
    }

    public NodeList a() {
        return null;
    }

    public boolean b() {
        return this.f41402z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(b() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
