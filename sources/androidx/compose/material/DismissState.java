package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class DismissState extends SwipeableState<DismissValue> {

    /* renamed from: r  reason: collision with root package name */
    public static final Companion f7682r = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public DismissState(DismissValue dismissValue, Function1 function1) {
        super(dismissValue, (AnimationSpec) null, function1, 2, (DefaultConstructorMarker) null);
    }
}
