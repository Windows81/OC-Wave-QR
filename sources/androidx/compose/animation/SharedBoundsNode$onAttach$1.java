package androidx.compose.animation;

import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SharedBoundsNode$onAttach$1 extends Lambda implements Function0<LayoutCoordinates> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SharedBoundsNode f2311z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedBoundsNode$onAttach$1(SharedBoundsNode sharedBoundsNode) {
        super(0);
        this.f2311z = sharedBoundsNode;
    }

    /* renamed from: b */
    public final LayoutCoordinates invoke() {
        return this.f2311z.l3();
    }
}
