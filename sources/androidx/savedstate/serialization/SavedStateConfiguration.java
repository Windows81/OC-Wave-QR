package androidx.savedstate.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.modules.SerializersModule;

@Metadata
public final class SavedStateConfiguration {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f22875d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final SavedStateConfiguration f22876e = new SavedStateConfiguration((SerializersModule) null, 0, false, 7, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final SerializersModule f22877a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22878b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f22879c;

    @Metadata
    public static final class Builder {
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public SavedStateConfiguration(SerializersModule serializersModule, int i2, boolean z2) {
        this.f22877a = serializersModule;
        this.f22878b = i2;
        this.f22879c = z2;
    }

    public final int a() {
        return this.f22878b;
    }

    public final boolean b() {
        return this.f22879c;
    }

    public final SerializersModule c() {
        return this.f22877a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SavedStateConfiguration(SerializersModule serializersModule, int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? SavedStateConfigurationKt.a() : serializersModule, (i3 & 2) != 0 ? 2 : i2, (i3 & 4) != 0 ? false : z2);
    }
}
