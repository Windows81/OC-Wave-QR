package retrofit2;

import okhttp3.Request;

public interface Call<T> extends Cloneable {
    boolean A();

    void G0(Callback callback);

    void cancel();

    Call clone();

    Request m();
}
