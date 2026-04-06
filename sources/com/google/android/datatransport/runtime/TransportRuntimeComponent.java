package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.Component;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import java.io.Closeable;
import javax.inject.Singleton;

@Singleton
@Component
abstract class TransportRuntimeComponent implements Closeable {

    @Component.Builder
    public interface Builder {
        Builder a(Context context);

        TransportRuntimeComponent d();
    }

    public abstract EventStore a();

    public abstract TransportRuntime b();

    public void close() {
        a().close();
    }
}
