package coil.decode;

import java.io.Closeable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.BufferedSource;

@kotlin.Metadata
public abstract class ImageSource implements Closeable {

    @kotlin.Metadata
    public static abstract class Metadata {
    }

    public /* synthetic */ ImageSource(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Metadata a();

    public abstract BufferedSource b();

    public ImageSource() {
    }
}
