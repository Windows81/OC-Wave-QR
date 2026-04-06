package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherFactory;

@Metadata
public final class MissingMainCoroutineDispatcherFactory implements MainDispatcherFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final MissingMainCoroutineDispatcherFactory f41859a = new MissingMainCoroutineDispatcherFactory();

    public String a() {
        return MainDispatcherFactory.DefaultImpls.a(this);
    }

    public MainCoroutineDispatcher b(List list) {
        return new MissingMainCoroutineDispatcher((Throwable) null, (String) null, 2, (DefaultConstructorMarker) null);
    }

    public int c() {
        return -1;
    }
}
