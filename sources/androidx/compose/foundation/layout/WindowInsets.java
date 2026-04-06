package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public interface WindowInsets {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f4206a = Companion.f4207a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f4207a = new Companion();
    }

    int a(Density density);

    int b(Density density, LayoutDirection layoutDirection);

    int c(Density density);

    int d(Density density, LayoutDirection layoutDirection);
}
