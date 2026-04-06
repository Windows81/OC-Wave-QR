package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;

@Metadata
public interface SelectionRegistrar {

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f6936a = new Companion();
    }

    void a(long j2);

    boolean b(LayoutCoordinates layoutCoordinates, long j2, long j3, boolean z2, SelectionAdjustment selectionAdjustment, boolean z3);

    long c();

    void d();

    LongObjectMap e();

    Selectable f(Selectable selectable);

    void g(long j2);

    void h(LayoutCoordinates layoutCoordinates, long j2, SelectionAdjustment selectionAdjustment, boolean z2);

    void i(Selectable selectable);
}
