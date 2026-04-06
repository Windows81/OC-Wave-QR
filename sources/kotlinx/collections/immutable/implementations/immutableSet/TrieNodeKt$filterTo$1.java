package kotlinx.collections.immutable.implementations.immutableSet;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TrieNodeKt$filterTo$1 extends Lambda implements Function1<Object, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final TrieNodeKt$filterTo$1 f41307z = new TrieNodeKt$filterTo$1();

    public TrieNodeKt$filterTo$1() {
        super(1);
    }

    /* renamed from: b */
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(obj != TrieNode.f41300d.a());
    }
}
