package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public interface TraversableNode extends DelegatableNode {

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f17454a = new Companion();

        @Metadata
        public enum TraverseDescendantsAction {
            ContinueTraversal,
            SkipSubtreeAndContinueTraversal,
            CancelTraversal;

            static {
                TraverseDescendantsAction[] d2;
                D = EnumEntriesKt.a(d2);
            }
        }
    }

    Object i0();
}
