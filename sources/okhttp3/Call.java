package okhttp3;

import kotlin.Metadata;

@Metadata
public interface Call extends Cloneable {

    @Metadata
    public interface Factory {
        Call b(Request request);
    }

    boolean A();

    Response D();

    void cancel();

    void f0(Callback callback);

    Request m();
}
