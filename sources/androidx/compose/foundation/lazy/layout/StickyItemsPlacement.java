package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntList;
import java.util.List;
import kotlin.Metadata;

@Metadata
public interface StickyItemsPlacement {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f4989a = Companion.f4990a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f4990a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static final StickyItemsPlacement f4991b = new StickyItemsPlacement$Companion$StickToTopPlacement$1();

        public final StickyItemsPlacement a() {
            return f4991b;
        }
    }

    IntList a(int i2, int i3, IntList intList);

    int b(List list, int i2, int i3, int i4, int i5, int i6, int i7, int i8);
}
