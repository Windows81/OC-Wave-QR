package androidx.compose.foundation.pager;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import kotlin.Metadata;

@Metadata
public interface PagerSnapDistance {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f5349a = Companion.f5350a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f5350a = new Companion();

        public final PagerSnapDistance a(int i2) {
            if (!(i2 >= 0)) {
                InlineClassHelperKt.a("pages should be greater than or equal to 0. You have used " + i2 + '.');
            }
            return new PagerSnapDistanceMaxPages(i2);
        }
    }

    int a(int i2, int i3, float f2, int i4, int i5);
}
