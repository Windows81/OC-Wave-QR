package kotlinx.serialization.descriptors;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
public interface SerialDescriptor {

    @Metadata
    public static final class DefaultImpls {
        public static List a(SerialDescriptor serialDescriptor) {
            return CollectionsKt.m();
        }

        public static boolean b(SerialDescriptor serialDescriptor) {
            return false;
        }

        public static boolean c(SerialDescriptor serialDescriptor) {
            return false;
        }
    }

    String a();

    boolean c();

    int d(String str);

    SerialKind e();

    int f();

    String g(int i2);

    List getAnnotations();

    boolean h();

    List i(int i2);

    SerialDescriptor j(int i2);

    boolean k(int i2);
}
