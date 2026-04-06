package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.internal.SystemPropsKt;

@Metadata
public interface Channel<E> extends SendChannel<E>, ReceiveChannel<E> {

    /* renamed from: y  reason: collision with root package name */
    public static final Factory f41490y = Factory.f41491a;

    @Metadata
    public static final class DefaultImpls {
    }

    @Metadata
    public static final class Factory {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Factory f41491a = new Factory();

        /* renamed from: b  reason: collision with root package name */
        public static final int f41492b = SystemPropsKt.b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        public final int a() {
            return f41492b;
        }
    }
}
