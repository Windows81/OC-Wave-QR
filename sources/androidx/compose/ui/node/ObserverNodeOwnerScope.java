package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ObserverNodeOwnerScope implements OwnerScope {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f17418A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: B  reason: collision with root package name */
    public static final int f17419B = 8;
    public static final Function1 C = ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1.f17421z;

    /* renamed from: z  reason: collision with root package name */
    public final ObserverModifierNode f17420z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function1 a() {
            return ObserverNodeOwnerScope.C;
        }

        public Companion() {
        }
    }

    public ObserverNodeOwnerScope(ObserverModifierNode observerModifierNode) {
        this.f17420z = observerModifierNode;
    }

    public final ObserverModifierNode b() {
        return this.f17420z;
    }

    public boolean v0() {
        return this.f17420z.M().F2();
    }
}
