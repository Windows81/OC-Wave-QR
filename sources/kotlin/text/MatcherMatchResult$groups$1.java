package kotlin.text;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt;

@Metadata
public final class MatcherMatchResult$groups$1 extends AbstractCollection<MatchGroup> implements MatchNamedGroupCollection {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MatcherMatchResult f41172z;

    public MatcherMatchResult$groups$1(MatcherMatchResult matcherMatchResult) {
        this.f41172z = matcherMatchResult;
    }

    public static final MatchGroup n(MatcherMatchResult$groups$1 matcherMatchResult$groups$1, int i2) {
        return matcherMatchResult$groups$1.get(i2);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj == null ? true : obj instanceof MatchGroup)) {
            return false;
        }
        return m((MatchGroup) obj);
    }

    public int g() {
        return this.f41172z.d().groupCount() + 1;
    }

    public MatchGroup get(int i2) {
        IntRange c2 = RegexKt.f(this.f41172z.d(), i2);
        if (c2.e().intValue() < 0) {
            return null;
        }
        String group = this.f41172z.d().group(i2);
        Intrinsics.h(group, "group(...)");
        return new MatchGroup(group, c2);
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator iterator() {
        return SequencesKt.z(CollectionsKt.V(CollectionsKt.n(this)), new b(this)).iterator();
    }

    public /* bridge */ boolean m(MatchGroup matchGroup) {
        return super.contains(matchGroup);
    }
}
