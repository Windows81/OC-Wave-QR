package kotlin.text;

import kotlin.Metadata;
import kotlin.collections.AbstractList;

@Metadata
public final class MatcherMatchResult$groupValues$1 extends AbstractList<String> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MatcherMatchResult f41171A;

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return i((String) obj);
    }

    public int g() {
        return this.f41171A.d().groupCount() + 1;
    }

    public /* bridge */ boolean i(String str) {
        return super.contains(str);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return n((String) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return o((String) obj);
    }

    /* renamed from: m */
    public String get(int i2) {
        String group = this.f41171A.d().group(i2);
        return group == null ? "" : group;
    }

    public /* bridge */ int n(String str) {
        return super.indexOf(str);
    }

    public /* bridge */ int o(String str) {
        return super.lastIndexOf(str);
    }
}
