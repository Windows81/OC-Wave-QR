package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

@Metadata
public abstract class ContextualProvider {

    @Metadata
    public static final class Argless extends ContextualProvider {

        /* renamed from: a  reason: collision with root package name */
        public final KSerializer f42467a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Argless(KSerializer kSerializer) {
            super((DefaultConstructorMarker) null);
            Intrinsics.i(kSerializer, "serializer");
            this.f42467a = kSerializer;
        }

        public KSerializer a(List list) {
            Intrinsics.i(list, "typeArgumentsSerializers");
            return this.f42467a;
        }

        public final KSerializer b() {
            return this.f42467a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Argless) && Intrinsics.d(((Argless) obj).f42467a, this.f42467a);
        }

        public int hashCode() {
            return this.f42467a.hashCode();
        }
    }

    @Metadata
    public static final class WithTypeArguments extends ContextualProvider {

        /* renamed from: a  reason: collision with root package name */
        public final Function1 f42468a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public WithTypeArguments(Function1 function1) {
            super((DefaultConstructorMarker) null);
            Intrinsics.i(function1, "provider");
            this.f42468a = function1;
        }

        public KSerializer a(List list) {
            Intrinsics.i(list, "typeArgumentsSerializers");
            return (KSerializer) this.f42468a.invoke(list);
        }

        public final Function1 b() {
            return this.f42468a;
        }
    }

    public /* synthetic */ ContextualProvider(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract KSerializer a(List list);

    public ContextualProvider() {
    }
}
