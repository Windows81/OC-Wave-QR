package kotlin.random;

import java.io.Serializable;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class PlatformRandom extends AbstractPlatformRandom implements Serializable {
    public static final Companion C = new Companion((DefaultConstructorMarker) null);

    /* renamed from: B  reason: collision with root package name */
    public final Random f40938B;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public Random l() {
        return this.f40938B;
    }
}
