package kotlinx.serialization.descriptors;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.ExperimentalSerializationApi;

@Metadata
@ExperimentalSerializationApi
public abstract class StructureKind extends SerialKind {

    @Metadata
    public static final class CLASS extends StructureKind {

        /* renamed from: a  reason: collision with root package name */
        public static final CLASS f42058a = new CLASS();

        public CLASS() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata
    public static final class LIST extends StructureKind {

        /* renamed from: a  reason: collision with root package name */
        public static final LIST f42059a = new LIST();

        public LIST() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata
    public static final class MAP extends StructureKind {

        /* renamed from: a  reason: collision with root package name */
        public static final MAP f42060a = new MAP();

        public MAP() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata
    public static final class OBJECT extends StructureKind {

        /* renamed from: a  reason: collision with root package name */
        public static final OBJECT f42061a = new OBJECT();

        public OBJECT() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ StructureKind(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public StructureKind() {
        super((DefaultConstructorMarker) null);
    }
}
